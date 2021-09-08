import java.util.Scanner;

public class Exp2 {
    public static void main(String[] args) {

        System.out.print("Enter employee name: ");
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();

        System.out.print("Enter employee I'd : ");
        Scanner e = new Scanner(System.in);
        int empno = e.nextInt();

        System.out.print("Enter Basic Salary: ");
        Scanner b = new Scanner(System.in);
        int salary = b.nextInt();

        int CCA = 240, PT = 100;
        float DA = (((salary)*70)/100.00f);
        float HRA = (((salary)*30)/100.00f);
        float PF = (((salary)*10)/100.00f);
        float GrossSalary = salary + DA + HRA + CCA;
        float NetSalary = GrossSalary - PF - PT;

        System.out.println("\nEmployee Name : "+ name);
        System.out.println("Employee ID : "+ empno);
        System.out.println("Basic: "+salary);
        System.out.println("DA: "+DA);
        System.out.println("HRA: "+HRA);
        System.out.println("CCA: "+CCA);
        System.out.println("PT: "+PT);
        System.out.println("PF: "+PF);
        System.out.println("Gross Salary : "+ GrossSalary);
        System.out.println("Net Salary : "+ NetSalary);
    }
}