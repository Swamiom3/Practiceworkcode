import java.util.*;
class Switch_AQ2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("*************Menu***********");
System.out.println("1.area of circle"+"\n"+"2.Area of rectangle"+"\n"+"3.Area of Square"+"\n"+"4.Area of trangle");
System.out.println("Enter two numbers");
int x= sc.nextInt();
int y= sc.nextInt();

System.out.print("ENTER YOUR CHOICE__");
int n=sc.nextInt();

switch(n)
{
case 1:
{
double pi;
pi=3.14;
 double result=pi*x*x;
System.out.println("THIS IS AREA OF CIRCLE __"  +result);
break;
}
case 2:
{
int result=x*y;
System.out.println("THIS IS AREA OF RECTANGLE__ "  +result);
break;
}
case 3:
{
int result=x*x;
System.out.println("THIS IS AREA OF SQUARE __ "  +result);
break;
}
case 4:
{
int result=(x*y)/2;
System.out.println("THIS IS AREA OF triangle __ "  +result);
break;
}
}
}
}




