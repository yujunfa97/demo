package cn.opm.demo.test;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @ClassName StraceDemo
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2020/1/1 9:59
 * @Version 1.0
 * @Blame OPM Team
 */
public class StraceDemo {
    public static void main(String[] args) {
        StackTraceElement[] stackTraceElements = new RuntimeException().getStackTrace();
        Package tmp = StraceDemo.class.getPackage();
        System.out.println("version: " + tmp.getImplementationVersion());
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            System.out.println(stackTraceElement);
        }
        float temp = 1e-6f;
        System.out.println(temp);
    }
}
