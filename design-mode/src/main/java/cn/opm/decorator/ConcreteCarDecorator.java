package cn.opm.decorator;

/**
 * 包 名 称：cn.opm.decorator
 * 类 名 称：ConcreteCarDecorator
 * 类 描 述：TODO ...
 * 创建时间：2020/3/7 15:28
 * 创 建 人：OPM
 */
public class ConcreteCarDecorator extends CarDecorator {
    public ConcreteCarDecorator(Car car) {
        super(car);
    }

    private void print() {
        System.out.println("绘制...");
    }

    private void setGps() {
        System.out.println("安装Gps定位导航");
    }

    @Override
    public void show() {
        this.print();
        super.show();
        this.setGps();
    }
}
