//* Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();

        System.out.print("Hello "+ name + ", Have a Good Day !!");
   }
}
