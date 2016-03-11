package basics;
import java.util.Scanner;

public class excersicethree
{
    public static void main(String[]args)
    {
       Scanner keyboard=new Scanner(System.in);
double tax;
double item1;
double item2;
double item3;
System.out.println("what is the tax");
tax=keyboard.nextDouble();
System.out.println("choose the prices");
item1=keyboard.nextDouble();
item2=keyboard.nextDouble();
item3=keyboard.nextDouble();

System.out.println(item1*tax+"\n"+item2*tax+"\n"+item3*tax);
System.out.println("tax is"+tax);



       
       
       
       
       
    }

}
