package src;
import java.util.*;                 // ArrayList func are present in this package, so dont forget to add this package 

//* Arraylist : Arraylist implements list interface and it is based on an Array data structure ..
//*             Arraylist can dynamically grow and shrink after addition and removal of elements ..

public class Arraylist {
    public static void main(String[] args) {
        
        ArrayList<String> mammals = new ArrayList<>();      //* Syntax to initilize Arraylist 

        mammals.add("Dog");             // Do add values in ArrayList
        mammals.add("Cat");
        mammals.add("Horse");

        System.out.println("Mammals are : "+mammals);
        
        mammals.add(3,"Monkey");        // This will add Monkey in 4th position


        ArrayList<String> animals = new ArrayList<>();     

        animals.add("Crocodile");

        animals.addAll(mammals);        // This will add all mammals Arraylist values in animals ArrayList !!
        System.out.println("Animals are : "+animals);
        
        animals.set(0,"Zebra");         //* set is used to replace elements at specific index position ..
        System.out.println("Replaced Animals are : "+animals);
        
        String remove = animals.remove(2);      // This will remove the element which exists on 3rd position 
        System.out.println("Final Arraylist : "+animals);
        System.out.println("Removed Element is : "+remove);

        String get = animals.get(3);
        System.out.println("Element at 4th position : "+get);
        
        System.out.println("Size of ArrayList : "+animals.size());
        
        System.out.print("Accessing Individual Elements : ");      //* Accessing all the elements using for loop 
        for(int i=0; i<animals.size(); i++){
            System.out.print(animals.get(i));
            System.out.print(", ");
        }
        System.out.println("/n");

        Collections.sort(animals);          //* Useing Collections.sort inbuilt function we can simply sort Arraylist in Alphabetical order ..
        System.out.println("Sorted Arraylist: "+animals);

        animals.clear();                //* Clear will remove all the elements present in animal arraylist
        System.out.println("Final Arraylist : "+animals);
    }
}

//* Some more methods in Arraylist :
// clone() : Creates the new arraylist with the same element, size and capacity.
// ensureCapacity() : Specifies the total element the array list can contain ..
// isEmpty() : Checks if the array list is empty or not ..
// indexOf() : Searches a specified element in an array list and returns the index of the element.
// trimToSize() : Reduces the capacity of an array list to its current size ..