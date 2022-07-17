import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        long acc2=544566464875l;
        long acc3=852461464814l;
        double amount=15000;
        double amount2=7000;

        //creating objects //
        IDBC_Bank obj1 = new IDBC_Bank();
        SaveAccount obj2 = new SaveAccount(acc2,amount);
        PayAccount obj3 = new PayAccount(acc3,amount2);

        System.out.println("------------------------------------------------------");
        System.out.println("               Welcome to The IDBC Bank               ");
        System.out.println("------------------------------------------------------");
        System.out.println("press 1 to open new account");
        System.out.println("press 2 for the saving account");
        System.out.println("press 3 for the pay account");
        System.out.println("press 4 to display all account details");
        int input=sc.nextInt();
        switch (input)
        {
            case 1:
                System.out.println("Please enter your age");
                int age= sc.nextInt();
                if (age>=18)
                {
                    System.out.println("Congratulations, you have successfully created another account");
                    obj1.genAccNo();
                    break;
                }
                else
                    System.out.println("Age must be 18 or greater than that");
                    break;

            case 2:
                System.out.println("Selected account - Saving");
                System.out.println("1.Check balance  2.Fund transfer  3.Deposit  4.Withdraw  5.Interest ");
                int input2=sc.nextInt();
                switch (input2)
                {
                    case 1:
                        obj1.checkBalance(amount);
                        break;

                    case 2:
                        obj1.fundTransfer();
                        break;

                    case 3:
                        obj1.deposit();
                        break;

                    case 4:
                        obj2.withdraw();
                        break;

                    case 5:
                        obj2.interestAmount();
                        break;
                }
                break;

            case 3:
                System.out.println("Selected account - Pay");
                System.out.println("1.Check balance  2.Fund transfer  3.Bill payment  4.Online shopping");
                int input3=sc.nextInt();
                switch (input3)
                {
                    case 1:
                        obj1.checkBalance(amount2);
                        break;

                    case 2:
                        obj1.fundTransfer();
                        break;

                    case 3:
                        obj3.billPayment();
                        break;

                    case 4:
                        obj3.onlineShopping();
                        break;
                }
                break;

            case 4:
                System.out.println("Displaying details for your accounts");
                System.out.println(obj2.toString());
                System.out.println(obj3.toString());
                break;
        }
    }
}
