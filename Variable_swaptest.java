
class Variable_swaptest
{
public static void main(String[]args)
{
int a=40;
int b=20;

System.out.println("Value of a and b before swap");

System.out.println("value of a="+a);
System.out.println("value of b="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("Value of a and b after swap");
System.out.println("this is value of a="+a);
System.out.println("this is value of b="+b);
}
}