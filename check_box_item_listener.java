import javax.swing.*;
import java.awt.event.*;

public class check_box_item_listener implements ItemListener
{
    JCheckBox cb1,cb2;
    JLabel l;
    check_box_item_listener()
    {
        JFrame f=new JFrame("My Frame");
        l=new JLabel();
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(400,100);
        f.add(l);
        cb1=new JCheckBox("Java");
        cb1.setBounds(150,100,50,50);
        cb2=new JCheckBox("Python");
        cb2.setBounds(150, 150, 50, 50);
        f.add(cb1);
        f.add(cb2);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(null);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==cb1)
        l.setText("Java CheckBox : "+(e.getStateChange()==1?"checked":"unchecked"));

        if(e.getSource()==cb2)
        l.setText("Python CheckBox : "+(e.getStateChange()==1?"Checked":"unchcked"));
    }

    public static void main(String args[])
    {
        new check_box_item_listener();
    }
}
