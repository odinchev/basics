package basics;
import java.util.Scanner;
public class loop1
{
 

public static void main (String[]args)
 {
    int n;
    Scanner keyboard=new Scanner(System.in);
    n=keyboard.nextInt();
   
    int j = 0;
    while (j<n)
    {
       j++;
       System.out.println(j);
    }
    
    
    
    for(int i =2; i<=2*n; i+=2)
    {
       System.out.println(i);
    }
   int number;
   number=keyboard.nextInt();
    for(int m=2;m<number;m=m*m)
    {
   
   System.out.println(m);
    }
 }
}
