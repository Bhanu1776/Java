package src;

public class Variables {
    
    int a;            //* Global variable : It can be accessible by any methods or functions .. Therefore it consumes hell of memory .. Global varible is also called as instance variable 
                      //* If we don't assign any value to global variables then by default its value will be 0 ..

    static int b;       //* If we create global static variable then, that variable can access by only one object in the memory.. no other objects can access as a copy ..
                        //* Static variable is also called as Class variable ..
    public static void main(String[] args) {

        Variables obj1 = new Variables();       //* Class objects are also called as instance ..
        obj1.m1();
    }

    public void m1(){

        int c,d;            //* Local varible : It can be only accessible by same method or function .. cannot accessible by different methods or function present in same class
        System.out.println(a);
    }
}
