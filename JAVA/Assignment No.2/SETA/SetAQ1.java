import java.io.*;
import java.lang.String.*;

class covid extends Thread
{
     String msg = null;
     int n;
     covid(String msg,int n)
     {
          this.msg = msg;
          this.n = n;
     }
     public void run()
     {
          for (int i=1;i<=n;i++)
          {
              System.out.println(msg+" "+i+"times");
              System.out.println(" ");
          }
     }   
     public static void main(String a[])
     {
         int n=10;
         covid t1= new covid("Covid-19",n);
         t1.start();
         covid t2= new covid("Lockdown-2020",n+10);
         t2.start();    
         covid t3= new covid("Vaccine-21",n+20);
         t3.start();  
     }
}      
                     
