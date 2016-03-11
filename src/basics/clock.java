package basics;
public class clock
{
   private int hour, minute, second;
   
 
   public clock(int h, int m, int s){
      hour = h;
      minute = m;
      second = s;
   }
    
      public clock(int totalTimeInSeconds){
         hour = totalTimeInSeconds/3600; 
         totalTimeInSeconds = totalTimeInSeconds-hour*3600;
         minute = totalTimeInSeconds/60; 
         second = totalTimeInSeconds-minute*60;
   }
    
   public void setHour(int h){
      hour = h;
   }
   public void setMinute(int m){
      minute = m;
   }
   public void setSecond(int s){
      second = s;
   }
   public int getHour(){
      return hour;
   }
   public int getMinute(){
      return minute;
   }
   public int getSecond(){
      return second;
   }
   public void tic(){
      second+=1;
   }
   public int convertToSeconds(){
      return hour*3600 + minute*60 + second;
   }
   public boolean isBefore(clock time){
      if(this.convertToSeconds()<time.convertToSeconds())
         return true;
      else
         return false;
   }
   public int timeInSecondsTo(clock time){
      return this.convertToSeconds()-time.convertToSeconds();
   }
   public clock timeTo(clock time){
      int between = timeInSecondsTo(time);
      clock temp = new clock(between);
      return  temp;
   }
   public String toString(){
      return hour + ":" + 
             minute + ":" +
             second +"";
     
      
   }
   public boolean timeformat24()
   {
      return false;
      
   }
   public double getistimeformat24()
   {
      if (timeformat24()==false){
     
         return hour*2-hour+minute*2-minute+second*second-second;
       
         
      }
      return hour;
   }
   public boolean settimeformat(boolean hourformat)
   {
      if (hourformat==true)
      {
         System.out.println("24 hour ");
         
      }
      else if(hourformat==false)
      {
         System.out.println("12 hour"+""+ hour/2+""+minute/2+""+second/2);
         
         }
      return false;
   }
}
