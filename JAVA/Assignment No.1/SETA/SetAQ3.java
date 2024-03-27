import java.io.*;
import java.util.*;

class color{
        public static void main(String args[])
        {
              Scanner sc= new Scanner(System.in);
              TreeSet<String> c=new TreeSet<>();
              System.out.println("Enter the Number of Color : ");
              int n=sc.nextInt();
              System.out.println("Enter the Name of Color : ");
              for (int i=0;i<n;i++)
              {
                  c.add(sc.next());
             }
             System.out.println("The Colors are : "+c);
           
         }
        }     
