package cn.opm.template;

/**
 * 包 名 称：cn.opm.template
 * 类 名 称：ClientAccount
 * 类 描 述：TODO ...
 * 创建时间：2020/3/7 17:17
 * 创 建 人：OPM
 */
public class ClientAccount {
    public static void main(String[] args) {
        Account account = new DemandAccount();
        System.out.println("活期利息：" + account.calculateInterest());

        account = new FixedAccount();
        System.out.println("定期利息：" + account.calculateInterest());
    }
}
