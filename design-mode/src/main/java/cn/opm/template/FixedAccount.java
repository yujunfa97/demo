package cn.opm.template;

/**
 * 包 名 称：cn.opm.template
 * 类 名 称：FixedAccount
 * 类 描 述：TODO ...
 * 创建时间：2020/3/7 17:16
 * 创 建 人：OPM
 */
public class FixedAccount extends Account {
    @Override
    protected String getAccountType() {
        return "一年定期";
    }

    @Override
    protected double getInterestRate() {
        return 0.0325D;
    }
}
