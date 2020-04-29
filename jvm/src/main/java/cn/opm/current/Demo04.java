package cn.opm.current;

/**
 * @Class Demo04
 * @Description 接口的描述
 * @Author OPM
 * @Date 2020/4/5
 */
public class Demo04 {
    private static Object r1 = new Object();
    private static Object r2 = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println(Thread.currentThread() + " get r1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + " waiting get r2");
                synchronized (r2) {
                    System.out.println(Thread.currentThread() + " get r2");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (r1) {
                System.out.println(Thread.currentThread() + " get r1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + " waiting get r2");
                synchronized (r2) {
                    System.out.println(Thread.currentThread() + " get r2");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
