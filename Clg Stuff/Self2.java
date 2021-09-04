import java.util.Scanner;

public class Self2 {
    public static void main(String[] args) {
        
        System.out.print("Enter the speed of 1st racer : ");
        Scanner n = new Scanner(System.in);
        int r1 = n.nextInt();
        System.out.print("Enter the speed of 2st racer : ");
        int r2 = n.nextInt();
        System.out.print("Enter the speed of 3st racer : ");
        int r3 = n.nextInt();
        System.out.print("Enter the speed of 4st racer : ");
        int r4 = n.nextInt();
        System.out.print("Enter the speed of 5st racer : ");
        int r5 = n.nextInt();
        
        int avg = (r1+r2+r3+r4+r5)/5;

        System.out.println("Avg : "+avg);

        if (r1>avg){
            System.out.println("Racer 1 is Qualified with "+r1+"kmph speed");
        }
        if (r2>avg){
            System.out.println("Racer 2 is Qualified with "+r2+ "kmph speed");
        }
        if (r3>avg){
            System.out.println("Racer 3 is Qualified with "+r3+ "kmph speed");
        }
        if (r4>avg){
            System.out.println("Racer 4 is Qualified with "+r4+ "kmph speed");
        }
        if (r5>avg){
            System.out.println("Racer 5 is Qualified with "+r5+ "kmph speed");
        }
    }
}
