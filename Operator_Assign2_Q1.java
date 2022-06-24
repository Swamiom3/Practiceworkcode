import java.util.*;
class Operator_Assign2_Q1
    {
   public static void main(String[]args)
    {
     Scanner in=new Scanner(System.in);
System.out.println("enter marks m");
int m=in.nextInt();
     
      
 if(m<25)

    {
     System.out.println("your grade is F"+m);
      }
else if (m>25 && m<45)

 {
     System.out.println("your grade is E"+m);
      }
else if(m>45 && m<50) 

 {
     System.out.println("your grade is D"+m);
      }
else if(m>50 && m<60)

 {
     System.out.println("your grade is C "+m);
      }
else if(m>60 && m<80)

 {
     System.out.println("your grade is B"+m);
      }
else if(m<80)

 {
     System.out.println("your grade is A"+m);
      }
else 
 {
     System.out.println("invalid result " +m);
      }
        }
         }   