package src;

public class Temp_Class {           //* For shortcut write class and hit enter .. Now Temp_Class is new class under src package

                                    //* No main method, method3 and method4 are just created to call out in different Class 
    public static void method3(){   
        System.out.println("This is static method3 which is present under different class and has to call out in Basics class main");
    }                       //* For calling out this method in main fuction refer Basic Class program ..

    public void method4(){
        System.out.println("This is non static method which is present under different class and has to call out in Basics class main");
    }
}