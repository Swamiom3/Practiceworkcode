import java.util.*;
class test1_gretestnumberprogram
   {
    public static void main(String[]args)
   {
Scanner in=new Scanner(System.in);
      System.out.println("Enter you three values");

       int p1=in.nextInt();
       int p2=in.nextInt();
       int p3=in.nextInt();

        if(p1>p2 && p1>p3)
          {
            System.out.println(p1+ "This is your greather value");
            }
             else if (p2>p1 && p2>p3)
             {
              System.out.println(p2+ "This is your greather value");
              }
               else if (p3>p1 && p3>p2)
              {
                System.out.println(p3+ "This is your greather value");
               }
                 else
               {
                 System.out.println( "THREE ARE SAME VALUES");
                }
}
}
   