import java.io.*;
import java.util.*;
import java.lang.String.*;

class a1 implements Runnable
{
      String m;
      int n;
      a1 (String m)
      {
         this.m = m;
      }
         
      public void run()
      {    
          System.out.println("Thread_"+ Thread.currentThread().getName());
          for (int i=100;i>=1;i--){
               System.out.println("Thread_"+i);
               try{
                   Thread.currentThread().sleep(100);
               }
               catch(InterruptedException e){
                    System.out.println(e);
          }
          
        }
        Thread.currentThread().setName(m);
        System.out.println("Thread_"+ Thread.currentThread().getName());
      }
      
      public static void main(String args[])
      {
            a1 t1 = new a1("Covid-19");
            Thread th=new Thread(t1);
            th.start();
      }
}                          
                                 
           
