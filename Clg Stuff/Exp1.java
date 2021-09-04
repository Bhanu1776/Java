import java.util.Scanner;

public class Exp1 {
    public static void main(String args[]) {
        System.out.print("Enter name: ");

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int rollno;
        int marks, s1, s2, s3,s4,s5;

        System.out.print("Enter branch: ");
        Scanner b = new Scanner(System.in);
        String branch = b.nextLine();


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Roll No: ");
        rollno = input.nextInt();
        System.out.println("\nEnter the marks of 5 subjects \n");
        System.out.print("Enter marks in physics: ");
        s1 = input.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        s2 = input.nextInt();
        System.out.print("Enter marks in Maths: ");
        s3 = input.nextInt();
        System.out.print("Enter marks in Biology: ");
        s4 = input.nextInt();
        System.out.print("Enter marks in English: ");
        s5 = input.nextInt();


        System.out.println("\n Name is: " + name);
        System.out.println(" Roll No: " + rollno);
        System.out.println(" Branch: " + branch);
        System.out.println("\nMarks in Physics: " + s1);
        System.out.println("Marks in Chemistry: " + s2);
        System.out.println("Marks in Maths: " + s3);
        System.out.println("Marks in Biology: " + s4);
        System.out.println("Marks in English: " + s5);

        input.close();
    }
}
