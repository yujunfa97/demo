package cn.opm.current;

import lombok.SneakyThrows;

/**
 * @Class Demo02
 * @Description 接口的描述
 * @Author OPM
 * @Date 2020/4/5
 */
public class Demo02 {
    @SneakyThrows
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (; ; ) {

            }
        });
        thread.start();
        thread.interrupt();
        System.out.println("isInterrupt: " + thread.isInterrupted());
        System.out.println("isInterrupt: " + thread.interrupted());
        System.out.println("isInterrupt: " + Thread.interrupted());
        System.out.println("isInterrupt: " + thread.isInterrupted());
        thread.join();
        System.out.println("main is over");
    }
}
