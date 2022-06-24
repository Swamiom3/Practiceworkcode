import java.util.*;
class Switch_AQ3
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.println("ENTER YOUR NUMBER FOR DAYS");
int n=sc.nextInt();

switch(n)
{
case 1:
{
System.out.println("THIS DAY IS MONDAY");
break;
}
case 2:
{
System.out.println("THIS DAY IS TUESDAYY");
break;
}
case 3:
{
System.out.println("THIS DAY IS WEDENSDAY");
break;
}
case 4:
{
System.out.println("THIS DAY IS THRUSDAY");
break;
}
case 5:
{
System.out.println("THIS DAY IS FRIDAY");
break;
}
case 6:
{
System.out.println("THIS DAY IS MSATURDAY");
break;
}
case 7:
{
System.out.println("THIS DAY IS SUNDAY");
break;
}
default:
{
System.out.println("PLEASE ENTER NU BETWEEN 1 TO 7");
break;
}
}
}
}

