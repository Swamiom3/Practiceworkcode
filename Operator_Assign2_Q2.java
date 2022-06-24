import java.util.Scanner;
class Operator_Assign2_Q2
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("type any year");
int year =s.nextInt();
boolean flag = false;

if(year% 400 == 0)
{
     flag = true;
 }
else if(year % 100 == 0)
  {
     flag = false;
   }
else if(year % 4 == 0)
 {
     flag = true;
   }

else
{
     flag = false;
 }
if(flag)
  {
System.out.println("year"+year+"this is leap year");
    }
else
{
System.out.println("year"+year+"this is not leap year");

  }
}
}
