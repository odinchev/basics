package basics;
import java.util.Scanner;
import java.util.Random;
public class randomnumber2
{
  public static void main (String[]args)
  {
    
     Scanner keyboard=new Scanner(System.in);
     String cho;
     
     int number1;
     int answer;
     int right=0 ;
     Random randomnumbers= new Random();
     number1=randomnumbers.nextInt(1000)+1;
     while (right==0)
     {
     System.out.println("guess the number 1-1000");
     answer=keyboard.nextInt();
     
     if (answer==number1)
     {
        System.out.println("correct");
        right=1;
     }
     else if (answer>number1)
     {
        System.out.println("too high ");
       
     }
     else
     {
        System.out.println("too low");
        
      }
     }
     }
  }

