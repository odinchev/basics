package basics;
import java.util.Scanner;
public class testtestscore
{
 public static void main(String[]args)
 {
   Scanner keyboard=new Scanner(System.in); 
   testscore test1=new testscore(keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt());
   System.out.println("the average is"+test1);
    
    
 }
}
