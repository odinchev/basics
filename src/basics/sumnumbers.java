package basics;
import java.util.Scanner;
public class sumnumbers
{
  public static void main(String []args)
  {
     Scanner keyboard=new Scanner(System.in);
     int i;
     int j=42;
     int sum;
    int j2=0;
     System.out.println("enter a positive nonzero integer number");
     i=keyboard.nextInt();
     for(;j<=i;j++)
     {
      
        System.out.println(j);
        
     }
       
     for(;j2<=i;j2++)
     {
        sum=j2+j2;
        System.out.println(sum);
        
     }
     
     
  }
}
