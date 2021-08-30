import java.util.*;

public class ScannerExample {
    public static void main(String args[]) {
        System.out.print("Enter name: ");

        // Create scanner object and read the value from the console
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int rollno;
        int marks, s1, s2, s3;
        // Insert rollno and marks from console
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Roll No: ");
        rollno = input.nextInt();
        System.out.print("Enter the marks: ");
        s1 = input.nextInt();
        s2 = input.nextInt();
        s3 = input.nextInt();
        // Print the data
        marks = s1 + s2 + s3;
        System.out.println("\n Name is: " + name);
        System.out.print("\n Roll No: " + rollno);
        System.out.print("\n Marks: " + marks);
        input.close();
    }
}
