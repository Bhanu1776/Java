import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Exp17 implements ActionListener {

    JTextField tf1,tf2,tf3,tf4;
    JButton b1,b2,b3,b4;

    Exp17(){

        JFrame f = new JFrame("Calculator");

        tf1 = new JTextField();
        tf1.setFont (tf1.getFont ().deriveFont (32.0f));
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf2 = new JTextField();
        tf2.setFont (tf1.getFont ().deriveFont (32.0f));
        tf2.setHorizontalAlignment(JTextField.CENTER);
        tf3 = new JTextField();
        tf3.setFont (tf1.getFont ().deriveFont (32.0f));
        tf3.setHorizontalAlignment(JTextField.CENTER);
        tf4 = new JTextField();
        tf3.setEditable(false); 
        tf4.setEditable(false); 
        
        b1 = new JButton("+");
        b1.setFont(b1.getFont().deriveFont(32.0f));
        b2 = new JButton("-");
        b2.setFont(b2.getFont().deriveFont(32.0f));
        b3 = new JButton("/");
        b3.setFont(b3.getFont().deriveFont(32.0f));
        b4 = new JButton("*");
        b4.setFont(b4.getFont().deriveFont(32.0f));
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        
        f.setSize(700,500);
        f.setLayout(new GridLayout(4,2));
        f.setVisible(true);
        f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        
        if(e.getSource()==b1){
            c=a+b;
        }
        else if(e.getSource()==b2){
            c=a-b;
        }
        else if(e.getSource()==b3){
            c=a/b;
        }
        else if(e.getSource()==b4){
            c=a*b;
        }

        String result = String.valueOf(c);
        tf3.setText(result);
    }  
    
    
    public static void main(String[] args) {
        
        new Exp17();
    }
}
