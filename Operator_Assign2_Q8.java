import java.util.*;
class Operator_Assign2_Q8
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.println("enter the values");
    int p1=in.nextInt();
    int p2=in.nextInt();
    int p3=in.nextInt();
if (p1<p2 && p1<p3)
{
System.out.println(p1+"this is gretest num");
}
else if (p2<p1 && p2<p3)
{
System.out.println(p2+"this is gretest num");
}
else if (p3<p1 && p3<p2)
{
System.out.println(p3+"this is gretest num");
}
else 
{
System.out.println("invalid condition");
}
}
}
