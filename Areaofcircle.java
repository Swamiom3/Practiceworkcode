import java.util.*;

class Areaofcircle
    {
     public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
       double pi,r,area;
        pi=3.14;
       System.out.println("\n\n\t\t\tENTER YOUR RADIUS");
       
       r=sc.nextInt();
       area= pi*r*r;
       System.out.println("THIS IS YOUR OF CIRCLE\t"+area);
}
}



