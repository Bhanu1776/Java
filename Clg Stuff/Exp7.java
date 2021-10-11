import java.util.*;
public class Exp7
{
public static void main(String[]args)
{
    
Vector<String> vec = new Vector<String>();

vec.add("Physics");
vec.add("Chemistry");
vec.add("Maths");
vec.add("Biology");
vec.add("English");

System.out.println("Vector elements are : "+vec);

Scanner sc = new Scanner(System.in);

System.out.print("Enter the element you want to check : ");
String Subject = sc.nextLine();

if (vec.contains(Subject))
{
System.out.println(Subject + " is present");
vec.remove(Subject);
System.out.println("Vector elements are after removing this element  : "+vec);
}

else
{
System.out.println(Subject + " is not present");
vec.addElement(Subject);
System.out.println("Vector elements are after adding new element  : "+vec);
}
}
}