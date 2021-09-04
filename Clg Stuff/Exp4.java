import java.util.*;


public class Exp4 {
    public static void main(String[] args) {
        
        System.out.print("Enter the Customer Name: ");
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();

        System.out.print("Enter 4 digit Account Number: ");
        Scanner acc = new Scanner(System.in);
        int accno = acc.nextInt();

        System.out.print("Enter Initial balance: ");
        Scanner ib = new Scanner(System.in);
        double balance = ib.nextDouble();

        System.out.print("Enter rate of interest: ");
        Scanner ri = new Scanner(System.in);
        double interest = ri.nextDouble();

        System.out.print("Enter contact number: ");
        Scanner num = new Scanner(System.in);
        long number = num.nextLong();

        System.out.print("Enter Your Address: ");
        Scanner add = new Scanner(System.in);
        String address = add.nextLine();

        System.out.println("\n\nEnter 1 to 5 to view the following Stuff \n" +
                            "1.CreateAccount\n" + 
                            "2.Deposit\n" +
                            "3.WithDraw\n" +
                            "4.ComputeInterest\n" +
                            "5.DisplayBalance\n");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if (input>=0 && input<=5){
        
            switch(input){
                case 1:
                System.out.println("Your Account is Created !!");
                break;
                case 2:
                System.out.println("Your Amount is Deposited !!");
                break;
                case 3:
                System.out.println("You can withdraw your Amount !!");
                break;
                case 4:
                System.out.println("ComputeInterest");
                break;
                case 5:
                System.out.println("Your Account Balance is 0 , #Garib !!");
                break;

            }
        }
        else{
            System.out.println("Enter Valid Number !!!!");
        }
    }
}
