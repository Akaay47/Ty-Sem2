import java.io.*;
import java.util.*;

class friend{
        public static void main(String args[])
        {
              Scanner sc= new Scanner(System.in);
              LinkedList<String> c=new LinkedList<>();
              System.out.println("Enter the Number of Friends : ");
              int n=sc.nextInt();
              System.out.println("Enter the Name of Friends : ");
              for (int i=0;i<n;i++)
              {
                  c.add(sc.next());
             }
             System.out.println("The Friends are : "+c);
            
         }
        }     
