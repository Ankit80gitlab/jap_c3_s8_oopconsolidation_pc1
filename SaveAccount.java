public class SaveAccount extends IDBC_Bank implements Operations_Save {

    // initializing variables //
    private long accountNo;
    private double balanceAmount;

    // getter setter method //
    public void setAccountNo (long accountNo) {
        this.accountNo=accountNo;
    }
    public long getAccountNo() {
        return accountNo;
    }

    public void setBalanceAmount (double balanceAmount) {
        this.balanceAmount=balanceAmount;
    }
    public double getBalanceAmount() {
        return balanceAmount;
    }

    // interface class OperationSave method

    public void interestAmount() {
        double interest1=balanceAmount*interestRate;
        System.out.println("The interest amount for your principle amount is - "+interest1);
    }

    public void withdraw() {
        System.out.println("Sorry for the inconvenience, feature is temporarily closed.");

    }

    // parameterized constructor to initialize values //

    public SaveAccount(long accountNo, double balanceAmount) {
        this.accountNo=accountNo;
        this.balanceAmount=balanceAmount;

    }

    @Override
    public String toString()
    {
        return("Saving account / Account number - "+accountNo+"   "+"Balance amount - "+balanceAmount);
    }
}
