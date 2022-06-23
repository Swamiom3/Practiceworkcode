import java.util.*;
class Switchcase
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a,b,c,d,e,f;


System.out.printf("\n\n\t\t\tCALCULATOR");
System.out.println("\n\n\t\t\t====================");
System.out.println("\n\n\t\t\tENTER YOUR CHOICE"+"\n"+"\t\t\t1:-ADD "+"\n"+"\t\t\t2:-SUB"+"\n"+"\t\t\t3:-MULTI"+"\n"+"\t\t\t4:-DIV");
System.out.println("\n\n\t\t\tENTRR YOUR TWO NUMBERS");
System.out.println("\n\n\t\t\tENTER YOUR CHOICE");
int n=sc.nextInt();

System.out.println("\n\n\t\t\tENTER YOUR VALUES");
 a=sc.nextInt();
 b=sc.nextInt();
c= a+b;
d=a-b;
e=a*b;
f=a/b;
switch (n)
{


case 1:
{

System.out.println("\n\n\t\t\tTHIS IS YOUR ADDITION OF TWO VALUES:-"+c);
System.out.println("\n\n\t\t\t=======================================");
break;

}

case 2:
{
System.out.printf("\n\n\t\t\tTHIS IS YOUR SUBSTRACTION OF TWO VALUES:-"+d);
System.out.println("\n\n\t\t\t===========================================");
break;

}

case 3:
{
System.out.printf("\n\n\t\t\tTHIS IS YOUR MULTIPLICATION OF TWO VALUES:-"+e);
System.out.println("\n\n\t\t\t=============================================");
break;


}

case 4:
{
System.out.printf("\n\n\t\t\tTHIS IS YOUR DIVISION OF TWO VALUES:-"+f);
System.out.println("\n\n\t\t\t=======================================");
break;

}
default:
System.out.println("PLEASE ENTER VALID CHOICE NUMBER");
break;
}



}
}





