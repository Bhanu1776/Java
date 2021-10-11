class Exp6                           //! PS : Student class 
{
String name ;
int rollno;
String branch;

Exp6()
{
this("Bhanu");
}

Exp6(String name)
{
this(name,57);
}

Exp6(String name , int rollno)
{
this(name,rollno,"IT");
}

Exp6(String name,int rollno,String branch)
{
System.out.println("Student name : " +name);
System.out.println("Student roll no : " +rollno);
System.out.println("Student branch : " +branch);
}

public static void main (String args[])
{
new Exp6();
}
}