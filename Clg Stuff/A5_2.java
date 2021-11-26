import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class A5_2 {                 //! Dont do this one !
    A5_2() {
        Frame frame = new Frame("STUDENT PROFILE");
        Font F = new Font("Verdana", Font.BOLD, 15);
        Label SP = new Label(" XAVIER INSTITUTE OF ENGINEERING : STUDENT PROFILE FORM ");
        SP.setBounds(0, 40, 600, 50);
        SP.setFont(F);
        SP.setAlignment(Label.CENTER);
        SP.setBackground(Color.black);
        SP.setForeground(Color.WHITE);
        Label firstname = new Label("Firstname : ");
        firstname.setBounds(10, 110, 70, 20);
        TextField FN = new TextField();
        FN.setBounds(100, 110, 110, 20);
        Label surname = new Label("Surname : ");
        surname.setBounds(10, 140, 70, 20);
        TextField sn = new TextField();
        sn.setBounds(100, 140, 110, 20);
        Label address = new Label("Address : ");
        address.setBounds(10, 170, 70, 20);
        TextField ad = new TextField();
        ad.setBounds(100, 170, 110, 20);
        Label birthdate = new Label("Bithdate : ");
        birthdate.setBounds(10, 200, 70, 20);
        TextField bd = new TextField();
        bd.setBounds(100, 200, 110, 20);
        Label birthplace = new Label("Birthplace : ");
        birthplace.setBounds(230, 200, 70, 20);
        TextField bp = new TextField();
        bp.setBounds(320, 200, 110, 20);
        Label age = new Label("Age : ");
        age.setBounds(10, 230, 70, 20);
        TextField a = new TextField();
        a.setBounds(100, 230, 110, 20);
        Label gender = new Label("Gender : ");
        gender.setBounds(230, 230, 50, 20);
        Checkbox male = new Checkbox("Male");
        male.setBounds(310, 230, 50, 20);
        Checkbox female = new Checkbox("Female");
        female.setBounds(370, 230, 70, 20);
        Label country = new Label("Country : ");
        country.setBounds(10, 260, 70, 20);
        TextField cn = new TextField();
        cn.setBounds(100, 260, 110, 20);
        Label nation = new Label("Nationality : ");
        nation.setBounds(230, 260, 70, 20);
        TextField n = new TextField();
        n.setBounds(310, 260, 110, 20);
        Label bloodg = new Label("Blood Group : ");
        bloodg.setBounds(10, 290, 70, 20);
        TextField bg = new TextField();
        bg.setBounds(100, 290, 110, 20);
        Label Class = new Label("Class : ");
        Class.setBounds(10, 320, 70, 20);
        TextField c = new TextField();
        c.setBounds(100, 320, 110, 20);
        Label div = new Label("Divison : ");
        div.setBounds(230, 320, 70, 20);
        TextField d = new TextField();
        d.setBounds(310, 320, 110, 20);
        Label condition = new Label("Parent Martial Status : ");
        condition.setBounds(10, 350, 150, 20);
        Checkbox marry = new Checkbox("Married");
        marry.setBounds(170, 350, 60, 20);
        Checkbox divo = new Checkbox("Divorced");
        divo.setBounds(240, 350, 80, 20);
        Checkbox sep = new Checkbox("Seperate");
        sep.setBounds(320, 350, 80, 20);
        Checkbox single = new Checkbox("Single");
        single.setBounds(400, 350, 50, 20);
        Checkbox widow = new Checkbox("Widow");
        widow.setBounds(470, 350, 60, 20);
        Label mothername = new Label("Mothername : ");
        mothername.setBounds(10, 380, 90, 20);
        TextField mn = new TextField();
        mn.setBounds(110, 380, 110, 20);
        Label motherphone = new Label("Motherphone : ");
        motherphone.setBounds(230, 380, 90, 20);
        TextField mp = new TextField();
        mp.setBounds(340, 380, 110, 20);
        Label fathername = new Label("Fathername : ");
        fathername.setBounds(10, 410, 90, 20);
        TextField fn = new TextField();
        fn.setBounds(110, 410, 110, 20);
        Label fatherphone = new Label("Fatherphone : ");
        fatherphone.setBounds(230, 410, 90, 20);
        TextField fp = new TextField();
        fp.setBounds(340, 410, 110, 20);
        Label emergency = new Label(" EMERGENCY CONTACT DETAILS ");
        emergency.setFont(F);
        emergency.setBounds(0, 440, 600, 50);
        emergency.setAlignment(Label.CENTER);
        emergency.setBackground(Color.RED);
        emergency.setForeground(Color.white);
        Label name = new Label("Name : ");
        name.setBounds(10, 500, 70, 20);
        TextField nam = new TextField();
        nam.setBounds(100, 500, 110, 20);
        Label Contact = new Label("Contact : ");
        Contact.setBounds(230, 500, 70, 20);
        TextField cnn = new TextField();
        cnn.setBounds(310, 500, 110, 20);
        frame.add(SP);
        frame.add(firstname);
        frame.add(FN);
        frame.add(surname);
        frame.add(sn);
        frame.add(address);
        frame.add(ad);
        frame.add(birthdate);
        frame.add(bd);
        frame.add(birthplace);
        frame.add(bp);
        frame.add(age);
        frame.add(a);
        frame.add(gender);
        frame.add(male);
        frame.add(female);
        frame.add(country);
        frame.add(cn);
        frame.add(nation);
        frame.add(n);
        frame.add(bloodg);
        frame.add(bg);
        frame.add(Class);
        frame.add(c);
        frame.add(div);
        frame.add(d);
        frame.add(condition);
        frame.add(marry);
        frame.add(single);
        frame.add(sep);
        frame.add(divo);
        frame.add(widow);
        frame.add(mothername);
        frame.add(mn);
        frame.add(motherphone);
        frame.add(mp);
        frame.add(fathername);
        frame.add(fn);
        frame.add(fatherphone);
        frame.add(fp);
        frame.add(emergency);
        frame.add(name);
        frame.add(nam);
        frame.add(Contact);
        frame.add(cnn);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        male.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                female.setState(false);
            }
        });
        female.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                male.setState(false);
            }
        });
        marry.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                single.setState(false);
                sep.setState(false);
                divo.setState(false);
                widow.setState(false);
            }
        });
        single.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                marry.setState(false);
                sep.setState(false);
                divo.setState(false);
                widow.setState(false);
            }
        });
        sep.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                single.setState(false);
                marry.setState(false);
                divo.setState(false);
                widow.setState(false);
            }
        });
        divo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                single.setState(false);
                sep.setState(false);
                marry.setState(false);
                widow.setState(false);
            }
        });
        widow.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                single.setState(false);
                sep.setState(false);
                divo.setState(false);
                marry.setState(false);
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new A5_2();
    }
}