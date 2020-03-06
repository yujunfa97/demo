package cn.opm.demo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName ConfigApplication
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2019/12/25 15:45
 * @Version 1.0
 * @Blame OPM Team
 */
@SpringBootApplication
@EnableApolloConfig
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
