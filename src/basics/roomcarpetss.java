package basics;

public class roomcarpetss
{
   carpets carpet=new carpets(15, 3);
   private double carpetcost;
   private double totalcost=carpet.getarea()*carpetcost;
   
        public roomcarpetss(double carpetcost)
        {
           this.carpetcost=carpetcost;
           
        }
 public void setcarpetcost(double c)
 {
    carpetcost=c;
 }
        public double getcarpetcost()
        {
           return carpetcost;
        }
        
        
        double gettotalcost()
         {
           totalcost=carpet.getarea()*carpetcost;
            return totalcost;
         }
        
        
        
        public String toString()
        {
           return carpetcost+"";
        }
        
        
        
        
        
        
        
        
        
}
