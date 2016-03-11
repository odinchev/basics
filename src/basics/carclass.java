package basics;

public class carclass
{
 private int yearmodel;
 private String make;
 private int speed;
 private int accelerate;
 
  public carclass()
  {
     yearmodel=1;
     make="none";
     speed=0;
  }
  public carclass(int yearmodel,String make,int speed)
  {
     this.yearmodel=yearmodel;
     this.make=make;
     this.speed=speed;
  }

 public void setyearmodel (int y)
 {
    yearmodel=y;
 }
 public void setmake (String m)
 {
    make=m;
 }
 
 public void setspeed (int s)
 {
 
    speed=s;
   
 }


 public int getyearmodel()
 {
    return yearmodel;
   
 }
 public String getmake()
 {
    return make;
 }
 public int getspeed()
 {
    return speed;
 }
 public String toString()
 {
    return yearmodel+make+speed;
 }
}
