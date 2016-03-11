package basics;
import java.util.Scanner;
public class question1
{
  public static void main (String[] args)
  {
     int number1;
     int number2;
     int number3;
   
     Scanner keyboard=new Scanner(System.in);
     number1=keyboard.nextInt();
     number2=keyboard.nextInt();
     number3=keyboard.nextInt();
     int difference=number2-number3;
     double quotient=number2/number3;
     int sum=number1+number2;
     System.out.println("type an integer"+number1);
     System.out.println("type a seccond integer"+number2);
     System.out.println("type a third integer"+number3);
       System.out.println("the product of ( "+number1+" * "+number2+")  is  "+number1*number2);
       System.out.println("the sum  of ( "+number1+" + "+number2+")  is  "+sum);
       System.out.println("the quotient of ( "+number2+" / "+number3+")  is  "+quotient);
       System.out.println("the difference of ( "+number2+" - "+number3+")  is  " +difference);
  }
}
