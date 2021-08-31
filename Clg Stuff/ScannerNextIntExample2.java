import java.util.*;

public class ScannerNextIntExample2 {
    public static void main(String args[]) {
        int amount;
        int balance;

        // Insert amount and balance from console
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        amount = input.nextInt();
        System.out.print("Enter the Total Balance: ");
        balance = input.nextInt();

        // Reduce amount+fee from balance
        balance = balance - (amount + 100);
        // Print new balance
        
        System.out.print("New Balance is: " + balance);
        input.close();
    }
}