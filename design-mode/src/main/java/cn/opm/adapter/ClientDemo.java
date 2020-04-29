package cn.opm.adapter;

/**
 * 包 名 称：cn.opm.adapter
 * 类 名 称：ClientDemo
 * 类 描 述：TODO ...
 * 创建时间：2020/3/7 16:00
 * 创 建 人：OPM
 */
public class ClientDemo {
    public static void main(String[] args) {
        HunDun hunDun = new FoodAdapter();
        hunDun.makeHunDun();
    }
}
