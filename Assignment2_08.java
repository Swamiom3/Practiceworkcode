import java.util.*;
class Assignment2_08
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
double r,pi,h,v;
System.out.println("enter the value of r");
r=in.nextDouble();
pi=3.14;
System.out.println("enter the value of h");
h=in.nextDouble();
v=pi*(r*r)*h;
System.out.println("this is area if sphere " +v);
}
}

