import java.io.*;
import java.sql.*;

class SetAQ3
{
     public static void main (String[] arg) throws SQLException
     {
      
      try{
          Connection con= DriverManager.getConnection("jdbc:postgresql://192.168.1.254:5432/ty21","ty21","ty21");
          if (con==null)
             System.out.print("*****\n Connection Not Successfull *****\n");
          else 
          {
              System.out.print("*****\n Connection Successfull *****\n");
              Statement st = con.createStatement();
              ResultSet rs = st.executeQuery("SELECT * FROM donor");
              ResultSetMetaData rd = rs.getMetaData();
              int cc = rd.getColumnCount();
              System.out.println("Number Of Column : "+cc);
              for (int i=1;i<=cc;i++)
              { 
                 System.out.println("Column Number : "+i);
                 System.out.println("Column Name : "+rd.getColumnName(i));
                 System.out.println("Column Type : "+rd.getColumnTypeName(i));
                 System.out.println("Column Size : "+rd.getColumnDisplaySize(i));
              } 
          }     
      }
      catch(Exception e)
      {
          System.out.print("\n Error-----\n"+e);
      }
    }
}    
     
