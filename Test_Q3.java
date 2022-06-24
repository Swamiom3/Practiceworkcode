import java.util.*;+
class Test_Q3
    {
     public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER YOUR CHOICE NUMBER");
int n=sc.nextInt();

int chemistry,physics,maths,computer,biology;

System.out.println("ENTER YOUR marks NUMBER");

      chemistry=sc.nextInt();
      physics=sc.nextInt();
      maths=sc.nextInt();
      computer=sc.nextInt();
      biology=sc.nextInt();


double avg= (chemistry+physics+maths+computer+biology)/5;

switch(n)
{
case 1:
{
System.out.println("STUDENT ID=1001");
System.out.println("STUDENT NAME:- OMKAR SWAMI");
System.out.println("STUDENT AVG OUT OF 500" +" "+ avg);
break;
}
case 2:
{
System.out.println("STUDENT ID=1002");
System.out.println("STUDENT NAME:- GANESH PATIL");
System.out.println("STUDENT AVG OUT OF 500" + avg);
break;
}
default:
{
System.out.println("PLEASE ENTER VALID COICE NUMBER");
break;
}
}
}
}