package cn.opm.template;

/**
 * 包 名 称：cn.opm.template
 * 类 名 称：Account
 * 类 描 述：TODO ...
 * 创建时间：2020/3/7 17:10
 * 创 建 人：OPM
 */
public abstract class Account {
    private String accountNumber;

    public Account() {
        this.accountNumber = null;
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    protected abstract String getAccountType();

    protected abstract double getInterestRate();

    public double calculateAmount(String accountType, String accountNumber) {
        // ...
        return 4567.00D;
    }

    public double calculateInterest() {
        String accountType = this.getAccountType();
        double interestRate = this.getInterestRate();
        double amount = this.calculateAmount(accountType, accountNumber);
        return amount * interestRate;
    }
}
