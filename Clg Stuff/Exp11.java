import java.util.*;

interface Vehicle
{
	public void showdata();
}

class Bicycle implements Vehicle
{
	String company,model;
	double max_speed;
	Bicycle()
	{
		company = "Unknown";
		model = "Unknown";
		max_speed = 0;
	}
	Bicycle(String com, String mod, double max_speed)
	{
		company = com;
		model = mod;
		this.max_speed = max_speed;
	}

	public void showdata()
	{
		System.out.println("Company: "+company);
		System.out.println("Model: "+model);
		System.out.println("Maximum Speed: "+max_speed+"km/h");
		System.out.println("----------------------------------");
	}
}

class Bike implements Vehicle
{
	String company,model;
	double max_speed;
	Bike()
	{
		company = "Unknown";
		model = "Unknown";
		max_speed = 0;
	}
	Bike(String com, String mod, double max_speed)
	{
		company = com;
		model = mod;
		this.max_speed = max_speed;
	}
	public void showdata()
	{
		System.out.println("Company: "+company);
		System.out.println("Model: "+model);
		System.out.println("Maximum Speed: "+max_speed+"km/h");
		System.out.println("----------------------------------");
	}
}

class Car implements Vehicle
{
	String company,model;
	double max_speed;
	Car()
	{
		company = "Unknown";
		model = "Unknown";
		max_speed = 0;
	}
	Car(String com, String mod, double max_speed)
	{
		company = com;
		model = mod;
		this.max_speed = max_speed;
	}
	public void showdata()
	{
		System.out.println("Company: "+company);
		System.out.println("Model: "+model);
		System.out.println("Maximum Speed: "+max_speed+"km/h");
		System.out.println("----------------------------------");
	}
}

class Exp11                     //Road
{
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
Bicycle bi[] = new Bicycle[100];
Bike b[] = new Bike[100];
Car c[] = new Car[100];
String co,m;
double m_s;
int i,c_bi = 0,c_b = 0,c_c = 0,check = 0;

while(check != 7)
{
	System.out.println("1. Add new Bicycle");
	System.out.println("2. Add new Bike");
	System.out.println("3. Add new Car");
	System.out.println("4. Get all Bicycle details");
	System.out.println("5. Get all Bike details");
	System.out.println("6. Get all Car details");
	System.out.println("7. Exit");
	System.out.print("Enter your choice: ");
	check = sc.nextInt();
	sc.nextLine();


	switch(check)
	{

	case 1:
		System.out.print("Enter Company name: ");
		co = sc.nextLine();
		System.out.print("Enter Model name or number: ");
		m = sc.nextLine();
		System.out.print("Enter Maximum Speed in km/hr: ");
		m_s = sc.nextDouble();
		bi[c_bi] = new Bicycle(co,m,m_s);
		c_bi += 1;
		System.out.println("****************");
		break;

	case 2:
		System.out.print("Enter Company name: ");
		co = sc.nextLine();
		System.out.print("Enter Model name or number: ");
		m = sc.nextLine();
		System.out.print("Enter Maximum Speed in km/hr: ");
		m_s = sc.nextDouble();
		b[c_b] = new Bike(co,m,m_s);
		c_b += 1;
		System.out.println("****************");
		break;

	case 3:
		System.out.print("Enter Company name: ");
		co = sc.nextLine();
		System.out.print("Enter Model name or number: ");
		m = sc.nextLine();
		System.out.print("Enter Maximum Speed in km/hr: ");
		m_s = sc.nextDouble();
		c[c_c] = new Car(co,m,m_s);
		c_c += 1;
		System.out.println("****************");
		break;

	case 4:
		for(i = 0;i < c_bi;i++)
		{
			System.out.println("Bicycle "+(i+1)+" Details are: ");
			bi[i].showdata();
		}
		System.out.println("****************");
		break;

	case 5:
		for(i = 0;i < c_b;i++)
		{
			System.out.println("Bike "+(i+1)+" Details are: ");
			b[i].showdata();
		}
		System.out.println("****************");
		break;

	case 6:
		for(i = 0;i < c_c;i++)
		{
			System.out.println("Car "+(i+1)+" Details are: ");
			c[i].showdata();
		}
		System.out.println("****************");
		break;

	case 7:
		System.out.println("Thank you...");
		System.out.println("****************");
		break;
        
	default:
		System.out.println("Enter correct choice...");
		System.out.println("****************");
	}
}
sc.close();
}
}