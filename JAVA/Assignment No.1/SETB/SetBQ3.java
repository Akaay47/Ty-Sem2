import java.io.*;
import java.util.*;

class contact
{
        public static void main(String args[])throws IOException
        {
              Scanner sc= new Scanner(System.in);

              System.out.println("Enter the File Name : ");
              String k=sc.next();
              
              File f= new File(k);
              FileReader fr= new FileReader(f);
              BufferedReader br= new BufferedReader(fr);
              
              String line,line1,name,phone;
              String t[];
             
              Hashtable<String,String> c= new Hashtable<>();
              
              while ((line=br.readLine())!=null)
              {
                    t=line.split(" ");
                    c.put(t[0],t[1]);
              }
              System.out.println("The Name And Phone no : "+c+"\n\n");     
         }
         
}     
