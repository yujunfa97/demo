package cn.opm.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaServerApplication
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2019/12/24 14:11
 * @Version 1.0
 * @Blame OPM Team
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(EurekaServerApplication.class);
        application.addListeners(new ApplicationPidFileWriter());
        application.run(args);
    }
}
