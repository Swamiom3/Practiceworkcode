import java.util.*;

class Areaoftriangle
    {
     public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      double area;
       
       
       System.out.printf("\n\n\t\t\tENTER YOUR BASE LENGTH=\t");
       double b=sc.nextDouble();

       System.out.printf("\n\n\t\t\tENTER YOUR HEIGHT LENGTH= ");
       double h=sc.nextDouble();

       area= 0.5*b*h;
       System.out.printf("\n\n\t\t\tUSER BASE LENGTH=\t"+b);
       System.out.printf("\n\n\t\t\tUSER BASE LENGTH=\t"+h);
       System.out.printf("\n\t\t\t================================");
       
       System.out.println("\n\t\t\tTHIS IS YOUR AREA OF TRIANGLE="+area);
}
}



