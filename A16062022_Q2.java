import java.util.*;
  class A16062022_Q2
      {
         public static void main(String[]args)
      {
         Scanner in=new Scanner(System.in);
         System.out.println("enter value ");
         int a=in.nextInt();
        int div;
        
            div= a%5;
         if (a%5 == 0)
          System.out.println("this is divisible by 5 and ans is " + div);
else
          System.out.println("this is not divisible by 5");
}
}
