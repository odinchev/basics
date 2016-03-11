package basics;
import java.util.Scanner;
public class ifgrade
{
  public static void main(String []args)
  {
    Scanner keyboard=new Scanner(System.in);
    int grade;
    System.out.println("enter a danish grade");
    grade=keyboard.nextInt();
    if (grade==12)
      {
       System.out.println("12=a");
      }
    if(grade==10)
      {
       System.out.println("10=b");
      }
   if (grade==7)
      {
       System.out.println("7=c");
      }
    if(grade==4)
      {
       System.out.println("4=d");
       }
    if(grade==2)
      {
       System.out.println("2=e");
      }
    if(grade==0)
      {
       System.out.println("0=fx");
      }
    if(grade==-3)
      {
       System.out.println("-3=f");
      }
      }
  }

