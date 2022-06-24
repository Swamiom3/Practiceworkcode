import java.util.*;
class Switch_AQ4
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.println("ENTER OF YOUR CHOICE");
int n=sc.nextInt();

switch(n)
{
case 1:
{
System.out.println("THIS MONTH IS JANUARY AND NO OF DAYS IS 31");
break;
}
case 2:
{
System.out.println("THIS MONTH IS FEBRUARY AND NO OF DAYS IS 28"+"\n"+"AND WHEN LEAP YEAR IS THERE THEN 29 DAYS");
break;
}
case 3:
{
System.out.println("THIS MONTH IS MARCH AND NO OF DAYS IS 31");
break;
}
case 4:
{
System.out.println("THIS MONTH IS APRIL AND NO OF DAYS IS 30");
break;
}
case 5:
{
System.out.println("THIS MONTH IS MAY AND NO OF DAYS IS 31");
break;
}
case 6:
{
System.out.println("THIS MONTH IS JUNE AND NO OF DAYS IS 30");
break;
}
case 7:
{
System.out.println("THIS MONTH IS JULY AND NO OF DAYS IS 31");
break;
}
case 8:
{
System.out.println("THIS MONTH IS AUGUST AND NO OF DAYS IS 31");
break;
}
case 9:
{
System.out.println("THIS MONTH IS SEPTEMBER AND NO OF DAYS IS 30");
break;
}
case 10:
{
System.out.println("THIS MONTH IS OCTOBER AND NO OF DAYS IS 31");
break;
}
case 11:
{
System.out.println("THIS MONTH IS NOVEMBER AND NO OF DAYS IS 30");
break;
}
case 12:
{
System.out.println("THIS MONTH IS DECEMBER AND NO OF DAYS IS 31");
break;
}
default:
{
System.out.println("PLEASE ENTER NU BETWEEN 1 TO 12");
break;
}
}
}
}

