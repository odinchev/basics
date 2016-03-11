package basics;
import java.util.Scanner;
public class quadraticequasion
{
 public static void main(String []args)
 {
    Scanner keyboard=new Scanner(System.in);
    int a;
    int b;
    int c;
 int d;
    double x1;
    double x2;
    int x;
    System.out.println("enter three numbers");
    a=keyboard.nextInt();
    b=keyboard.nextInt();
    c=keyboard.nextInt();
    d=b*b-4*a*c;
    System.out.println(Math.sqrt(d));
    if(d<0)
    {
       System.out.println("no result ");
    }
    else if(d==0)
    {
       x=-(b/(2*a));
       System.out.println("x is "+x+".");       
    }
    else 
    {
       x1=(-b + Math.sqrt(d))/(2*a);
       System.out.println("x1  "+x1);
       x2=(-b - Math.sqrt(d))/(2*a);
       System.out.println("x2  "+x2);
    }
 }
 
}
