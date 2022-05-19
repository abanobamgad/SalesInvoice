package ui.table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TableFrame extends JFrame {

   public static   JTable table;
   public static  JButton button1;

    //private String [] cols = {"ID", "Student", "Grade"};
//    private String [][] data = {
//            {"2" , "Ali" , "Excellent"},
//            {"3" , "Abanob" , "Good"},
//            {"4" , "Ahmed" , "Fair"},
//
//    };
//
    public TableFrame(){
        super("Table Demo");
        table = new JTable();
        add(new JScrollPane(table));

        setSize(400, 500);
        setLocation(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void jButtonImportActionPerformed() {

        String filePath = "C:\\Users\\Petra\\Desktop\\items.csv";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            // get the first line
            // get the columns name from the first line
            // set columns name to the jtable model
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)table.getModel();
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

        new TableFrame().setVisible(true);
        jButtonImportActionPerformed();
    }
}
