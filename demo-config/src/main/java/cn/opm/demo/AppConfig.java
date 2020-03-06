package cn.opm.demo;

/**
 * @ClassName AppConfig
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2019/12/25 16:15
 * @Version 1.0
 * @Blame OPM Team
 */

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class AppConfig {
    @Bean
    public SampleRedisConfig config() {
        return new SampleRedisConfig();
    }
}
