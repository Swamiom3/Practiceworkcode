import java.util.*;

class A17062022_Q1
    {
   public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
int a,s,m,d;
    
    System.out.println("type your values");
    int v1=sc.nextInt();
    int v2=sc.nextInt();
    System.out.println("Type your choice");
    int n=sc.nextInt();


     a= v1+v2;
     s= v1-v2;
     m= v1*v2;
     d= v1/v2;

switch(n)
{

case 1:
{
System.out.println(a+ "this is addition of two num");
break;
}
case 2:
{
System.out.println(s+ "this is sub of two num");
break;
}
case 3:
{
System.out.println(m+ "this is multiplication of two num");
break;
}
case 4:
{
System.out.println(d+ "this is division of two num");
break;
}
default:
{
System.out.println("please select your correct choice");
break;
}
}
}
}

