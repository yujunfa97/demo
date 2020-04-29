package cn.opm.mybatis.redis;

import org.redisson.api.RLock;

import java.util.concurrent.TimeUnit;

/**
 * @Class DistributedLocker
 * @Description 接口的描述
 * @Author OPM
 * @Date 2020/4/28
 */
public interface DistributedLocker {

    RLock lock(String lockKey);

    RLock lock(String lockKey, long timeout);

    RLock lock(String lockKey, TimeUnit unit, long timeout);

    boolean tryLock(String lockKey, TimeUnit unit, long waitTime, long leaseTime);

    void unlock(String lockKey);

    void unlock(RLock lock);
}
