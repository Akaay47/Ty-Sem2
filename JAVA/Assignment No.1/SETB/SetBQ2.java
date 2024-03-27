import java.io.*;
import java.util.*;

class hashmap
{
        public static void main(String args[])
        {
              Scanner sc= new Scanner(System.in);
              HashMap<Integer,String> c=new HashMap<Integer,String>();
              System.out.println("Enter the Number of Hashmap entries (key,value) : ");
              int n=sc.nextInt();
              System.out.println("Enter the Hashmap entries (key,value) : ");
              for (int i=0;i<n;i++)
              {
                  c.put(sc.nextInt(),sc.next());
              }
              
              System.out.println("The Hashmap before Sorting are : "+c+"\n\n");
              for (Integer k: c.keySet())
              {
                  System.out.println("Key   : "+k+"   Value  "+c.get(k));
              }    
              TreeMap<Integer,String> c1=new TreeMap<Integer,String>();
              c1.putAll(c);
              System.out.println("The Hashmap after Sorting are : "+c1+"\n\n");
              for (Integer k: c1.keySet())
              {
                  System.out.println("Key   : "+k+"   Value  "+c1.get(k));
              }    
             
         }
}     
/*
ty21@pc57:~/TY21/Sem2/JAVA/SETB$ javac SetBQ2.java
ty21@pc57:~/TY21/Sem2/JAVA/SETB$ java hashmap
Enter the Number of Hashmap entries (key,value) : 
3
Enter the Hashmap entries (key,value) : 
21  atharv
12 abhi 
42 mahesh
The Hashmap before Sorting are : {21=atharv, 42=mahesh, 12=abhi}


Key   : 21   Value  atharv
Key   : 42   Value  mahesh
Key   : 12   Value  abhi
The Hashmap after Sorting are : {12=abhi, 21=atharv, 42=mahesh}


Key   : 12   Value  abhi
Key   : 21   Value  atharv
Key   : 42   Value  mahesh
*/
