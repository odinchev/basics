package basics;

public class areacalculator
{
 
     
     static int radius=15;
     static double width=15;
    static double length=15;
    static int height=15;
      public static double calc(double radius)
     {
        
        return 3.14*Math.pow(radius, radius);
        
      
        
        
        
        
     
  }
      public static double calc(double width,double length )
      
      {
         width=15;
         length=15;
         return width*length;
         
      }
      
      
      
      public static double calc(double radius,int height)
      {
         return 3.14*Math.pow(radius,radius)*height;
         
         
         
         
      }
      
      public static void main(String[]args)
      {
          System.out.println(calc(radius));
         System.out.println( calc(width,length));
         System.out.println(calc(radius,height));
         
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}
