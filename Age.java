import java.util.*;
class Age
{
         public static void main(String[]args)
          {
           Scanner sc=new Scanner(System.in);
           System.out.printf("\n\t\t\tENTER YOUR AGE=");
           int a=sc.nextInt();



      if(a >= 18)
      {
      System.out.println("\n\t\t\tYOU ARE ELIGIBLE FOR THE VOTE" );
      System.out.println("\n\t\t\t===========================");
       }

      if(a < 18)
     {
      System.out.println("\n\t\t\tYOU ARE NOT ELIGIBLE FOR THE VOTE");
      System.out.println("\n\t\t\t===========================");
      }


}
}