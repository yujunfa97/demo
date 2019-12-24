package cn.opm.guava.test;

import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName PreconditionsDemo
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2019/12/22
 * @Version 1.0
 * @Blame OPM Team
 */
public class PreconditionsDemo {
    public static final Logger LOGGER = LoggerFactory.getLogger(Preconditions.class);
    public static void main(String[] args) {
        String tmp = System.getProperty("test");
        System.out.println(tmp);
    }
}
