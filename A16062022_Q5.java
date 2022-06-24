import java.util.*;
class A16062022_Q5
    {
   public static void main(String[]args)
    {
     Scanner in=new Scanner(System.in);
double physics,chemistry,biology,maths,computer,per;

System.out.println("enter the five subject marks ");

      physics=in.nextDouble();
      chemistry=in.nextDouble();
      biology=in.nextDouble();
      maths=in.nextDouble();
      computer=in.nextDouble();

per=((physics+chemistry+biology+maths+computer)/500)*100;
    

if(per >= 90)
{
System.out.println("your grade is A mark obtained is "+per);
}
else if(per >= 80)
{
System.out.println("your grade is B mark obtained is "+per);
}
else if(per >= 70)
{
System.out.println("your grade is C mark obtained is "+per);
}
else if(per >= 60)
{
System.out.println("your grade is D mark obtained is "+per);
}
else if(per >= 40)
{
System.out.println("your grade is E mark obtained is "+per);
}
else if(per < 40)
{
System.out.println("your grade is F mark obtained is "+per);
}
else if(per >= 80)
{
System.out.println("your fail and mark obtained is ");
}
}
}
