package frame2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Welcome Swing Events", "PLAIN_MESSAGE" ,JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Welcome Swing Events", "INFORMATION_MESSAGE" ,JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Welcome Swing Events", "WARNING_MESSAGE" ,JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Welcome Swing Events", "ERROR_MESSAGE" ,JOptionPane.ERROR_MESSAGE);

    }
}
