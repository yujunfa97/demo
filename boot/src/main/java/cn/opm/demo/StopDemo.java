package cn.opm.demo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @ClassName StopDemo
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2019/12/31 15:15
 * @Version 1.0
 * @Blame OPM Team
 */
@Component
public class StopDemo implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
