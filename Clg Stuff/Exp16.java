import javax.swing.*;
import java.awt.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Exp16{
    public static void main(String[] args) {

        //* Frame
        JFrame f = new JFrame("Swing");

        //* Pannel
        JPanel p = new JPanel();

        //* Button
        JButton b = new JButton("Button");

        //* Label
        JLabel l = new JLabel("Label");

        //* Checkbox
        JCheckBox c1 = new JCheckBox("Good");
        JCheckBox c2 = new JCheckBox("Bad");

        //* RadioButton
        JRadioButton r1 = new JRadioButton("Yess");
        JRadioButton r2 = new JRadioButton("No");

        //* Combobox
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Index 1");
        l1.addElement("Index 2");
        l1.addElement("Index 3");
        l1.addElement("Index 4");
        JList<String> list = new JList<>(l1);  
        String Subjects[] = {"Java","Maths","Dbms","PCPF","Pcom"};
        JComboBox jc = new JComboBox<>(Subjects);

        //* Tree
        DefaultMutableTreeNode XIE = new DefaultMutableTreeNode("XIE");
        DefaultMutableTreeNode SE = new DefaultMutableTreeNode("SE");
        DefaultMutableTreeNode TE = new DefaultMutableTreeNode("TE");
        XIE.add(SE);
        XIE.add(TE);
        DefaultMutableTreeNode Maths = new DefaultMutableTreeNode("Maths");
        DefaultMutableTreeNode Java = new DefaultMutableTreeNode("Java");
        DefaultMutableTreeNode Cpp = new DefaultMutableTreeNode("C++");
        DefaultMutableTreeNode DSA = new DefaultMutableTreeNode("DSA");
        SE.add(Maths);
        SE.add(Java);
        SE.add(Cpp);
        SE.add(DSA);
        JTree jt = new JTree(XIE);

        //* Table and Scrollpane
        String info1[][] = { {"1","Bhanu","Dombivli"},
                             {"2","Bunny","Hyderabad"}};
        String column[] = {"id","name","location"};
        JTable Jt = new JTable(info1,column);
        JScrollPane sp = new JScrollPane(Jt);
        
        //* Menu 
        JMenu menu = new JMenu("XIE");
        JMenuBar mb = new JMenuBar();
        JMenuItem i1,i2,i3;
        i1 = new JMenuItem("FE");
        i2 = new JMenuItem("SE");
        i3 = new JMenuItem("TE");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        mb.add(menu);

        //* Toolbar 
        JToolBar tb = new JToolBar();
        JButton b3 = new JButton("Life@XIE");
        tb.add(b3);

        //* Adding components to frame and panel
        f.add(p);
        p.add(b);
        p.add(l);
        p.add(c1);
        p.add(c2);
        p.add(r1);
        p.add(r2);
        p.add(list);
        p.add(jc);
        p.add(jt);
        p.add(sp);
        f.setJMenuBar(mb);
        p.add(tb);

        p.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 25));
        
        f.setSize(700,500);
        f.setVisible(true);

    }
}