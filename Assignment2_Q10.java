import java.util.*;
class Assignment2_Q10
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
double m,g,h,v,e;
System.out.println("enter the value of m");
m=in.nextDouble();
System.out.println("enter the value of g");
g=in.nextDouble();
System.out.println("enter the value of h");
h=in.nextDouble();
System.out.println("enter the value of v");
v=in.nextDouble();
e=m*g*h*(1/2)*m*(v*v);
System.out.println("final result will be " +e);
}
}
