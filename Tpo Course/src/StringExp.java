package src;

public class StringExp {
    public static void main(String[] args) {
        
        char ch[] = {'H','i','i'};
        String s1 = new String(ch);         //* Converting char array to string  

        String s2 = new String("Welcome");  //* Creating java string by new keyword

        String s3 = "Bunny";                //* Creating string by java string literal 
        char ch2=s3.charAt(4);              //* Returns the char value at 4th index

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(ch2);
        System.out.println("String lenght is : " + s3.length());   //* To get the lenght of string, '+' sign is an concatination operator ..
        System.out.println(s3.substring(2, 4));             
        System.out.println(s3.substring(1));

        s3.concat("Bruh");              //* For concatination this method is wrong !!
        System.out.println(s3);

        s3=s3.concat(" Bruh");          //* For concatination use this method !!
        System.out.println(s3);

        s3=s3.toLowerCase();            //* All upper case letters will print in lower case ..
        System.out.println(s3);

        s3=s3.toUpperCase();            //* All Letters present in a string will print in upper case ..
        System.out.println(s3);
    }
}
