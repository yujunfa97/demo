package cn.opm.decorator;

/**
 * 包 名 称：cn.opm.decorator
 * 类 名 称：CarClient
 * 类 描 述：TODO ...
 * 创建时间：2020/3/7 15:29
 * 创 建 人：OPM
 */
public class CarClient {
    public static void main(String[] args) {
        Car car = new Benz();
        car = new ConcreteCarDecorator(car);
        car.show();
    }
}
