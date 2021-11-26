import java.util.Random;
import java.util.Scanner;

class Department {
    private String Name;
    private String HOD = "BHANU SUNKA";

    Department() {
    }

    void setName(String name) {
        Name = name;
    }

    String getName() {
        return Name;
    }

    String getHOD() {
        return HOD;
    }

    void displayAfterYearHOD() {
        Random R = new Random();
        int number = R.nextInt(5) + 1;
        switch (number) {
        case 1: {
            HOD = "ROHIT SHARMA";
            System.out.println("\nHead Of Department Next Year : " + HOD);
            break;
        }
        case 2: {
            HOD = "KL RAHUL";
            System.out.println("\nHead Of Department Next Year : " + HOD);
            break;
        }
        case 3: {
            HOD = "VIRAT KOHILI";
            System.out.println("\nHead Of Department Next Year : " + HOD);
            break;
        }
        case 4: {
            HOD = "SURYAKUMAR YADAV";
            System.out.println("\nHead Of Department Next Year : " + HOD);
            break;
        }
        case 5: {
            HOD = "RISHAB PANT";
            System.out.println("\nHead Of Department Next Year : " + HOD);
            break;
        }
        default: {
            System.out.println("Default.");
        }
        }
    }
}

class Employee extends Department {
    Scanner sc = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    private int e_id;
    private String e_name;
    private double e_salary;

    Employee() {
        System.out.print("\nEnter The Employee Id : ");
        e_id = sc.nextInt();
        System.out.print("Enter The Employee Name : ");
        e_name = input.nextLine();
        System.out.print("Enter The Employee Salary : ");
        e_salary = sc.nextDouble();
        System.out.print("Enter The Employee Department : ");
        String n = input.nextLine();
        System.out.println();
        setName(n);
    }

    void employeeDetails() {
        System.out.println("ID : " + e_id);
        System.out.println("Name : " + e_name);
        System.out.println("Salary : " + e_salary);
        System.out.println("Department : " + getName());
    }

    void increamentInSalary(int year) {
        final double increament = 1000;
        double total = increament * year;
        System.out.println("Total Inncreament In The Salary After " + year + " Is " + total);
    }
}

public class A3_3 {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.employeeDetails();
        Employee E2 = new Employee();
        E2.employeeDetails();
        Department D1 = new Department();
        D1.displayAfterYearHOD();
        Department D2 = new Department();
        D2.displayAfterYearHOD();
    }
}