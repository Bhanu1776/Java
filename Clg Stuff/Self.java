import java.util.Scanner;

public class Self{
    public static void main(String[] args) {
        
        int remainder;
        System.out.print("Enter the value of a: ");
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();

        System.out.println("\n\nEnter 1 to 5 to view the following Stuff \n" +
                            "1.Factorial\n" + 
                            "2.testAmstrong\n" +
                            "3.testPalindrome\n" +
                            "4.testPrime\n" +
                            "5.fibonacciSeries\n");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        switch(input){
            
            case 1:
            int factorial=1;
            for(int i=1;i<=a;i++){
                factorial *=i;
            }
            System.out.println("The factorial of a is : "+factorial);
            break;

            case 2:                 // Amstrong = Sum of the cubes of its own digits , 0 to 9 ,153,370,371,407
            int originalNum =(int)a;
            int result=0;
            while(originalNum!=0){
                remainder = (int)originalNum%10;
                result+=remainder*remainder*remainder;
                originalNum/=10;
            }
            if (result==a){
                System.out.println("Entered number is Amstrong Number !!");
            }
            else{
                System.out.println("Entered number is not Amstrong Number !!");
            }
            break;

            case 3:             // Palindrome = An Integer is palindrome if the reverse of that number is equal to original number ..
            int original;
            original = (int)a;
            int reversed = 0;
            
            while(a!=0){        // reversing input number 
                remainder = (int) a % 10;
                reversed = reversed * 10 + remainder;
                a/=10;
            }
            if (original == reversed){
                System.out.println("Entered number is Palindrome !");
            }
            else {
                System.out.println("Entered number is not Palindrome !");
            }
            break;

            case 4:         // To Check wheter entered number is prime no. or not ..
            int i;
            int flag=0;

            for (i=2;i<=a/2;++i){
                if (a % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (a == 1){
                    System.out.println("1 is neither prime nor composite.");
            }
            else {
                if (flag == 0){
                    System.out.println("Entered number is a prime number !!");
                }
                else {
                    System.out.println("Entered number is not a prime number !!");
                }
            }
            break;

            case 5:         //the next term is the sum of the previous two terms. The first two terms of the Fibonacci sequence are 0 followed by 1
                            // 0, 1, 1, 2, 3, 5, 8, 13, 21
            int n1 = 0;
            int n2 = 1;
            int sum;
    
            System.out.print(n1);
    
            for(int j=1;j<a;++j){
                
                sum = n1 + n2;
                System.out.print(", " + n2);
                n1 = n2;
                n2= sum;   
            }
            break;
        }
    }
}