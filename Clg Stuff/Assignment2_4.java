import java.util.*;
public class Assignment2_4 {
    public static<T> List<T> reverseList(List<T> list)
    {
        List<T> rev = new ArrayList<>(list.size());
 
        for (int i = list.size() - 1; i >= 0; i--) {
            rev.add(list.get(i));
        }
 
        return rev;
    }
    public static void main(String[] args) {
       
        ArrayList<Integer> number=new ArrayList<>();
        number.add(2);
        number.add(8);
        number.add(3);
        number.add(7);
        number.add(8);
        number.add(1);
        System.out.println("Array list before reversing:"+number);
        
        
        List<Integer> rev = reverseList(number);
        System.out.println("Array list After reversing:"+rev);
    }
}