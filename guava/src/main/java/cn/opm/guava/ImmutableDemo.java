package cn.opm.guava;

import com.google.common.collect.*;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName ImmutableDemo
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2020/1/16 8:56
 * @Version 1.0
 * @Blame OPM Team
 */
public class ImmutableDemo {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("会议[新版上传校验测试6]的议题[新版上传校验测试6--董事会]中事项决策顺序错误");
        strings.add("会议[新版上传校验测试6]的议题[新版上传校验测试6--董事会]中事项决策顺序错误");
        strings.add("会议[新版上传校验测试6]的议题[新版上传校验测试6--董事会]中事项决策顺序错123误");
        System.out.println(strings);
        StringBuffer stringBuffer = new StringBuffer();
        AtomicInteger index = new AtomicInteger(0);
        strings.forEach(s -> {
            if (index.getAndIncrement() != strings.size() - 1) {
                stringBuffer.append(s).append("\n");
            } else {
                stringBuffer.append(s);
            }
        });
        System.out.println(stringBuffer.toString());

        Multiset<String> tmp = HashMultiset.create(16);
        tmp.add("Tom");
        tmp.add("Bob");
        tmp.add("Tom");
        System.out.println(tmp.count("Bob"));
        tmp.forEach(System.out::println);
        System.out.println(tmp.toString());

        Multimap<String, String> multimap = HashMultimap.create();
        multimap.put("Tom", "A");
        multimap.put("Tom", "A");
        multimap.put("Tom", "B");
        multimap.put("Bob", "b");
        multimap.put("Tom", "C");
        multimap.get("Tom").forEach(System.out::println);
        System.out.println(multimap);

        System.out.println(multimap.size());
        System.out.println(multimap.asMap().size());
    }
}
