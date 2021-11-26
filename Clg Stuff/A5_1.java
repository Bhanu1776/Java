import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class A5_1 {
    A5_1() {

        Frame frame = new Frame("Info");

        Label name = new Label("Name : ");
        name.setBounds(10, 40, 50, 20);
        Label street = new Label("Street : ");
        street.setBounds(10, 70, 50, 20);
        Label city = new Label("City : ");
        city.setBounds(10, 100, 50, 20);
        Label pincode = new Label("Pincode : ");
        pincode.setBounds(10, 130, 50, 20);

        TextField name2 = new TextField();
        name2.setBounds(70, 40, 100, 20);
        TextField street2 = new TextField();
        street2.setBounds(70, 70, 100, 20);
        TextField city2 = new TextField();
        city2.setBounds(70, 100, 100, 20);
        TextField pincode2 = new TextField();
        pincode2.setBounds(70, 130, 100, 20);
        Button B1 = new Button("My Info");
        B1.setBounds(85, 160, 60, 30);

        frame.add(name);
        frame.add(street);
        frame.add(city);
        frame.add(pincode);
        frame.add(name2);
        frame.add(street2);
        frame.add(city2);
        frame.add(pincode2);
        frame.add(B1);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font F = new Font("Arial", Font.ITALIC, 32);
                name2.setBounds(70, 40, 200, 35);
                street.setBounds(10, 80, 50, 20);
                street2.setBounds(70, 80, 200, 35);
                city.setBounds(10, 120, 50, 20);
                city2.setBounds(70, 120, 200, 35);
                pincode.setBounds(10, 160, 50, 20);
                pincode2.setBounds(70, 160, 200, 35);
                B1.setBounds(85, 200, 60, 30);
                name2.setFont(F);
                street2.setFont(F);
                city2.setFont(F);
                pincode2.setFont(F);
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
        new A5_1();
    }
}