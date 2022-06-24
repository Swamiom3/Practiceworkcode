import java.util.*;
class Sepreatenum
  { 
      public static void main(String[]args)
     {
       Scanner sc=new Scanner(System.in);


       int rem;
       System.out.printf("\n\n\t\t\tENTER YOUR NUMBER:  ");
       int n=sc.nextInt();

         int i=n;
           
           while(i!=0)
           {
            rem=i%10;
            System.out.printf("\t"+rem + " ");
             i= i/10;

            }
 
       }
   }