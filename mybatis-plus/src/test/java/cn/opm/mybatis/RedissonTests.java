package cn.opm.mybatis;

import cn.opm.mybatis.redis.DistributedLocker;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Class RedissonTests
 * @Description 接口的描述
 * @Author OPM
 * @Date 2020/4/28
 */
@Slf4j
public class RedissonTests extends BaseTests {

    @Autowired
    private DistributedLocker lock;

    /**
     * 锁测试共享变量
     */
    private Integer lockCount = 100;

    /**
     * 无锁测试共享变量
     */
    private Integer count = 100;

    /**
     * 模拟线程数
     */
    private static int threadNum = 10;

    @Test
    public void test() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        for (int i = 0; i < threadNum; i++) {
            RedissonTests.MyRunnable myRunnable = new RedissonTests.MyRunnable(countDownLatch);
            Thread myThread = new Thread(myRunnable);
            myThread.start();
        }
        // 释放所有线程
        countDownLatch.countDown();
    }

    public class MyRunnable implements Runnable {
        /**
         * 计数器
         */
        final CountDownLatch countDownLatch;

        public MyRunnable(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            try {
                // 阻塞当前线程，直到计时器的值为0
                countDownLatch.await();
            } catch (InterruptedException e) {
                log.error(e.getMessage(), e);
            }
            // 无锁操作
            testCount();
            // 加锁操作
            testLockCount();
        }

    }

    /**
     * 加锁测试
     */
    private void testLockCount() {
        String lockKey = "lock-test";
        try {
            // 加锁，设置超时时间2s
            lock.lock(lockKey, TimeUnit.SECONDS, 2);
            lockCount--;
            log.info("lockCount值：" + lockCount);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        } finally {
            // 释放锁
            lock.unlock(lockKey);
        }
    }

    /**
     * 无锁测试
     */
    private void testCount() {
        count--;
        log.info("count值：" + count);
    }
}
