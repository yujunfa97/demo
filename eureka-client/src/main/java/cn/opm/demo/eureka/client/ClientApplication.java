package cn.opm.demo.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ClientApplication
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2019/12/24 14:46
 * @Version 1.0
 * @Blame OPM Team
 */
@SpringBootApplication
@EnableEurekaClient
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
