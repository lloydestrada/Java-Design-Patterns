public class UpSave extends BankAccountDecoratorImpl {

    public UpSave(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.04;
    }

    @Override
    public String showBenefits() {
        return super.showBenefits() + ", With Insurance";
    }
}
