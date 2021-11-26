import java.util.Scanner;

class Student {
    Scanner input = new Scanner(System.in);
    String Name;
    int age;
    String Programme;

    Student() {
    }

    Student(String n, int a, String p) {
        Name = n;
        age = a;
        Programme = p;
    }

    void displayInfo() {
        System.out.print("Name Of The Student : " + Name);
        System.out.print("Age Of The Student : " + age);
        System.out.print("Programme Of The Student : " + Programme);
    }
}

class GraduateStudents extends Student {
    double POM;
    String Stream;

    GraduateStudents(String n, int a, String p, double d, String S) {
        super(n, a, p);
        POM = d;
        Stream = S;
    }

    void toUpadte() {
        int Number, i, index;
        System.out.print("How Many Things You Want To Update : ");
        Number = input.nextInt();
        System.out.println("INDEX : DATA");
        System.out.println(" 1 : Name");
        System.out.println(" 2 : Age");
        System.out.println(" 3 : Programme");
        System.out.println(" 4 : Percentage Of Marks");
        System.out.println(" 5 : Stream");
        for (i = 1; i <= Number; i++) {
            System.out.println("Enter The Index You Want You Update.");
            index = input.nextInt();
            switch (index) {
            case 1: {
                System.out.print("Input Updated Name : ");
                String N = input.nextLine();
                super.Name = N;
                break;
            }
            case 2: {
                System.out.print("Input Updated Age : ");
                int a = input.nextInt();
                super.age = a;
                break;
            }
            case 3: {
                System.out.print("Input Updated Programme : ");
                String N = input.nextLine();
                super.Programme = N;
                break;
            }
            case 4: {
                System.out.print("Input Updated Percentage Of Marks : ");
                double a = input.nextDouble();
                POM = a;
                break;
            }
            case 5: {
                System.out.print("Input Updated Stream : ");
                String N = input.nextLine();
                Stream = N;
                break;
            }
            default: {
                System.out.print("Input Valid Index.");
            }
            }
        }
    }

    void displayInfo() {
        System.out.println("Name Of The Student : " + Name);
        System.out.println("Age Of The Student : " + age);
        System.out.println("Programme Of The Student : " + Programme);
        System.out.println("Percentage Of Marks Of The Student : " + POM);
        System.out.println("Stream Of The Student : " + Stream);
    }
}

class ResearchStudents extends Student {
    String Specialization;
    int YearOfWorkingExp;

    ResearchStudents(String n, int a, String p, int y, String S) {
        super(n, a, p);
        Specialization = S;
        YearOfWorkingExp = y;
    }

    void toUpadte() {
        int Number, i, index;
        System.out.print("How Many Things You Want To Update : ");
        Number = input.nextInt();
        System.out.println("INDEX : DATA");
        System.out.println(" 1 : Name");
        System.out.println(" 2 : Age");
        System.out.println(" 3 : Programme");
        System.out.println(" 4 : YearOfExperiance");
        System.out.println(" 5 : Special Subject");
        for (i = 1; i <= Number; i++) {
            System.out.println("Enter The Index You Want You Update.");
            index = input.nextInt();
            switch (index) {
            case 1: {
                System.out.print("Input Updated Name : ");
                String N = input.nextLine();
                super.Name = N;
                break;
            }
            case 2: {
                System.out.print("Input Updated Age : ");
                int a = input.nextInt();
                super.age = a;
                break;
            }
            case 3: {
                System.out.print("Input Updated Programme : ");
                String N = input.nextLine();
                super.Programme = N;
                break;
            }
            case 4: {
                System.out.print("Input Updated Year Of Experiance : ");
                int a = input.nextInt();
                YearOfWorkingExp = a;
                break;
            }
            case 5: {
                System.out.print("Input Updated Special Subject : ");
                String N = input.nextLine();
                Specialization = N;
                break;
            }
            default: {
                System.out.print("Input Valid Index.");
            }
            }
        }
    }

    void displayInfo() {
        System.out.println("Name Of The Student : " + Name);
        System.out.println("Age Of The Student : " + age);
        System.out.println("Programme Of The Student : " + Programme);
        System.out.println("Specialization Of The Student : " + Specialization);
        System.out.println("Year Of Working Experiance Of The Student : " + YearOfWorkingExp);
    }
}

public class A3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        GraduateStudents G1;
        ResearchStudents R1;
        int select;
        System.out.println("A Student Is : \n 1. Graduate Student.\n" + " 2. Reasearch Student.");
        System.out.print("\nSelect Student Field 1 OR 2 - ");
        select = input.nextInt();
        switch (select) {
        case 1: {
            String name, prog, stream;
            int ag, update;
            double d;
            System.out.println("you have selected GRADUATE STUDENT.");
            System.out.print("\nEnter The Name Of The Student : ");
            name = sc.nextLine();
            System.out.print("Enter The Age Of The Student : ");
            ag = input.nextInt();
            System.out.print("Enter The Programme Of The Student : ");
            prog = sc.nextLine();
            System.out.print("Enter The Stream Of The Student : ");
            stream = sc.nextLine();
            System.out.print("Enter The Percentage Of The Marks : ");
            d = sc.nextDouble();
            G1 = new GraduateStudents(name, ag, prog, d, stream);
            G1.displayInfo();
            System.out.println();
            System.out.print("Want To Update Anything : 1-YES / 2-NO : ");
            update = input.nextInt();
            if (update == 1) {
                G1.toUpadte();
                G1.displayInfo();
            } else {
                return;
            }
            break;
        }
        case 2: {
            String name, prog, sub;
            int ag, update;
            int y;
            System.out.println("You have selected RESEARCH STUDENT.");
            System.out.println("\nEnter The Name Of The Student : ");
            name = input.nextLine();
            System.out.println("Enter The Age Of The Student : ");
            ag = input.nextInt();
            System.out.print("Enter The Programme Of The Student : ");
            prog = input.nextLine();
            System.out.print("Enter The Special Subject Of The Student : ");
            sub = input.nextLine();
            System.out.print("Enter The Year Of The Experience Of The Student : ");
            y = input.nextInt();
            R1 = new ResearchStudents(name, ag, prog, y, sub);
            R1.displayInfo();
            System.out.println();
            System.out.print("Want To Update Anything : 1-YES / 2-NO : ");
            update = input.nextInt();
            if (update == 1) {
                R1.toUpadte();
                R1.displayInfo();
            } else {
                return;
            }
            break;
        }
        }
    }
}