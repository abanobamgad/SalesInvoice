package ui.table;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class newinvoice extends JFrame{


    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JTable table1;
    private JTable table2;
    private JPanel rightpanel;
    private JPanel leftpanel;
    private JButton button2;
    private JPanel main;
    public static void jButtonImportActionPerformed(JTable table1) {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        //System.out.println("Current absolute path is: " + s);

        String filePath = s+"\\items.csv";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            // get the first line
            // get the columns name from the first line
            // set columns name to the jtable model
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)table1.getModel();
            model.setColumnIdentifiers(columnsName);

            // get lines from txt file
            Object[] tableLines = br.lines().toArray();

            // extratct data from lines
            // set data to jtable model
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }


        } catch (Exception ex) {
            Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void jButtonImportActionPerformed1(JTable table1) {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        //System.out.println("Current absolute path is: " + s);

        String filePath = s+"\\table.csv";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            // get the first line
            // get the columns name from the first line
            // set columns name to the jtable model
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)table1.getModel();
            model.setColumnIdentifiers(columnsName);

            // get lines from txt file
            Object[] tableLines = br.lines().toArray();

            // extratct data from lines
            // set data to jtable model
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }


        } catch (Exception ex) {
            Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args)
    {
        newinvoice jFrame=new newinvoice();
        jFrame.setContentPane(new newinvoice().main);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);

    }


    private void createUIComponents() {
        textField1=new JTextField();
        textField2=new JTextField();
        button1=new JButton();
        table1=new JTable();
        table2=new JTable();
        rightpanel=new JPanel();
        leftpanel=new JPanel();
        add(new JScrollPane(table1));
        add(new JScrollPane(table2));
        setSize(400, 500);
        setLocation(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jButtonImportActionPerformed1(table2);
        jButtonImportActionPerformed(table1);

        table2.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                // do some actions here, for example
                // print first column value from selected row
                //jButtonImportActionPerformed(table1,table2.getValueAt(table2.getSelectedRow(), 0).toString());
jButtonImportActionPerformed(table1);
            }
        });
        // TODO: place custom component creation code here
    }
}
