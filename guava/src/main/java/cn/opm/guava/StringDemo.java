package cn.opm.guava;

import com.google.common.base.Joiner;

import java.net.SocketTimeoutException;

/**
 * @ClassName StringDemo
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2020/1/17 22:20
 * @Version 1.0
 * @Blame OPM Team
 */
public class StringDemo {
    public static void main(String[] args) {
        Joiner joiner = Joiner.on(";").useForNull("123");
        String tmp = joiner.join("123", null, "123", 123123);
        System.out.println(tmp);
        String[] test = ",a,,b,".split(",");
        System.out.println(test.length);
        for (String s : test) {
            System.out.print(s);
        }
    }
}
