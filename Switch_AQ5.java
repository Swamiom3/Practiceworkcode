import java.util.*;
class Switch_AQ5
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER ID=");
System.out.println("****************STUDENT DETAILS***********");

System.out.println("Type your choice");
    int n=sc.nextInt();

switch(n)
{

case 1:
{
System.out.println("ENTER ID=101");
System.out.println("****************STUDENT DETAILS***********");
System.out.println("STUDENT NAME:-OMKAR SWAMI"+"\n"+"EDUCATION DETAILS:-BE IN MECHANICAL"+"\n"+"MOB NUMBER:-8308590801"+"\n"+"VILLAGE:-LATUR");
break;
}
case 2:
{
System.out.println("ENTER ID=102");
System.out.println("****************STUDENT DETAILS***********");
System.out.println("STUDENT NAME:-DHIRAJ DHORMARE"+"\n"+"EDUCATION DETAILS:-BE IN MECHANICAL"+"\n"+"MOB NUMBER:-3256825"+"\n"+"VILLAGE:-LATUR");
break;
}
case 3:
{
System.out.println("ENTER ID=103");
System.out.println("****************STUDENT DETAILS***********");
System.out.println("STUDENT NAME:-GANESH PATIL"+"\n"+"EDUCATION DETAILS:-BCA "+"\n"+"MOB NUMBER:-9356871203"+"\n"+"VILLAGE:-LATUR");
break;
}
case 4:
{
System.out.println("ENTER ID=104");
System.out.println("****************STUDENT DETAILS***********");
System.out.println("STUDENT NAME:-PRAMOD "+"\n"+"EDUCATION DETAILS:-LAW"+"\n"+"MOB NUMBER:-I DONT KNOW"+"\n"+"VILLAGE:-SHIV");
break;
}
default:
{
System.out.println("please enter correct choice");

}
}
}
}