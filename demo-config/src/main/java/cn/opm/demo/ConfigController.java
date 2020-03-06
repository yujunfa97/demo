package cn.opm.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ConfigController
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2019/12/25 15:45
 * @Version 1.0
 * @Blame OPM Team
 */
@RestController
@RequestMapping("/test")
public class ConfigController {
    public static final Logger LOGGER = LoggerFactory.getLogger(ConfigController.class);
    @Value("${test:test}")
    private String test;

    @Autowired
    private SampleRedisConfig sampleRedisConfig;

    @GetMapping("/tmp")
    public String test() throws InterruptedException {
        while (!"q".equals(test)) {
            Thread.sleep(3000);
            LOGGER.info(sampleRedisConfig.toString());
        }
        return test;
    }
}
