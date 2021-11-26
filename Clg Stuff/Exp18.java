import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exp18 {
    int i = 1;

    Exp18() {

        JFrame frame = new JFrame("Traffic Signal");

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setBounds(50, 50, 150, 250);

        JLabel red = new JLabel("");
        red.setOpaque(true);
        red.setBounds(87, 80, 75, 50);
        red.setBackground(Color.RED);
        JLabel yellow = new JLabel("");
        yellow.setOpaque(true);
        yellow.setBounds(87, 150, 75, 50);
        yellow.setBackground(Color.BLACK);
        JLabel green = new JLabel("");
        green.setOpaque(true);
        green.setBounds(87, 220, 75, 50);
        green.setBackground(Color.BLACK);
        
        JButton click = new JButton("Switch");
        click.setBounds(87, 310, 75, 30);
        click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                if (i > 3) {
                    i = 1;
                }
                if (i == 1) {
                    red.setBackground(Color.RED);
                    yellow.setBackground(Color.BLACK);
                    green.setBackground(Color.BLACK);
                } else if (i == 2) {
                    yellow.setBackground(Color.YELLOW);
                    red.setBackground(Color.BLACK);
                    green.setBackground(Color.BLACK);
                } else {
                    green.setBackground(Color.GREEN);
                    yellow.setBackground(Color.BLACK);
                    red.setBackground(Color.BLACK);
                }
            }
        });

        frame.add(red);
        frame.add(click);
        frame.add(yellow);
        frame.add(green);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Exp18();
    }
}