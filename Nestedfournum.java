import java.util.*;
class Nestedfournum
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
      System.out.printf("\n\t\t\tENTER YOUR C NUMBERS=\t");
       int d=sc.nextInt();



    if (a<b)
    {
       if(a<c)

      {
        if(a<d)
        System.out.println("\n\t\t\tNUMBER A IS smallest THAN B AND C AND D");
        }
         }
  
    if (b<a)
    {
       if (b<c)
       {
        if (b<d)
        System.out.println("\n\t\t\tNUMBER B IS smallets THAN A AND C");
     }
      }

       

    if (c<a)
    {
       if (c<b)
      {
        if (c<d)
       System.out.println("\n\t\t\tNUMBER C IS smallest THAN A AND B");
     }
}
     
     if (d<a)
    {
      if (d<b)
      
        {
       if (d<c)
       System.out.println("\n\t\t\tNUMBER B IS smallets THAN A AND C");
        }
      }





}



}

