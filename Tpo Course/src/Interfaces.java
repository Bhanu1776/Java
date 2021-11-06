package src;

interface Animals{              // Interface is proper data abstraction 
    int a = 17;                 // All fields in interface is public, static and 'fixed' by default ..
    void walk();                // Interface cannot create any body in methods .. methods are public and abstract by default ..
                                // Interface cannot have any constructors 
}

interface Herbivores{

}

class Horses implements Animals, Herbivores{          //* Implements keyword is used to inherit from interface ..
    public void walk(){                               //* This is Multiple Inheritance which is not accepted by Java classes but can be done by interfaces ... IMP
        System.out.println("Horse has 4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horses h = new Horses();
        h.walk();
    }
}
