import java.util.*;
class swapsample_program
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("THIS IS VALUE BEFORE SWAP");

int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("value of a="+a);
System.out.println("value of b="+b);

a=a+b;
b=a-b;
a=a-b;
System.out.println("THIS VALUES AFTER SWAP");
System.out.println("THIS IS VALUE OF A AFTER SWAP a="+a);
System.out.println("THIS IS VALUE OF B AFTER SWAP b="+b);
}
}