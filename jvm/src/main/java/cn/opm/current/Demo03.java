package cn.opm.current;

import lombok.SneakyThrows;

/**
 * @Class Demo03
 * @Description 接口的描述
 * @Author OPM
 * @Date 2020/4/5
 */
public class Demo03 {
    @SneakyThrows
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (!Thread.interrupted()) {

            }
            System.out.println("thread isInterrupted: " + Thread.currentThread().isInterrupted());
        });
        thread.start();
        thread.interrupt();
        thread.join();
        System.out.println("main is over");
    }
}
