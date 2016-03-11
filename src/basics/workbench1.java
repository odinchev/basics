package basics;
import java.util.Scanner;
public class workbench1
{
 public static void main(String[]args)
 {
    Scanner keyboard=new Scanner(System.in);
    double i=keyboard.nextInt();
    while(i<100)
    {
       i*=10;
    }
    System.out.println(i);
 }
}
