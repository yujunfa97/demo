package cn.opm.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @ClassName SampleRedisConfig
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2019/12/25 16:12
 * @Version 1.0
 * @Blame OPM Team
 */
@ConfigurationProperties(prefix = "redis.cache")
@RefreshScope
@Component("sampleRedisConfig")
public class SampleRedisConfig {
    private int port;
    private String hostname;
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public String toString() {
        return "SampleRedisConfig{" +
                "port=" + port +
                ", hostname='" + hostname + '\'' +
                '}';
    }
}
