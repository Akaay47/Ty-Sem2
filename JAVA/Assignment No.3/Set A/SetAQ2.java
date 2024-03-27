import java.io.*;
import java.sql.*;

class SetAQ2
{
     public static void main (String[] arg) throws SQLException
     {
      
      try {
          Connection con= DriverManager.getConnection("jdbc:postgresql://192.168.1.254:5432/ty21","ty21","ty21");
          if (con==null)
             System.out.print("*****\n Connection Not Successfull *****\n");
          else 
          {
             System.out.print("*****\n Connection Successfull *****\n");   
             DatabaseMetaData p1 =  con.getMetaData();
             ResultSet rs = p1.getTables(null,null,null,new String[] {"TABLE"});
             while (rs.next())
                  System.out.println(rs.getString("TABLE_NAME")); 
             System.out.println("Database Product Name : "+p1.getDatabaseProductName());
             System.out.println("Database Product Version : "+p1.getDatabaseProductVersion());
             System.out.println("Driver Name : "+p1.getDriverName());
          }
             
     }
     catch(Exception e)
     {
          System.out.print("\n Error-----\n"+e);
     }
     }     
         
     
 }
          
