package basics;

public class HotelRoom
{
  private int roomnumber;
  private double rent;
  private String guest;
  
   public HotelRoom(int roomnumber,double rent)
   {
      guest="no one";
   }
   public HotelRoom(int roomnumber,double rent,String guest)
   {
      this.roomnumber=roomnumber;
      this.rent=rent;
      this.guest=guest;
   }
   public void setrent(double r)
   {
      rent=r;
   }
   public int getroomnumber(  )
   {
      return roomnumber;
   }
   public double getrent()
   {
      return rent;
   }
   public String getguest()
   {
      return guest;
   }
   public boolean isavailable()
   {
      if(guest=="no one")
      {
         return false;
      }
      return true;
      
      
      
       }
   public int checkin(String guest)
   {
      if (isavailable()==false)
      {
        System.out.print(" room booked ");
        
      }
      else if(isavailable()==true) {
         System.out.print( " room is not available ");
      }
      return 0 ;
   }
   public void checkout()
   {
      if (isavailable()==true)
      {
         guest="no one";
      }
      else {
         System.out.println(guest);
      }
   }
   public String toString()
   {
      if (isavailable()==true)
      {
         return "guest"+guest;
      }
      return roomnumber+"  rent  "+rent;
            
   }
   
   
   
   
   
   
}
