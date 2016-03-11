package basics;

public class fibonaccinumbers
{
  public static void main(String[]args)
  {
     
     int i = 0;
     int i2 = 0;
     int number1=1 ;
     int number2=0;
     int number3=1;
    
     int count=1;
     for (;count<=20; )
        
     {
        
        number1=number3+number2;
                 
                
                
               
                 i++;
                 i2++;
                 System.out.println(number3 +"+"+number2+"="+number1);
                 number2=number3;
                 number3=number1;
               
                  count++;
                  
     }
}
}