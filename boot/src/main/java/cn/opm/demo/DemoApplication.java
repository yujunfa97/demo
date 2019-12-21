package cn.opm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

/**
 * @ClassName DemoApplication
 * @Description 我的Demo启动类
 * @Author OPM
 * @Date 2019/12/19
 * @Version 1.0
 * @Blame OPM Team
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DemoApplication.class);
        application.addListeners(new ApplicationPidFileWriter());
        application.run(args);

    }
}
