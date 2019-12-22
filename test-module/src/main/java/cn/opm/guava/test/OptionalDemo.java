package cn.opm.guava.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * @ClassName OptionalDemo
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2019/12/22
 * @Version 1.0
 * @Blame OPM Team
 */
public class OptionalDemo {
    public static final Logger LOGGER = LoggerFactory.getLogger(OptionalDemo.class);

    public static void main(String[] args) {
        Optional<Integer> optional = Optional.empty();
        LOGGER.info(String.valueOf(optional.toString()));
    }
}
