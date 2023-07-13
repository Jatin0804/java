import javax.swing.*;
public class Button
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("My frame");
        JButton b=new JButton("Ok");
        b.setBounds(130,100,100,40);
        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}