package basics;
import java.util.Scanner;
public class HotelRoomtest
{
   public static void main (String[]args){
  Scanner keyboard=new Scanner(System.in);
  System.out.println("enter room   and and for room 1 and 2");
  HotelRoom room1=new HotelRoom(keyboard.nextInt(),keyboard.nextDouble());
  System.out.println("and now for room 2");
  HotelRoom room2=new HotelRoom(keyboard.nextInt(),keyboard.nextDouble(),"john");
  System.out.println("room"+ room1.getroomnumber());
  System.out.println("room "+room2.getroomnumber());
  if (room1.isavailable()==true)
  {
     System.out.println(" hotel 1 hotel room "+ room1.getroomnumber()+"rent "+room1.getrent()+" name "+room1.getguest());
     
  }
  
  if (room2.isavailable()==true)
  {
     
     System.out.println(" hotel 2 hotel room  "+ room2.getroomnumber()+"rent "+room2.getrent()+" name "+room2.getguest());
  }
  
  double rent=room1.getrent();
  double rent2 =room2.getrent();
  while (room1.getrent()<=0)
  {
     System.out.println("room1 rent too low");
    rent=keyboard.nextDouble();
    if (rent>0){break;}
  }
  while (room2.getrent()<=0)
  {
     System.out.println("room2 rent too low");
    rent2=keyboard.nextDouble();
    if (rent2>0){break;}
  }
  System.out.println(room1.isavailable()+"  "+room1.checkin("dave") );
  System.out.println(room2.isavailable()+"  "+room2.checkin("john") );
   }
}
