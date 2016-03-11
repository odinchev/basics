package basics;
import java.util.Scanner;

public class excersice3
{

   public static void main(String[]args)
   {
     int number1;
     int number2;
     int number3;
     int sum;
     
      Scanner keyboard= new Scanner(System.in);
      System.out.println("choose three numbers");
      number1=keyboard.nextInt();
      number2=keyboard.nextInt();
      number3=keyboard.nextInt();
      
         sum=number1+number2+number3;
      System.out.println("the sum is"+sum);
      
      
      
      
      
      
   }
}
