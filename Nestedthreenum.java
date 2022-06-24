import java.util.*;
class Nestedthreenum
    {
      public static void main(String[]args)
     {
      Scanner sc=new Scanner(System.in);
      System.out.printf("\n\t\t\tENTER YOUR A NUMBERS=\t");
       int a=sc.nextInt();
      System.out.printf("\n\t\t\tENTER YOUR B NUMBERS=\t");
       int b=sc.nextInt();
      System.out.printf("\n\t\t\tENTER YOUR C NUMBERS=\t");
       int c=sc.nextInt();



    if (a<b)
    {
       if(a<c)
       System.out.println("\n\t\t\tNUMBER A IS smallest THAN B AND C");

      }
  
    if (b<a)
    {
       if (b<c)

       System.out.println("\n\t\t\tNUMBER B IS smallets THAN A AND C");
     }

    if (c<a)
    {
       if (c<b)

       System.out.println("\n\t\t\tNUMBER C IS smallest THAN A AND B");
     }
}
}