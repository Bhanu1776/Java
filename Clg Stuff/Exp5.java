//* Exp 5 ..

import java.util.*;
class Rectangle {

    public double length, breadth;
    void setDim()
    {
        int l,b;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length- ");
        l= sc.nextInt();
        System.out.print("Enter the breadth- ");
        b= sc.nextInt();length=l;
        breadth=b;
    }
    void displayInformation(){
        System.out.println("\nThe length of the rectangle is "+length);
        System.out.println("The breadth of the rectangle is "+breadth);
    }
    public double getArea()
    {
        return length*breadth;
    }
}
class Exp5                      //* Area
{
    public static void main(String args[])
    {
        Rectangle aRect;
        aRect = new Rectangle();
        aRect.setDim();
        double area= aRect.getArea();
        aRect.displayInformation();
        System.out.println("\nThe area of the rectangle is "+area);
    }
}