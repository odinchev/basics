package basics;
import java.util.Scanner;
public class leapyearcalculator
{
 public static void main(String[]args)
 {
    Scanner keyboard=new Scanner(System.in);
    
    mydate date1=new mydate(0,0,2008);
    int count = 0;
    
    for( int i=keyboard.nextInt();i<=2016;i++)
    {
       
       date1.setyear(i);
      
       if(date1.isLeapyear())
       {
          count++;
          
       }
        
      
    }
    
    System.out.println(count);
 }
 
}
