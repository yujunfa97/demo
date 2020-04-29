package cn.opm.ybbc.ch3;

/**
 * @Class Demo01
 * @Description 接口的描述
 * @Author OPM
 * @Date 2020/4/26
 */
public class Demo01 {
    public static void main(String[] args) {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println(availableProcessors);
        long freeMemory = Runtime.getRuntime().maxMemory();
        System.out.println(freeMemory);
    }
}
