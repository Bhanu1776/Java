import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class A5_3 {
    A5_3() {
        Frame frame = new Frame("Color Palette");
        GridLayout G1 = new GridLayout(3, 3);

        Button B1 = new Button("Red");
        Button B2 = new Button("Yellow");
        Button B3 = new Button("Blue");
        Button B4 = new Button("Green");
        Button B5 = new Button("Orange");
        Button B6 = new Button("Grey");
        Button B7 = new Button("Pink");
        Button B8 = new Button("Cyan");
        Button B9 = new Button("Magenta");

        frame.add(B1);
        frame.add(B2);
        frame.add(B3);
        frame.add(B4);
        frame.add(B5);
        frame.add(B6);
        frame.add(B7);
        frame.add(B8);
        frame.add(B9);
        frame.setSize(500, 500);
        frame.setLayout(G1);
        frame.setVisible(true);

        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B1.setBackground(Color.red);
            }
        });
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B2.setBackground(Color.yellow);
            }
        });
        B3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B3.setBackground(Color.blue);
            }
        });
        B4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B4.setBackground(Color.green);
            }
        });
        B5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B5.setBackground(Color.orange);
            }
        });
        B6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B6.setBackground(Color.darkGray);
            }
        });
        B7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B7.setBackground(Color.pink);
            }
        });
        B8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B8.setBackground(Color.cyan);
            }
        });
        B9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B9.setBackground(Color.magenta);
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
        new A5_3();
    }
}