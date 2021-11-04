
public class Ex2
{
public static void main(String args[])
{
try
{
new Ex2().Exp2();

String a = "This is Programming. "; char c = a.charAt(22); System.out.println(c);
}

catch (NumberFormatException e)
{
System.out.println("Number format exception occurred"+e.getMessage());
e.printStackTrace();
}

catch (StringIndexOutOfBoundsException p)
{
System.out.println("StringIndexOutOfBoundsException"+p.getMessage()); p.printStackTrace();
}

finally
{
    System.out.println("End Of the Code");
}
}
public void Exp2() throws NumberFormatException
{
int x = Integer.parseInt("Bhanu Sunka"); System.out.println(x);
}
}
