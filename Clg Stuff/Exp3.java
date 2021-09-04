import java.util.Scanner;

public class Exp3 {
    public static void main(String[] args) {
        
        System.out.print("Enter the value of a: ");
        Scanner n = new Scanner(System.in);
        double a = n.nextDouble();
        
        System.out.print("Enter the value of b: ");
        double b = n.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = n.nextDouble();

        double d = (b*b) - (4.0*a*c);
        double r = b/2*a;

        if (d>0){
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
            System.out.println("The roots are " + r1 + " and " + r2);  
        }  
        else   
        {  
        System.out.println("There are no real solutions !!");  
        }  
    }
}
