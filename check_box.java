import javax.swing.*;

public class check_box {
    public static void main(String args[]) {
        JFrame f = new JFrame("My check Box");
        JCheckBox cb1 = new JCheckBox("Java");
        cb1.setBounds(130, 200, 10, 10);
        f.add(cb1);
        JCheckBox cb2 = new JCheckBox("Python");
        cb2.setBounds(130, 150, 10, 10);
        f.add(cb2);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(null);
    }
}
