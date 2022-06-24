import java.util.*;
class Studentdegree
       {
        public static void main(String[]args)
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("   ENTER YOUR A SUB MARKS   ");
          int a=sc.nextInt();
        System.out.println("   ENTER YOUR SUB B MARKS   ");
          int b=sc.nextInt();

     if (a >= 55 && b >= 45)
       System.out.println("\n\n\t\t\tCONGRATULATIONS YOU GOT DEGREE");

     else if (a >= 45 && b >= 55)
       System.out.println("\n\n\t\t\tCONGRATULATIONS YOU GOT DEGREE");

     else if (a >= 65 && b < 45)
       System.out.println("\n\n\t\t\tYOU ARE PASS IN SUB A BUT REAPPER FOR SUB B");

     else
       System.out.println("\n\n\t\t\tSORRY YOU ARE FAIL");
}
}