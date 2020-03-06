package cn.opm.jvm;

/**
 * @ClassName AllocationDemo
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2020/1/18 10:55
 * @Version 1.0
 * @Blame OPM Team
 */
public class AllocationDemo {
    public static final int _1M = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1M];
        allocation2 = new byte[2 * _1M];
        allocation3 = new byte[2 * _1M];
        allocation4 = new byte[10 * _1M];
    }
}
