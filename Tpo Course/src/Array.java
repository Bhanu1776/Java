package src;
import java.util.*;

public class Array{
    public static void main(String[] args) {
        
        int[] arr= new int[5];          //* arr is a variable where it can store upto 5 int values .. //! General syntax of declaring an array

        System.out.print("Enter 5 inputs : ");
        Scanner a = new Scanner(System.in);

        for(int i=0 ; i<=4; i++){           //* i is staring from 0 coz in arrays index no is from 0 nor 1 ..

            arr[i]= a.nextInt();            //* taking input in array ..
        }

        System.out.println("By Enhanced For loop ");

        for (int i : arr){                  //* This is enhanced for loop or we can say forEach Loop, By this way also we can print array elements ..
            System.out.println(i);
        }

        System.out.println("Array elements are : ");
        for(int i=0 ; i<=4; i++){          

            System.out.print(arr[i]+" ");
        }
        
    }
}