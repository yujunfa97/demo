package cn.opm.mybatis;

import cn.opm.mybatis.redis.DistributedLocker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Class RedisController
 * @Description 接口的描述
 * @Author OPM
 * @Date 2020/4/28
 */
@RestController
@RequestMapping("/redisson")
@Slf4j
public class RedisController {

    @Autowired
    private DistributedLocker lock;

    /**
     * 锁测试共享变量
     */
    private volatile Integer lockCount = 0;

    /**
     * 无锁测试共享变量
     */
    private volatile Integer count = 0;

    /**
     * 模拟线程数
     */
    private static int threadNum = 10;

    /**
     * 模拟并发测试加锁和不加锁
     *
     * @return
     */
    @GetMapping("/test")
    public void lock() {
        // 计数器
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        for (int i = 0; i < threadNum; i++) {
            Thread myThread = new Thread(() -> {
                try {
                    // 阻塞当前线程，直到计时器的值为0
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    log.error(e.getMessage(), e);
                }
                // 无锁操作
                testCount();
            });
            myThread.start();
        }
        for (int i = 0; i < threadNum; i++) {
            Thread myThread = new Thread(() -> {
                try {
                    // 阻塞当前线程，直到计时器的值为0
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    log.error(e.getMessage(), e);
                }
                // 无锁操作
                testLockCount();
            });
            myThread.start();
        }
        countDownLatch.countDown();
    }

    /**
     * 加锁测试
     */
    private void testLockCount() {
        String lockKey = "lock-test";
        for (int i = 0; i < 10; i++) {
            try {
                // 加锁，设置超时时间2s
                lock.lock(lockKey, TimeUnit.SECONDS, 2);
                lockCount++;
                log.info("lockCount值：" + lockCount + ", time: " + System.currentTimeMillis());
            } catch (Exception e) {
                log.error(e.getMessage(), e);
            } finally {
                // 释放锁
                lock.unlock(lockKey);
            }
        }
    }

    /**
     * 无锁测试
     */
    private void testCount() {
        for (int i = 0; i < 10; i++) {
            count++;
            log.info("count值：" + count + ", time: " + System.currentTimeMillis());
        }
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
                Thread.sleep(200);
            } catch (InterruptedException e) {
                log.error(e.getMessage(), e);
            }
            // 无锁操作
            testCount();
        }

    }
}
