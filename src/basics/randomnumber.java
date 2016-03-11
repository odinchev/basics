package basics;
import java.util.Scanner;
import java.util.Random;
public class randomnumber
{

   public static void main(String[]args)
   {
      
      
      int number1;
      int answer1;
      Random randomnumbers= new Random();
      Scanner keyboard=new Scanner(System.in);
      System.out.println("guess the number");
       number1=randomnumbers.nextInt(10);
      answer1=keyboard.nextInt();
      if (answer1==number1)
      {
         System.out.println("correct");
      }
      else
      {
         System.out.println("no");
         System.out.println("the number was");
         System.out.println(number1);
      }
      
   }
}
