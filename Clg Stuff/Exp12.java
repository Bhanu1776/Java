import src.*;

import java.util.*;
public class Exp12 {
    public static void main(String[] args) {
	
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int i=s.nextInt();
        AmountInWords a1=new AmountInWords();
        System.out.println("Amount in number: "+i);
        System.out.println("Amount in words: "+a1.amountToWord(i));
        
   }
    
}