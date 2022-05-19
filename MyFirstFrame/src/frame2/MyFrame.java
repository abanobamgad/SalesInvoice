package frame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    private JButton bt1;
    private JButton bt2;
    public MyFrame()
    {
        super("My Frame");
        setLayout(new FlowLayout());
         bt1 = new JButton("ok");
        add(bt1);
       // MyListener l = new MyListener();
        bt1.addActionListener(this);

         bt2 = new JButton("Cancel");
        add(bt2);
        bt2.addActionListener(this);

        setSize(300,200);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(bt1))
        {
            JOptionPane.showMessageDialog(null,
                    "Welcome Swing Events by OK Button",
                    "INFORMATION_MESSAGE",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource().equals(bt2)) {

            JOptionPane.showMessageDialog(null,
                    "Welcome Swing Events by Cancel Button",
                    "INFORMATION_MESSAGE",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    }
