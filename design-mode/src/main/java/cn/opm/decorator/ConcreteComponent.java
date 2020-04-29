package cn.opm.decorator;

/**
 * 包 名 称：cn.opm.decorator
 * 类 名 称：ConcreteComponent
 * 类 描 述：具体构件
 * 创建时间：2020/3/7 15:14
 * 创 建 人：OPM
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent.operation()");
    }
}
