import java.util.*;
class Twonumsame
{
         public static void main(String[]args)
          {
           Scanner sc=new Scanner(System.in);
           System.out.printf("\n\t\t\tENTER YOUR FIRST NUMBER=");
           int a=sc.nextInt();
           System.out.printf("\n\t\t\tENTER YOUR  NUMBERS=");
           int b=sc.nextInt();



      if(a>b)
{
     
      System.out.println("\n\t\t\tNUMBER A IS GREATER THAN B" );
       System.out.println("\n\t\t\t===========================");
}
      if(a<b)
{
      System.out.println("\n\t\t\tNUMBER B IS GREATHER THAN A");
       System.out.println("\n\t\t\t===========================");
}
     
      if(a==b)
{
      System.out.println("\n\t\t\tBOTH NUMBER ARE THE SAME");
       System.out.println("\n\t\t\t=========================");
}

}
}