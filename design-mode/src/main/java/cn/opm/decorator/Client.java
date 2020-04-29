package cn.opm.decorator;

/**
 * 包 名 称：cn.opm.decorator
 * 类 名 称：Client
 * 类 描 述：装饰器测试类
 * 创建时间：2020/3/7 15:21
 * 创 建 人：OPM
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator(component);
        component.operation();
    }
}
