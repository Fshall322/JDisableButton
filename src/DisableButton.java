/**
 * Created by Frank Hall on 6/25/2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JDisableButton extends JFrame implements ActionListener
{
    JButton button = new JButton("Disable");
    JLabel label = new JLabel("Don't Do It!");
    public JDisableButton()
    {
        super("Dont't Click Me!");
        setLayout(new FlowLayout());
        setSize(230,75);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(this);
        add(label);
        add(button);
    }

    public void actionPerformed(ActionEvent e)
    {
        button.setEnabled(false);
    }

    public static void main(String[] args)
    {
        //JDisableButton myFrame=new JDisableButton();
        new JDisableButton();
    }
}
