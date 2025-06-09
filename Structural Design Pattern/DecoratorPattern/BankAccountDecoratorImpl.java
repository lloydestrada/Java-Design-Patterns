public class BankAccountDecoratorImpl implements BankAccountDecorator {
    private BankAccount bankAccount;

    public BankAccountDecoratorImpl(BankAccount bankAccount) {
        setBankAccount(bankAccount);
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "Decorator";
    }

    @Override
    public Double getInterestRate() {
        return 0.0; // Default implementation for the decorator
    }

    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return this.bankAccount.showBenefits() + ", Decorator Benefits";
    }

    @Override
    public Double computeBalanceWithInterest() {
        return this.bankAccount.computeBalanceWithInterest();
    }

    @Override
    public String showInfo() {
        return this.bankAccount.showInfo();
    }
}
