package basics;
import java.util.Scanner;

public class d2excersice5
{public static void main(String[]args)
{
Scanner keyboard =new Scanner(System.in);
double num1;
double num2;
double num3;
double avg;
double sum;
System.out.println("enter three numbers");
num1=keyboard.nextDouble();
num2=keyboard.nextDouble();
num3=keyboard.nextDouble();
sum=num1+num2+num3;
avg=(num1+num2+num3)/3;
System.out.println("the sum of the nmbers is"+sum);
System.out.println("the average of the numbers is"+avg);








}
}
