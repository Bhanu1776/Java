package src;

//* Polymorphism : One object which exist in many forms is called polymorphism ... Compile Time Polymorphism 

public class Polymorphism {

    public static void main(String[] args) {
        
        Overloading obj = new Overloading();
        obj.m1(10);
        obj.m1("bhanu");
    }
}

    class Overloading{

       
//*     1) Method Overloading : If no.of parameters, sequence of paremeters and datatype of parameters are different in same class then Method overloading exists ..

        public void m1(int x){                    // Here both methods having same name but different parameters thats why it comes under MethodOverloading 
            System.out.println("Integer is passed");
        }
        public void m1(String str){
            System.out.println("String is passed");
        }
    }