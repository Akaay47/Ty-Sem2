import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class PMS extends JFrame {
        private JTable table;

        public PMS() {
        setTitle("Project Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        
        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane,BorderLayout.CENTER);
        
        displayData();
        
        setVisible(true);
        
       }
       
       private void displayData(){
       try{
           Connection connection= DriverManager.getConnection("jdbc:postgresql://192.168.1.254:5432/ty21","ty21","ty21");
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("SELECT * FROM project");
           
           ResultSetMetaData metaData = resultSet.getMetaData();
           int columnCount = metaData.getColumnCount();
           DefaultTableModel model = new DefaultTableModel();
           
           for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++){
                model.addColumn(metaData.getColumnName(columnIndex));
           }
           while (resultSet.next()){
                  Object[] row = new Object[columnCount];
                  for ( int i=0; i<columnCount;i++){
                       row[i] = resultSet.getObject(i+1);
                  }
                  model.addRow(row);
           }
           table.setModel(model);
           resultSet.close();
           statement.close();
           connection.close();
           }
           catch (SQLException e){
                 e.printStackTrace();
           }
      }
      public static void main (String[] args){
             SwingUtilities.invokeLater(PMS::new);
      }  
}           
             
             
                                    
           
                 
