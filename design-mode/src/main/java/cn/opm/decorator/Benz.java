package cn.opm.decorator;

/**
 * 包 名 称：cn.opm.decorator
 * 类 名 称：Benz
 * 类 描 述：TODO ...
 * 创建时间：2020/3/7 15:25
 * 创 建 人：OPM
 */
public class Benz implements Car {
    @Override
    public void show() {
        System.out.println("奔驰的默认颜色是黑色");
    }
}
