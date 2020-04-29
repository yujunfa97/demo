package cn.opm.adapter;

/**
 * 包 名 称：cn.opm.adapter
 * 类 名 称：FoodAdapter
 * 类 描 述：TODO ...
 * 创建时间：2020/3/7 15:59
 * 创 建 人：OPM
 */
public class FoodAdapter extends ShuiJiao implements HunDun {
    @Override
    public void makeHunDun() {
        super.makeShuiJiao();
        System.out.println("都是面食");
    }
}
