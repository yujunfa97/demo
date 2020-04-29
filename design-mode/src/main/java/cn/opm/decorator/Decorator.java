package cn.opm.decorator;

/**
 * 包 名 称：cn.opm.decorator
 * 类 名 称：Decorator
 * 类 描 述：装饰角色
 * 创建时间：2020/3/7 15:16
 * 创 建 人：OPM
 */
public abstract class Decorator implements Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        this.component.operation();
    }
}
