package src;

public class Exception_Handling{

    public static void main(String[] args) {
        
        try{                        // Try is assigned to certain part of the code that having some errors and still want to run further lines code ..
        int a=10;
        int b=0;
        int c=a/b;                  // b is 0, so we'll end up with Arithimatic error 
        
        System.out.println(c);      // without exception handling, The program will end up here with certain errors, next line of codes wont get run ..
                                    // so to execute further code we had to use exception handling ..
        }
        catch(Exception ex){        //* Exception is a class in which all kind of exception handlers are present .. 'ex' is a variable to get message 
            System.out.println(ex);
        }                           // After using try and catch we can still execute the fair part of the code even errors in certain part of code 
        finally{
            System.out.println("Here this code will execute wheater the program having errors or not, Clean resourced code has to be written here ");
        }
        System.out.println("Hello");
    }
}