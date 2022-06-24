class Countevenodd
{

                        
                 public static void main(String args[])
            { 

                      int i=201;
                      int count=0;
                      int count2=0;
                      int sum=0;
                      int sum2=0;
                        
                       
                        while(i<=400) 
                         {
                                if(i%2==0)
                                  { 
                                     sum=sum+i;

                                     count++;
                                  }


                                 else 

                                   {
                                     sum2=sum2+i;

                                     count2++;
                                   }
                              i++;

                          }
                       
                            System.out.println("\t\t\t\nTHIS IS TOTAL OF EVEN NUMBER "+sum);
                            System.out.println("\t\t\t\nTHIS IS COUNT OF ODD NUMBER "+sum2);
                                   int diff=sum-sum2;
                            System.out.println("\t\t\t\nDifferance            "+diff);           
                            System.out.println("\t\t\t\nTHIS IS COUNT OF EVEN NUMBER "+count);
                            System.out.println("\t\t\t\nTHIS IS COUNT OF ODD NUMBER  "+count2); 
                  }

}