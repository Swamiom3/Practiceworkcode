import java.util.*;
class Operator_AssignQ8
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
double salary,bonus,year;
System.out.println("enter the value of salary");
salary=in.nextDouble();
System.out.println("enter the value of working year");
year=in.nextDouble();
if(year>5)
{
bonus=(salary+(salary*0.05));
System.out.println("the net amount is "+bonus);
}
else
System.out.println("sorry you are not eligible");
}
}

