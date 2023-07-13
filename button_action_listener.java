import javax.swing.*;
import java.awt.event.*;

public class button_action_listener 
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("MY Button.");
        JTextField tf=new JTextField("Java");
        JButton b= new JButton("OK");
        b.setBounds(50,50,95,30);
        tf.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener() 
        {
         public void actionPerformed(ActionEvent event)
         {
            tf.setText("Java lab");
         }   
        });
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
