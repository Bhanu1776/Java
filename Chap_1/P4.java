//* Write a Java program to convert Kilometers to miles.

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        System.out.print("Enter the lenght in kilometers : ");
        Scanner len = new Scanner(System.in);
        float lenght = len.nextFloat();

        double mile = (lenght)/1.609;

        System.out.println("Your Lenght in miles is: " + mile);
    }
}