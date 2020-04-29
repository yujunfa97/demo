package cn.opm.current;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import static java.util.concurrent.Executors.*;

/**
 * @Class Demo01
 * @Description 接口的描述
 * @Author OPM
 * @Date 2020/4/5
 */
public class Demo01 {
    @lombok.SneakyThrows
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread() + "hello");
            }
        }
        );
        thread.start();
        Thread.sleep(1000);
        System.out.println("main thread interrupt thread");
        System.out.println("1: " + thread.isInterrupted());
        thread.interrupt();
        System.out.println("2: " + thread.isInterrupted());
        thread.join();
        Thread.interrupted();
        thread.interrupt();
        System.out.println("main is over");
    }
}
