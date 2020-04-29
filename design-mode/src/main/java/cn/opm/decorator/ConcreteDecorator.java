package cn.opm.decorator;

/**
 * 包 名 称：cn.opm.decorator
 * 类 名 称：ConcreteDecorator
 * 类 描 述：具体装饰
 * 创建时间：2020/3/7 15:19
 * 创 建 人：OPM
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    private void method() {
        System.out.println("ConcreteDecorator.method()");
    }

    @Override
    public void operation() {
        this.method();
        super.operation();
    }
}

