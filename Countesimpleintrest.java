import java.util.*;
class Countesimpleintrest
 {

                        
                 public static void main(String args[])
               { 
                  Scanner sc=new Scanner(System.in);
                  System.out.printf("\n\t\t\tENTER YOUR PRINCIPLE AMOUNT: ");
                  double pa=sc.nextDouble();
                  System.out.printf("\n\t\t\tENTER YOUR RATE OF INTREST: ");
                  double rate=sc.nextDouble();
                  
                  double t=3;
                  
                  int i=1;

                      
                       
                        while(i<=3) 
                          {
                            if(i==1)
                             {
                              System.out.println("\n\t\t\tYEAR 1");
                              double SI=(pa*rate*1)/100;
                              System.out.println("\n\t\t\tTHIS IS YOUR SIMPLE INTREST: "+SI);
                              System.out.println("\n\t\t\tTHIS IS PRINCIPAL AMOUNT "+pa);
                              System.out.println("\n\t\t\tTHIS IS YOUR RATE OF INTREST "+rate);
                              System.out.println("\n\t\t\tTHIS IS YOUR TIME SPAN:  1");
                               double TP=pa+SI;
                              System.out.println("\n\t\t\tTHIS IS YOUR TOTAL PAYABLE AMOUNT: "+TP);
                              }
                              
                             
                             else if(i==2)
                              {
                               
                              System.out.println("\n\t\t\tYEAR 2");
                              double SI=(pa*rate*2)/100;
                              System.out.println("\n\t\t\tTHIS IS YOUR SIMPLE INTREST: "+SI);
                              System.out.println("\n\t\t\tTHIS IS PRINCIPAL AMOUNT "+pa);
                              System.out.println("\n\t\t\tTHIS IS YOUR RATE OF INTREST "+rate);
                              System.out.println("\n\t\t\tTHIS IS YOUR TIME SPAN:  1");
                               double TP=pa+SI;
                              System.out.println("\n\t\t\tTHIS IS YOUR TOTAL PAYABLE AMOUNT: "+TP);

                              }
                              
                             else if (i==3)
                              {
                               
                              System.out.println("\n\t\t\tYEAR 3");
                              double SI=(pa*rate*3)/100;
                              System.out.println("\n\t\t\tTHIS IS YOUR SIMPLE INTREST: "+SI);
                              System.out.println("\n\t\t\tTHIS IS PRINCIPAL AMOUNT "+pa);
                              System.out.println("\n\t\t\tTHIS IS YOUR RATE OF INTREST "+rate);
                              System.out.println("\n\t\t\tTHIS IS YOUR TIME SPAN:  1");
                               double TP=pa+SI;
                              System.out.println("\n\t\t\tTHIS IS YOUR TOTAL PAYABLE AMOUNT: "+TP);
                               }
                               
                              i++;
                          }

                               



               }           

  }