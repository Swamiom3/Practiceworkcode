import java.util.*;

       class Student_grade
        {
         public static void main(String[]args)
         {
          Scanner sc=new Scanner(System.in);
           int physics,chemistry,maths,computer,biology;
            double percentage;
          
            System.out.println("ENTER YOUR PHYSICS MARKS");
               physics=sc.nextInt();
             System.out.println("ENTER YOUR chemistry MARKS");
                chemistry=sc.nextInt();
              System.out.println("ENTER YOUR maths MARKS");
                maths=sc.nextInt();
               System.out.println("ENTER YOUR computer MARKS");
                 computer=sc.nextInt();
                System.out.println("ENTER YOUR biology MARKS");
                 biology=sc.nextInt();

               percentage=((physics+chemistry+maths+computer+biology)*100)/500;
                System.out.println("THIS IS YOUR PERCENTAGE"+percentage);


               
               if (percentage>=60 && percentage <= 100)
        
               System.out.println( "CONGRATULATION YOU HAVE PASS AND GOT GRADE A AND PERCENTAGE IS   "+percentage );
            
                 else if (percentage<=59 && 50<=percentage)
                 System.out.println( "CONGRATULATION YOU HAVE PASS AND GOT GRADE B AND PERCENTAGE IS   "+percentage);
             
                else if (percentage<=49 &&  40<=percentage)
                 System.out.println( "CONGRATULATION YOU HAVE PASS AND GOT GRADE C AND PERCENTAGE IS   "+percentage);

                  else if (percentage<=40)
                 System.out.println("YOU ARE FAIL AND PERCENTAGE IS  "+percentage);
                  
                 else
                  System.out.println("please enter valid num");
}
}

            
            

           
          