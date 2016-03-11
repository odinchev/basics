package basics;
import java.util.Scanner;
public class activitydiagram1
{
 public static void main(String[]args)
 {
    Scanner keyboard=new Scanner(System.in);
    int positivesum=0;
    int x;
    x=keyboard.nextInt();
    
    if (x<0)
    {
       System.out.println("x is -1");
       positivesum=positivesum+x;
       System.out.println(positivesum);
    }
    if (x<=0){
    while(x<=0)
    {
       System.out.println("enter x again");
       x=keyboard.nextInt();
    }
    positivesum=positivesum+x;
    System.out.println(positivesum);
    }
 }
}
