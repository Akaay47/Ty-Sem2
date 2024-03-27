#include<stdlib.h>
#include<math.h>
#include<stdlib.h>
void main()
{
     int head,n;
     
     printf("\n Enter the number of requested I/O blocks on disk : ");
     scanf("%d",&n);
     
     printf("\n Enter the read head on disk : ");
     scanf("%d",&head);
     
     int cy[n];
     int ini[n];
     printf("\n Enter the Blocks :: ");
     for (int i=0;i<n;i++)
          scanf("%d",&cy[i]);
          
     for (int i=0;i<n;i++)
          ini[i]=cy[i];
              
     printf("The Requested Blocks are : ");
     for (int i=0;i<n;i++)
         printf(" %d",cy[i]);
         
     int sort[n+1];
     for (int i=0;i<n;i++)
     {
         for (int j=0;j<n;j++)
         {
             if (cy[j]>cy[j+1])
             {
                 int temp=cy[j];
                 cy[j]=cy[j+1];
                 cy[j+1]=temp;
             }
         }
      }
      
      printf("\n The disk after sorting : "); 
      for (int i=0;i<n;i++)
          printf(" %d",cy[i]);
         
     // printf("\n The disk after adding read head : ");
      for (int i=0;i<n+1;i++)
      {
          if (head < cy[i] && head > cy[i-1])
          {
              sort[i]=head;
              continue ;
          }
          else
          {
              sort[i]=cy[i];
          }
       }
       
       printf("\n The disk after adding read head : ");
       for (int i=0;i<n+1;i++)
            printf(" %d",sort[i]);
            
       int total=0;
       for (int i=0;i<n;i++)
       {
           if (i==0)
              total+=abs(head-ini[i]);
           else
               total+=abs(ini[i]-ini[i-1]);
       }
       
       printf("\n Total movements : %d\n",total);
}                                                     
     
