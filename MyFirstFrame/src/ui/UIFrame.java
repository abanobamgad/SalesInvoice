package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIFrame extends JFrame implements ActionListener {
    private JTextField UsernameTF;
    private JPasswordField passwordTF;
    private JTextArea addressTA;
    private JButton btn;


    public UIFrame ()
    {
        super ("UI Components");
        setLayout(new FlowLayout());
        UsernameTF = new JTextField(15);
        JLabel UsernameLBL = new JLabel("User Name");      //awl tre2a a7ot beha label ll text
        add(UsernameLBL);
        add(UsernameTF);
        UsernameTF.setText("Welcome");

        passwordTF = new JPasswordField(15);
        add(new JLabel("password"));                      //tre2a tany a7ot beha label ll text
        add(passwordTF);

        addressTA = new JTextArea(5,15);
        add(new JLabel("Address:"));
        add(new JScrollPane(addressTA));

        btn = new JButton("Ok");
        btn.addActionListener(this);
        add(btn);


        setSize(300, 200);
        setLocation(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main (String [] args)
    {
         UIFrame f = new UIFrame();
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String username = UsernameTF.getText();
        char [] passwordchars = passwordTF.getPassword();
        String password = new String(passwordchars);
        String address = addressTA.getText();
        String msg = "Username:" + username + "\nPassword: " + password + "\nAddress: " + address;
        JOptionPane.showMessageDialog(this , msg , "Info" , JOptionPane.INFORMATION_MESSAGE);
    }
}
