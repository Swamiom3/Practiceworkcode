import java.util.*;
    class A16062022_Q1
      {
    public static void main(String[]args)
      {
     Scanner sc=new Scanner(System.in);

   
    System.out.println("Type character ch");
    char ch = sc.next().charAt(0);  

if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || 
ch=='u') 
     System.out.println(ch + "this is vowel character");

else
     System.out.println(ch + "this is not vowel");
           }
           }