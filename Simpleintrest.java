import java.util.*;

class Simpleintrest
    {
     public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
       double si,r,t,p;
        
       System.out.println("\n\n\t\t\tENTER YOUR PRINCIPAL AMOUNT"+p);
        p=sc.nextDouble();
         r=sc.nextDouble();
         System.out.println("\n\n\t\t\tENTER YOUR RATE OF INTREST"+r);
         t=sc.nextDouble();
          System.out.println("\n\n\t\t\tENTER YOUR TIME SPAN IN YEAR"+t);
           
 

       si= (p*r*t)/100;
       System.out.println("SIMPLE PRINCIPLE AMOUNT GIVEN BY USER \t"+p);
       System.out.println("TIME SPAN GIVEN BY USER\t"+t);
       System.out.println("RATE OF INTRST GIVEN BY USER\t"+r);
       System.out.println("=========================================================");

       System.out.println("THIS IS YOUR SIMPLE INTREST ON THIS PRINCIPLE AMOUNT\t"+si);
}
}



