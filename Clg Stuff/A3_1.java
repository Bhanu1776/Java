import java.util.Scanner;

class Book {
    Scanner sc = new Scanner(System.in);

    void availableBooks() {             
        
        System.out.println("| 1.EM-3 |");
        System.out.println("| 2.DBMS |");
        System.out.println("| 3.DSA |");
        System.out.println("| 4.PCOM |");
        System.out.println("| 5.PCPF |");
        System.out.println();
    }

    void display() {
        int a;
        System.out.println("Click The Serial No. To Get Info About Book(1-5) : ");
        a = sc.nextInt();
        System.out.println();
        switch (a) {
        case 2: {
            System.out.println("Database Management System");
            System.out.println("Author : Dayawant Thakur.");
            System.out.println("Price : 600rs\\-");
            System.out.println("Hurry Up!! LIMITED STOCK.");
            break;
        }
        case 1: {
            System.out.println("Engineering Mathematics ||| ");
            System.out.println("Author : G.V. Kumbhojkar.");
            System.out.println("Price : 530rs\\-");
            System.out.println("Hurry Up!! LIMITED STOCK.");
            break;
        }
        case 3: {
            System.out.println("Data Structure And Algorithm");
            System.out.println("Author : S.V Srivastav.");
            System.out.println("Price : 360rs\\-");
            System.out.println("Hurry Up!! LIMITED STOCK.");
            break;
        }
        case 4: {
            System.out.println("PCOM");
            System.out.println("Author : Balwesh Syno");
            System.out.println("Price : 240rs\\-");
            System.out.println("Hurry Up!! LIMITED STOCK.");
            break;
        }
        case 5: {
            System.out.println("PCPF");
            System.out.println("Author : Kumar Naresh.");
            System.out.println("Price : 330rs\\-");
            System.out.println("Hurry Up!! LIMITED STOCK.");
            break;
        }
        default: {
            System.out.println("Invalid!!!");
            System.out.println("Please Enter The Serial Number In The Range 1 - 5.");
        }
        }
    }
}

class Magazine extends Book {
    void availableMagazine() {
        System.out.println("\n*------ Available Magazines ------*");
        System.out.println(
                "1.Filmfare Magazine.\n2.India Today Magazine.\n3.TIME Magazine.\n4.Forbes India Magazine.\n5.Harvard Business Review HBR Magaine.");
    }

    void display() {
        int select;
        System.out.print("\nSelect The Index Between (1-5) To Get Info About Magazine: ");
        select = sc.nextInt();
        switch (select) {
        case 1: {
            System.out.println("You Have Selected Filmfare Magazine.");
            System.out.println("Filmfare is an Indian-English Language fortnightly magazine published by\n"
                    + "Worldwide Media. Acknowledged as one of indian most popular entertainmentmagazines\n"
                    + "it publises pieces involving news,interviews,photos,videos,reviews,events and style.");
            break;
        }
        case 2: {
            System.out.println("You Have Selected India Today Magazine.");
            System.out.println(
                    "India Today is a weekly Indian English-language news magazine published byLiving Media India Limited.\n"
                            + "It is the most widely circulated magazine in India, with a readership of close to 8 million.\n"
                            + "In 2014, India Today launched a new online opinion-orientated site called the DailyO.");
            break;
        }
        case 3: {
            System.out.println("You Have Selected TIME Magazine.");
            System.out.println(
                    "Time is an American news magazine and news website published and based in New York City.\n"
                            + "For nearly a century, it was published weekly, but by March 2020 it had switched to once every two weeks.");
            break;
        }
        case 4: {
            System.out.println("You Have Selected Forbes India Magazine.");
            System.out.println(
                    "Forbes India is your destination for business, stock market, startup and technology news,\n"
                            + "and a peek into the lives of India's richest and most famous");
            break;
        }
        case 5: {
            System.out.println("You Have Selected Harvard Business Review HBR Magaine.");
            System.out.println(
                    "Harvard Business Review is a general management magazine published by Harvard Business Publishing,"
                            + "\na wholly owned subsidiary of Harvard University.\n"
                            + "HBR is published six times a year and is headquartered in Brighton, Massachusetts.");
            break;
        }
        default: {
            System.out.println("Please Selected Valid Index For The Information.");
        }
        }
    }
}

class Reference extends Book {
    void availableReference() {
        System.out.println("\n*------Showing Available Reference Books------*");
        System.out.println("1.Engineering Physics, Malik and Singh, Tata Mc Graw Hill");
        System.out.println("2.Engineering Chemistry, Baskar, Wiley");
        System.out.println("3.Engineering Mathematics for first year, Veerarajan T., Tata McGraw-Hill");
        System.out.println("4.Basic Electrical Engineering, Mittle & Mittal, Tata McGraw Hill");
    }

    void display() {
        int select;
        System.out.println("\nSelect The Index Between (1-4) To Get Info About Reference Book.");
        select = sc.nextInt();
        switch (select) {
        case 1: {
            System.out.println("This book provides a comprehensive overview of Engineering Physics.\n"
                    + "Replete with numerous solved and unsolved problems, it offers an unparalleled exposure to optics,\n"
                    + "electromagnetism, theory of relativity, nuclear physics, solid state physics, quantum physics,magnetic properties of solids,\n"
                    + "superconductivity, X-rays and nanophysics.");
            break;
        }
        case 2: {
            System.out.println(
                    "Engineering Chemistry Is A Core Paper For Engineering Students At Various Technical Universities.\n"
                            + "This Book Is Specially Designed To Strengthen The Fundamental Concepts Of Chemistry And Illustrates Their Industrial And Engineering Applications.\n"
                            + "The Book Is Intended As A Textbook For The Engineering Chemistry Course For First Year B.Tech Students Of All Engineering Disciplines.");
            break;
        }
        case 3: {
            System.out.println(
                    "Engineering mathematics 1 & 2 is as per the latest syllabus offered to first year engineering students.\n"
                            + "It has in depth coverage of all the topics in the syllabus.\n"
                            + "The book has equal weight for theory and problems enabling the students to understand the concepts better\n"
                            + "The rich pedagogy and systematic approach enhances the student’ learning experience.");
            break;
        }
        case 4: {
            System.out.println(
                    "This book deals with the fundamentals of electrical engineering concepts like design & application of circuitry, equipment for power generation & distribution and machine control.\n"
                            + "Features Transformers discussed in detail. Thoroughly revised chapters on Single andThree-Phases Induction Motors.\n"
                            + "New chapter on: 1. Three-Phase Alternator 2. Electromechanical Energy Conversion 3.Testing of DC Machines");
            break;
        }
        default: {
            System.out.println("Please Selected Valid Index For The Information.");
        }
        }
    }
}

public class A3_1 {
    public static void main(String[] args) {
        Magazine M1 = new Magazine();
        M1.availableMagazine();
        M1.display();
    }
}