package cn.opm.guava;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Throwables;
import com.google.common.collect.ComparisonChain;

/**
 * @ClassName ObjectsDemo
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2020/1/15 15:32
 * @Version 1.0
 * @Blame OPM Team
 */
public class ObjectsDemo {
    public static void main(String[] args) {
        System.out.println(Objects.equal("a", null));
        System.out.println(Objects.equal(null, "a"));
        System.out.println(Objects.equal("a", "a"));
        System.out.println(Objects.equal(null, null));

        int hash = Objects.hashCode("2", 1, 34, "ccc");
        System.out.println(hash);
        hash = Objects.hashCode("2", 2, 34, "ccc");
        System.out.println(hash);
        hash = Objects.hashCode("2", 3, 34, "ccc");
        System.out.println(hash);

        String tmp = MoreObjects.toStringHelper(ObjectsDemo.class).add("a", 1).addValue(120).toString();
        System.out.println(tmp);

        ComparisonChain.start().compare(1, 1);

    }
}
