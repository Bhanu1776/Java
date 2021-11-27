import java.util.Scanner;

class LessBalanceException extends Exception {
    @Override
    public String getMessage() {
        return "Your Account Doesn't Have Much Money.Please Enter Valid Money.\n" +
                "Thank You!!!!";
    }
}

class Account {
    Scanner sc = new Scanner(System.in);
    String Name, Address, City, Phone;
    int i = 0, Pincode;
    String AccountNumber;
    double Amount = 0;
    int minimumBalance = 1000;

 Account(){
 System.out.println();
 System.out.println("##########(HDFC BANK)##########");
 System.out.println();
 System.out.print("Enter Your Name : ");
 Name = sc.nextLine();
 System.out.print("Enter Address : ");
 Address = sc.nextLine();
 System.out.print("Enter City : ");
 City = sc.nextLine();
 System.out.print("Enter Phone Number : ");
 Phone = sc.nextLine();
 System.out.print("Enter District Pincode : ");
 Pincode = sc.nextInt();
 AccountNumber = "XWER1111110"+i;
 i++;
 System.out.println("Your Account Has Been Created Successfully, Account Number :"+AccountNumber);
 Amount += minimumBalance;
 }

    void depositAmount(double rupee) {
        Amount += rupee;
        System.out.println(rupee + " Has Been Deposited In Your Account.");
    }

    void withdrawAccount(double rupee) {
        if (rupee > Amount) {
            try {
                throw new LessBalanceException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            Amount -= rupee;
            System.out.println(rupee + " Has Been Withdraw From Your Accouunt.\n" +
                    "Now Your Balance Is " + Amount);
        }
    }
}

public class A4_1 {
    public static void main(String[] args) {
        Account A1 = new Account();
        A1.depositAmount(3000);
        A1.withdrawAccount(2000);
        Account A2 = new Account();
        A2.depositAmount(2500);
        A2.withdrawAccount(4000);
    }
}