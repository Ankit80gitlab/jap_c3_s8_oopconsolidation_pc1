import java.util.Random;
public class IDBC_Bank implements CommonOperation {
    Random random = new Random();


    // common operation methods
    public void checkBalance(double amount) {
        System.out.println("The remaining balance in your account is " + amount);

    }

    public void fundTransfer() {
        System.out.println("Sorry for the inconvenience, feature is temporarily closed.");
    }

    @Override
    public void genAccNo() {
        long acc = random.nextLong(1000000000000l);
        System.out.println("Your new account number is " + acc);
    }

    public void deposit() {
        System.out.println("Sorry for the inconvenience, feature is temporarily closed.");
    }
}
