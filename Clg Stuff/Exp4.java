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
        
        
        System.out.println("\n\nEnter 1 to 4 to view the following Stuff \n" +
        "1.Deposit\n" +
        "2.WithDraw\n" +
        "3.ComputeInterest\n" +
        "4.DisplayBalance\n");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        
        if(input==1){
        System.out.println("\n\nFirst you need to an Create account");
        System.out.print("Enter your name to Create an account: ");
        String na = n.nextLine();
        System.out.println("\nYour Account is created with " + na + " account holder name.");
        }
        
        if (input>=0 && input<=4){
        
            switch(input){

                case 1:
                System.out.print("Enter the Amount you want to Deposit: ");
                int dep = acc.nextInt();
                double d = balance + dep;
                System.out.println("Your Amount is successfully Deposited !!");
                System.out.println("Your Final Balance is = "+ d +"rs");
                break;

                case 2:
                System.out.print("Enter the Amount you want to withdraw: ");
                int with = acc.nextInt();
                double w = balance - with;
                if (with > balance){
                    System.out.println("Withdraw amout is Greater than Balance\n"+"Please Enter Valid Amount for withdrawl !!");
                }
                else{
                System.out.println("Your Amount is withdrawn successfully !!");
                System.out.print("Your Final Balance is " + w + "rs");
                }
                break;

                case 3:
                System.out.print("Enter Time Period in Years: ");
                int time = acc.nextInt();
                double i = (balance*time*interest)/100;
                System.out.println("Calculated interest is: "+i);
                break;

                case 4:
                System.out.println("Your Account Balance is: "+balance+ "rs");
                break;

            }
        }
        else{
            System.out.println("Enter Valid choice !!!!");
        }
        n.close();
        acc.close();
        ib.close();
        ri.close();
        num.close();
        add.close();
        in.close();
    }
}
