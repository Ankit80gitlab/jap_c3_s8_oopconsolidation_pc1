public class PayAccount extends IDBC_Bank implements Operations_Pay {

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

    public void billPayment (){
        System.out.println("Sorry for the inconvenience, feature is temporarily closed.");
    }
    public void onlineShopping (){
        System.out.println("Sorry for the inconvenience, feature is temporarily closed.");
    }

    // parameterized constructor to initialize values //

    public PayAccount(long accountNo, double balanceAmount) {
        this.accountNo=accountNo;
        this.balanceAmount=balanceAmount;

    }

    @Override
    public String toString()
    {
        return("Pay account / Account number - "+accountNo+"   "+"Balance amount - "+balanceAmount);
    }
}
