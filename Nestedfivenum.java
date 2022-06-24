import java.util.*;
class Nestedfivenum
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
      System.out.printf("\n\t\t\tENTER YOUR d NUMBERS=\t");
       int d=sc.nextInt();
      System.out.printf("\n\t\t\tENTER YOUR e NUMBERS=\t");
       int e=sc.nextInt();



    if (a>b)
    {
       if(a>c)
      
       {
        if(a>d)

      {
        if(a>e)
        System.out.println("\n\t\t\tNUMBER A IS BIGEST THAN B,C,D AND E");
        }

        }
        }
  
    if (b>a)
    {
       if (b>c)
      {
        if (b>d)
       {
        if (b>e)
        System.out.println("\n\t\t\tNUMBER B IS BIGEST THAN A,C,D AND E");
     }
      }
      }
       

    if (c>a)
    {
       if (c>b)
        {
         if (c>d)
      {
        if (c>e)
       System.out.println("\n\t\t\tNUMBER C IS BIGEST THAN A,B,D AND E");
     }
      }
       }
     
     if (d>a)
    {
      if (d>b)
      {
        if (d>c)
      
        {
       if (d>e)

          System.out.println("\n\t\t\tNUMBER d IS bigest THAN A,B,C AND E");
        }
      } }


if (e>a)
    {
      if (e>b)
      {
        if (e>c)
      
        {
       if (e>d)

          System.out.println("\n\t\t\tNUMBER E IS bigest THAN A,B,C AND D");
        }
      } }





}



}

