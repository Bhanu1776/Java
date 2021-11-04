package src;

public class This_keyword {             //* Consider this as a Student Class

    String name;                        // These are Global variables ..
    int rollno;
    float fee;

    This_keyword(String name, int rollno, float fee){           //* Constructor, These variables are parameter variables 
        this.name=name;                                         //* 'this' keyword is used to differentiate the global variable and parameter variable ..
        this.rollno=rollno;
        this.fee=fee;
    }

    void display(){
        System.out.println(name+" "+rollno+" "+fee);            // This will Print Global variable values nor constructor variable values 
    }

    public static void main(String[] args) {
        This_keyword obj1 = new This_keyword("Bhanu", 17 , 1.5f);       // Creating object to assign values in varibales 
        This_keyword obj2 = new This_keyword("Bunny", 6 , 2.0f);        // After creating an object constructor gets called, and from there's condition values will be stored in Global varibales .. 

        obj1.display();
        obj2.display();
    }
}

/* this keyword = It is mainly used in three following conditions 

1) this can be used to refer current class instance variable ..
2) To invoke Current class method (implicitly) (indirectly, calling other func in one func by using this keyword .. exp this.m2()  )
3) To invoke current class constructor (indreclty, calling one constructor from other constructor by using this() keyword )

*/

