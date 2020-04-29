package cn.opm.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

/**
 * @Class RedisApplication
 * @Description 接口的描述
 * @Author OPM
 * @Date 2020/4/28
 */
@SpringBootApplication
public class RedisApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(RedisApplication.class);
        application.addListeners(new ApplicationPidFileWriter());
        application.run(args);
    }
}
