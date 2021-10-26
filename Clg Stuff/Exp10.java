import java.util.*;

class SportsPerson
{
String name;
SportsPerson()
{
	name = "Unknown";
}
SportsPerson(String n)
{
	name = n;
}
void disp_all_info()
{
	System.out.println("Name: "+name);
}
}

class Athlete extends SportsPerson
{
int no_events;
Athlete()
{
	no_events = 0;
}
Athlete(int no_eve,String n)
{
	super(n);
	no_events = no_eve;
}
void disp_all_info()
{
	System.out.println("Name: "+name);
	System.out.println("No of Events Participated: "+no_events);
}
}

class Hockey extends SportsPerson
{
int no_goals;
Hockey()
{
	no_goals = 0;
}
Hockey(int no_go,String n)
{
	super(n);
	no_goals = no_go;
}	
void disp_all_info()
{
	System.out.println("Name: "+name);
	System.out.println("No of Goals Scored: "+no_goals);
}
}

class Exp10							// Sports
{
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
Athlete a[] = new Athlete[100];
Hockey h[] = new Hockey[100];
int x = 0,ac = 0,hc = 0,no,i;

String name;
while(x != 3)
{
	System.out.println("1. Athlete \n2. Hockey Player \n3. Exit");
	System.out.print("Choose an option: ");
	x = sc.nextInt();
	sc.nextLine();

	switch(x)
	{

	case 1:
		System.out.print("Enter Athlete Name: ");
		name = sc.nextLine();
		System.out.print("Enter Number of Events Athlete Participated: ");
		no = sc.nextInt();
		a[ac] = new Athlete(no,name);
		System.out.println("--------------------------");
		ac++;
		break;

	case 2:
		System.out.print("Enter Hockey Player's Name: ");
		name = sc.nextLine();
		System.out.print("Enter Number of Goal's Scored by Player: ");
		no = sc.nextInt();
		h[hc] = new Hockey(no,name);
		System.out.println("--------------------------");
		hc++;
		break;

	case 3:
		System.out.println("Thank You for Entering Details");
		System.out.println("Displaying Details now ....");
		System.out.println("--------------------------");
		break;

	default:
		System.out.println("Please Enter correct option");
		System.out.println("--------------------------");
	}
}
// sc.close();


System.out.println("Details of Athlete's: ");

for(i = 0;i < ac;i++)
{
	System.out.println("Athlete "+(i+1)+": ");
	a[i].disp_all_info();
	System.out.println("--------------------------");
}

System.out.println("*************");
System.out.println("Details of Hockey Player: ");

for(i = 0;i < hc;i++)
{
	System.out.println("Player "+(i+1)+": ");
	h[i].disp_all_info();
	System.out.println("--------------------------");
}
}
}