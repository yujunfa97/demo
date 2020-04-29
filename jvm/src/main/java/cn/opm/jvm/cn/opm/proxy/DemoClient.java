package cn.opm.jvm.cn.opm.proxy;

/**
 * 包 名 称：cn.opm.jvm.cn.opm.proxy
 * 类 名 称：DemoClient
 * 类 描 述：TODO ...
 * 创建时间：2020/3/10 16:35
 * 创 建 人：OPM
 */
public class DemoClient {
    public static void main(String[] args) {
        DemoProxy<IMyDemo> demoDemoProxy = new DemoProxy<>(IMyDemo.class);
        IMyDemo iMyDemo = demoDemoProxy.getProxy();
        iMyDemo.sayHello();
        System.out.println(iMyDemo.sayHi());
    }
}
