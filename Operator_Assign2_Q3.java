import java.util.*;
class Operator_Assign2_Q3
    {
   public static void main(String[]args)
    {
     Scanner in=new Scanner(System.in);
System.out.println("enter weight_class ");
int w=in.nextInt();
     
      
 if(w<115)

    {
     System.out.println("your weight class is Flyweight");
      }
else if (w>115 && w<121)

 {
     System.out.println("your weight class is bantanweight");
      }
else if(w>122 && w<153) 

 {
     System.out.println("your weight class is Featherweight");
      }
else if(w>154 && w<186)

 {
     System.out.println("your weight class is Middleweight ");
      }

else if(w<190)

 {
     System.out.println("your weight class is heavyweight");
      }
else 
 {
     System.out.println("invalid result ");
      }
        }
         }   