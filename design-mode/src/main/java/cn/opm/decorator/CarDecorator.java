package cn.opm.decorator;

/**
 * 包 名 称：cn.opm.decorator
 * 类 名 称：CarDecorator
 * 类 描 述：TODO ...
 * 创建时间：2020/3/7 15:26
 * 创 建 人：OPM
 */
public abstract class CarDecorator implements Car{
    private Car car = null;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void show() {
        this.car.show();
    }
}
