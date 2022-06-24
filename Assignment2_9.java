import java.util.*;
class Assignment2_9
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
int a,r,t,si,ci;
System.out.println("enter the value of a");
a=in.nextInt();
System.out.println("enter the value of r");
r=in.nextInt();
System.out.println("enter the value of t");
t=in.nextInt();
si=(a*r*t)/100;
System.out.println("the simple intrest is"+si);
ci=a(1+(r/100))*(1+(r/100))-a;
System.out.println("the compund intrest is"+ci);

}
}
