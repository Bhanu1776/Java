//* Write a Java program to detect whether a number entered by the user is an integer or not.

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
    System.out.print("Enter any number : ");        
    Scanner check = new Scanner(System.in);

    System.out.println(check.hasNextInt()); 

    }    
}
