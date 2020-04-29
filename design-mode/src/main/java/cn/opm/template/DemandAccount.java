package cn.opm.template;

/**
 * 包 名 称：cn.opm.template
 * 类 名 称：DemandAccount
 * 类 描 述：TODO ...
 * 创建时间：2020/3/7 17:15
 * 创 建 人：OPM
 */
public class DemandAccount extends Account {
    @Override
    protected String getAccountType() {
        // ...
        return "活期";
    }

    @Override
    protected double getInterestRate() {
        // ...
        return 0.005D;
    }
}
