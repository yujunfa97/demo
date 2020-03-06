package cn.opm.guava;

import java.util.Optional;

/**
 * @ClassName Demo01
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2020/1/15 14:26
 * @Version 1.0
 * @Blame OPM Team
 */
public class Demo01 {
    public static void main(String[] args) {
        Integer integer = null;
        Optional<Integer> optional = Optional.of(Optional.ofNullable(integer).orElse(2));
        System.out.println(optional.isPresent());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
    }
}
