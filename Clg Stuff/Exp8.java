import java.util.*;

public class Exp8
{

static int n1=0,n2=1,n3=0;
static void Fibo(int i)
{
if (i>0)
{
n3=n1+n2;
n1=n2;
n2=n3;
System.out.print(" "+n3);
Fibo(i-1);
}
}

static void Gcd(int a,int b)
{
while(a!=b)
{
if(a>b)
{
a=a-b;
}
else
{
b=b-a;
}
}
System.out.print("GCD of a and b :" +b);
}

static void Lcm(int a,int b)
{
int c,d;
c=a;
d=b;
while(a!=b)
{
if(a>=b)
a=a-b;
else
b=b-a;
}
System.out.print("\nLCM of a and b : " +(c*d)/a);
}

static void Reverse(int n)
{
int rev=0;
while(n!=0)
{
int r =n%10;
rev = rev*10+r;
n=n/10;
}
System.out.print("Reverse of a number is : " +rev);
}

static void Sum(int n)
{
int sum=0;
for (int i=1;i<=n;i++)
sum=sum+i;
System.out.print("Sum of n numbers is : "+sum);
}


public static void main (String[]args)
{
int i;
Scanner input = new Scanner(System.in);

System.out.print("\n1.Find GCD and LCM ");
System.out.print("\n2.Print n Fibonacci numbers ");
System.out.print("\n3.Find Reverse of a number ");
System.out.print("\n4.Solve 1+2+3+4+.....+(n-1)+n /n");
System.out.print("\nSelect any one option : ");
i=input.nextInt();

switch(i)
{
case 1 : System.out.print("Enter the value of a :");
     int a = input.nextInt();
     System.out.print("Enter the value of b :");
     int b = input.nextInt();
     Gcd(a,b);
     Lcm(a,b);
     break;

case 2 : System.out.print("Enter the value of i :");
     i = input.nextInt();
      System.out.print(n1+" " +n2);
     Fibo(i-2);
     break;

case 3 : System.out.print("Enter the value of n :");
     int n = input.nextInt();
     Reverse(n);
     break;

case 4 : System.out.print("Enter the value of n : ");
      n = input.nextInt();
     Sum(n);
     break;

default : System.out.println("Invalid Choice");

}
input.close();
}
}