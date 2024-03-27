import java.io.*;
import java.util.*;

class student{
        public static void main(String args[])
        {
              Scanner sc= new Scanner(System.in);
              Hashtable<String,String> c=new Hashtable<>();
              System.out.println("Enter the Number of Students (Contact,Name) : ");
              int n=sc.nextInt();
              System.out.println("Enter the Name of Students (Contact,Name) : ");
              for (int i=0;i<n;i++)
              {
                  c.put(sc.next(),sc.next());
             }
             System.out.println("The Students are : "+c);
           
         }
        }     
