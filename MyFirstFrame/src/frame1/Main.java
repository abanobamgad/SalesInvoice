package frame1;

import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        JFrame f= new JFrame("My First Frame Title");
        f.setSize(300,400);
        f.setLocation(50,50);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}