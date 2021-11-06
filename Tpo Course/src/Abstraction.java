package src;

//* Abstraction === Abstraction is hiding the implementation details and showing only important/useful parts to the user ..

//* Data Hiding === Data hiding is the process of protecting members of class from uninteded changes ..

//* Encapsulation === It is a mechanism of wrapping the variables and methods or functions together as a single unit ..


abstract class Animal{              // Animal is irrelavant, so hiding animal from user will probably be relevant ..
    abstract void walk();           // Abstract method cannot have body ..
                                    // It has final method where child class cannot forcefully change the body of the method ..
    public void eat(){              // Abstract class can have both abstract method and non abstract method ..
        System.out.println("Animal Eats");
    }
                                    // Abstract class can have constructor and static methods ..
}

class Horse extends Animal{                 
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();        

        // Animal a = new Animal();     Its an run time error, an abstract class cannot create an object   
        // a.walk();

        h.eat();
    }
}
