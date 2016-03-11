package basics;


public class chessboard
{
  public static void main(String []args)
  {
    
    double grains = 1.0 ;
 
   
  double  chesssquares=1.0;
    
     for (grains=1.0;grains<64*(grains* 2);)
  {
     grains=grains*Math.pow(2, 64);
     if ( grains>=grains*Math.pow(2, 64))
     {
        break;
     }
     
  }
  System.out.println(grains);
  
  
  
  double x=1;
  double total = 1;
  
  for(int i = 2; i<=64; i++)
  {
     x = 2*x;
     total = total +x;
  }
  System.out.println(total);
  }
  
}
