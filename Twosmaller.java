import java.util.*;
class Twosmaller
{
         public static void main(String[]args)
          {
           Scanner sc=new Scanner(System.in);
           System.out.printf("\n\t\t\tENTER YOUR FIRST NUMBER=");
           int a=sc.nextInt();
           System.out.printf("\n\t\t\tENTER YOUR  NUMBERS=");
           int b=sc.nextInt();



      if(a<b)
      System.out.println("\t\t\tNUMBER A IS SMALLER THAN B" );

      if(a>b)
      System.out.println("\t\t\tNUMBER B IS SMALLER  THAN A");

}
}