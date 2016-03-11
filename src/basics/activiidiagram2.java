package basics;

import java.util.Scanner;
public class activiidiagram2
{
 public static void main(String []args)
 {
    Scanner keyboard=new Scanner(System.in);
    int sum=0;
    int count=0;
    int value;
    while (sum<20&&count<10)
    {
    value=keyboard.nextInt();
    sum=sum+value;
    count=count+1;
    }
    if (sum<20)
    {
       System.out.println(count);
       
    }
    System.out.println(sum);
 }
}
