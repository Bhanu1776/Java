package src;                        //* Package named src present in java project named Tpo Course 

import java.util.*;                 //* It is pre-existing package present in jdk.. and it is used to include scanner class 


public class Basics {               //* Class named Basics from src package (First letter of Class name has to be captial and same with file name)
    
    public static void main(String[] args) {                //* Main i.e its public and static so it dont need any object to call.. 

        System.out.println("Welcome to Tpo Course");        //* sysout (used to print output), ln defines as it has to print in next line ..

        method1();                           //* method1 is an static method so it doesn't require any object to call out in main function 
        
        Basics obj1 = new Basics();         //* Basics is class name and it has to call out everytime whenever we create new object ..
        obj1.method2();                     //* obj1 is an object derived under Basics class, and method2 has to be called with an object bcoz it is non static ..

        Temp_Class.method3();               //* static Method3 occurs in different class so, to call out we had to include "classname.methodname()"

        Temp_Class obj2 = new Temp_Class();  //* New object created using different class just to call out methods that occurs in that class..
        obj2.method4();                      //* This is the way to call out methods that present under different class ..

        int x = obj1.function1();          //* To call out every function and we have to create similar data type variable and call out from that ..
        }

    public static void method1(){
        System.out.println("This is static method which doesnt need any object to call out in main function");
    }

    public void method2(){
        System.out.println("This is non static method which will require an object to call out in main function");
    }

    public int function1(){
        int a,b;
        
        System.out.print("Enter the value of a and b: ");
        Scanner s = new Scanner(System.in);         //* System.in = is input from keyboard and mouse .. and it is stored in s variable 
        a = s.nextInt();                            //* Input will be stored in a variable .. and nextInt is predefined function which is stored in java.util package ..
        b = s.nextInt();
        int c=a+b;
        System.out.println("The addition of a and b is : "+c);
        s.close();                                  //* Closing scanner variable helps to optimize memory ..
        return c;
                                       //* P.S, One function or method can call other function and method without any object only if it is present in same class ..  
    }
    public Basics(){                    //* General syntax to declare a user-defined constructor .. Constructor names are always same as Classes name
        System.out.println("This is a constructor !!");         //* Constructor doesn't need any object to call out in main function..
    }
}


//* Keywords ..

// package : which contains classe objects methods etc.

// Excess speicfier : Which is used to decide status(public or private) of class or method .. If we doesn't specify any Excess specifier to a class or method then by default it stays "DEFAULT" 
// public : Which can be accessible by any class ..
// private : Which can be only accessible by own class nor different class 
// default : If we doesn't specify any Excess specifier to a method then, that method can be accessible by all the classes of same package ..
// protected : Which can be only accessible by Child Class ..

// child class : The class which inherits properties from Parent class .. extends keyword is used to create a child class 
// void : which does not return any value .. 
// String[] args : It is command line argument which is used during run time and its mandotary to include everytime while writing main func unlike C#
// obj1 and obj2 : These are objects which are created under Basics Class .. objects are also called as instance .. As soon as we create an object a constructor is called !
// method : Indirectly its a function but it has to be void only !! If we use other dataypes then it is known as function ..
// system.out.println : It is used to print output ..