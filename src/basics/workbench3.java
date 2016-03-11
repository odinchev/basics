package basics;
import java.util.Scanner;
public class workbench3
{
  public static void main(String[]args)
  {
     Scanner keyboard=new Scanner(System.in);
     int i=0;
     i=keyboard.nextInt();
     while(i<1000)
     {
        i+=10;
        System.out.println(i);
     }
     System.out.println(i);
  }
}
