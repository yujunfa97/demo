package cn.opm.demo;

import com.ctrip.framework.apollo.core.ConfigConsts;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @ClassName SpringBootRefreshConfig
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2019/12/25 16:16
 * @Version 1.0
 * @Blame OPM Team
 */
@Component
public class SpringBootRefreshConfig implements ApplicationContextAware {
    public static final Logger LOGGER = LoggerFactory.getLogger(SpringBootRefreshConfig.class);

    private final SampleRedisConfig sampleRedisConfig;
    private final RefreshScope refreshScope;
    private ApplicationContext applicationContext;

    public SpringBootRefreshConfig(SampleRedisConfig sampleRedisConfig, RefreshScope refreshScope) {
        this.sampleRedisConfig = sampleRedisConfig;
        this.refreshScope = refreshScope;
    }

/*    @ApolloConfigChangeListener(interestedKeys = {"redis.cache.port", "redis.cache.hostname"})
    public void onChange(ConfigChangeEvent changeEvent) {
        LOGGER.info("before refresh {}", sampleRedisConfig.toString());
        refreshScope.refresh("sampleRedisConfig");
        LOGGER.info("after refresh {}", sampleRedisConfig.toString());
    }*/

    @ApolloConfigChangeListener
    public void test(ConfigChangeEvent event) {
        LOGGER.error(event.changedKeys().toString());
//        this.applicationContext.publishEvent(new EnvironmentChangeEvent(event.changedKeys()));
        event.changedKeys().forEach(s -> {
            if (s.startsWith("redis.cache.")) {
                refreshScope.refreshAll();
            }
        });
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
