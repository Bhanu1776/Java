class Overload
{
    void Value(int x,int y)
    {
    int a = x; int b = y;
    int sum = a+b;
    System.out.println("The sum of "+a+" and "+b+" is: "+sum);
    }
    void Value(String x)
    {
    System.out.println("The String is: "+x);
    }
    void Value(int x,double y)
    {
    System.out.println("The value of X: "+x+" and Y: "+y);
    }
    void Value(double x,int y)
    {
    System.out.println("The value of X: "+x+" and Y: "+y);
    }
    double Value(int x)
    {
    return(x*x);
    }
    }
    class OverloadDemo
    {
    public static void main(String []args)
    {
    Overload o = new Overload();
    o.Value(5,10);
    o.Value("ABC");
    o.Value(24,10.8);
    o.Value(36.8,46);
    double res = o.Value(10);
    System.out.println("The value of o.Value(10) is: "+res);
    }
    }