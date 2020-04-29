package cn.opm.jvm.cn.opm.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 包 名 称：cn.opm.jvm.cn.opm.proxy
 * 类 名 称：DemoProxy
 * 类 描 述：TODO ...
 * 创建时间：2020/3/10 16:30
 * 创 建 人：OPM
 */
public class DemoProxy<T> implements InvocationHandler {

    private Class<T> proxyInterface;

    public DemoProxy(Class<T> proxyInterface) {
        this.proxyInterface = proxyInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("sayHello")) {
            System.out.println("sayHllo()");
        } else if (method.getName().equals("sayHi")) {
            return "sayHI";
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public T getProxy() {
        return (T) Proxy.newProxyInstance(proxyInterface.getClassLoader(), new Class[]{proxyInterface}, this);
    }
}
