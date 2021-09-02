import java.util.Scanner;

//*  Write a program to calculate the percentage of a given student in the CBSE board exam.
//*  His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)

public class Scanner_1 {
    public static void main(String[] args) {
        System.out.print("Enter the Name of student = ");
        Scanner s = new Scanner(System.in); 
        String n = s.nextLine();

        System.out.print("Enter the marks of physics = ");       
        int p = s.nextInt();
        System.out.print("Enter the marks of Chemistry = ");       
        int c = s.nextInt();
        System.out.print("Enter the marks of Maths = ");       
        int m = s.nextInt();
        System.out.print("Enter the marks of Biology = ");       
        int b = s.nextInt();
        System.out.print("Enter the marks of English = ");       
        int e = s.nextInt();

        int sum = p+c+m+b+e;

        float percentage = (float)(sum*100)/500;

        System.out.print("The percentage of "+ n);
        System.out.print(" is : "+percentage);

    }
}
