class Teacher
{
    String name;
    int ph_no;
    Teacher()
    {
        name = "Null";
        ph_no = 0;
    }
    Teacher(String nam,int ph)
    {
        name = nam;
        ph_no = ph;
    }
}

class Professor extends Teacher
{
    int t_id, exp;
    Professor()
    {
        super();
        t_id = 0;
        exp = 0;
    }
    Professor(int i,String n,int p,int j)
    {
        super(n,p);
        t_id = i;
        exp = j;
    }
    void Details()
    {
        System.out.println("Professor ID no.: "+t_id);
        System.out.println("Name: "+name);
        System.out.println("Phone no.: "+ph_no);
        System.out.println("Experience (in years): "+exp);
    }
}
class AssociateProfessor extends Teacher
{
    int ap_id, exp;
    AssociateProfessor()
    {
        super();
        ap_id = 0;
    }
    AssociateProfessor(int i,String n,int p,int j)
    {
        super(n,p);
        ap_id = i;
        exp = j;
    }
    void Details()
    {
        System.out.println("Associate Professor ID no.: "+ap_id);
        System.out.println("Name: "+name);
        System.out.println("Phone no.: "+ph_no);
        System.out.println("Experience (in years): "+exp);
    }
}
class AssistantProfessor extends Teacher
{
    int ap_id, exp;
    AssistantProfessor()
    {
        super();
    }
    AssistantProfessor(int i,String n,int p,int j)
    {
        super(n,p);
        ap_id = i;
        exp = j;
    }
    void Details()
    {
        System.out.println("Assistant Professor ID no.: "+ap_id);
        System.out.println("Name: "+name);
        System.out.println("Phone no.: "+ph_no);
        System.out.println("Experience (in years): "+exp);
    }
}
class Exp9                  // Teachers
{
    public static void main(String []args)
    {
        Professor p1 = new Professor();
        Professor p2= new Professor();
        AssociateProfessor ap1 = new AssociateProfessor();
        AssociateProfessor ap2 = new AssociateProfessor();
        AssistantProfessor aap1 = new AssistantProfessor();
        AssistantProfessor aap2 = new AssistantProfessor();
        p1 = new Professor(1,"Bhanu",123456677,5);
        p2 = new Professor(2,"Bunny",12345678,5);
        ap1 = new AssociateProfessor(1,"Hrithik",12345687,4);
        ap2 = new AssociateProfessor(2,"Arjun",12345679,3);
        aap1 = new AssistantProfessor(1,"Vijay",12345696,2);
        aap2 = new AssistantProfessor(2,"Kriti",12345686,2);
        System.out.println("Professor Details");
        p1.Details();
        System.out.println("");
        System.out.println("Professor Details");
        p2.Details();
        System.out.println("");
        System.out.println("Associate Professor Details");
        ap1.Details();
        System.out.println("");
        System.out.println("Associate Professor Details");
        ap2.Details();
        System.out.println("");
        System.out.println("Assistant Professor Details");
        aap1.Details();
        System.out.println("");
        System.out.println("Assistant Professor Details");
        aap2.Details();
    }
}