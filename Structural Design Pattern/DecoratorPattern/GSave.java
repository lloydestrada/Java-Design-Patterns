public class GSave extends BankAccountDecoratorImpl {

    public GSave(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.025;
    }

    @Override
    public String showBenefits() {
        return super.showBenefits() + ", GSave Transfer";
    }
}
