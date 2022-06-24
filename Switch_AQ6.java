import java.util.*;
class Switch_AQ6
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER YOUR BASIC SALARY");
int s=sc.nextInt();

if(s<=10000)
{
double gs;
gs=s+(s*0.2)+(s*0.8);
System.out.println(gs+"THIS YOUR GROSS SALARY");
}
else if (s<=20000)
{
double gs;
gs=s+(s*0.25)+(s*0.9);
System.out.println(gs+"THIS YOUR GROSS SALARY");
}
else if (s>20000)
{
double gs; 
gs=s+(s*0.30)+(s*0.95);
System.out.println(gs+"THIS YOUR GROSS SALARY");
}
else
System.out.println("INVAID INPUT");
}
}





