package src;

//* Inheritance === The child class which inherit properties from parent class is known as Inheritance .. Parent class is also known as Base class and Child class is also known as Derived class
                    // Inheritance is a RunTime Polymorphism 

class Shape{                                    // Shape class is a Parent Class(Base)
    public void area(){
        System.out.println("Display Area ");
    }
}

class Triangle extends Shape{                   // Triangle is a Derived class which inheriting properties from Base class ... 
    public void area(int l, int b){             //* Single Level Inheritance 
        System.out.println(1/2*l*b);
    }
}

class EquilateralTriangle extends Triangle {    // EquilateralTriangle is a Derived class which inheriting properites from another Derived Class ..
    public void area (int l, int b){            //* Multilevel Inheritance 
        System.out.println(1/2*l*b);
    }
} 

class Circle extends Shape {                    // Circle is a Derived class which inheriting properties from Base class .. 
    public void area(int r){                    //* Hierarchical Inheritance 
        System.out.println((3.14)*r);
    }
}

//* 4) Hybrid Inheritance .. Combination of all 3 inheritance is known as Hybrid Inheritance 

//* Note : Multiple Inheritance .. Multiple inheritance is not supported in java through classes, only supports in C++ ... Interface is alternative of Multiple Inheritance in Java

public class Inheritance {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.area();
    }
}
