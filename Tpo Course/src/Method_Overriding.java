package src;

public class Method_Overriding {        //* Changing the body of a method of a parent class by the child class and providing new body is called MethodOverriding ..
    public static void main(String[] args) {

        Child obj = new Child();
        obj.m1();
        // obj.m2();   Child cannot access bcoz m2() is private ..

    }
}

class Child extends Parent{         //* Child can have all the properties of parent class with the use of 'extends' keyword..

    public void m1(){
        super.m1();                 //* To call any method of the parent class by the child class we use 'super' keyword
        // super.m2();              // we cannot call this method coz its private ..

        System.out.println("Child can change all the properties of parent class by MethodOveriding");
    }
}

class Parent{

    public void m1(){
        System.out.println("This is public method, Child can inherit this property");
    }
    private void m2(){
        System.out.println("This is private method where Child can not inherit this property"); // Even child cannot overide if this method is declared as final method ..
    }
}
