import java.io.*;
import java.util.*;

class cities{
        public static void main(String args[])
        {
              Scanner sc= new Scanner(System.in);
              ArrayList<String> c=new ArrayList<>();
              System.out.println("Enter the Number of Cities : ");
              int n=sc.nextInt();
              System.out.println("Enter the Name of Cities : ");
              for (int i=0;i<n;i++)
              {
                  c.add(sc.next());
             }
             System.out.println("The Cities are : "+c);
             c.clear();
             System.out.println("The Name of Cities(after deleting) : "+c+"\n\n");
         }
        }     
