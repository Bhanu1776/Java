//* Write a program to calculate CGPA using marks of three subjects (out of 100) 

public class P2 {
    public static void main(String[] args) {
        float physics = 34;
        float chemistry = 57;
        float maths = 87;

        float cgpa = (physics + chemistry + maths)/3;

        System.out.println("Your CGPA is = "+ cgpa);
    }    
}
