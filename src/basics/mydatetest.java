package basics;

public class mydatetest
{
public static void main(String[]args)
 {
   mydate date =new mydate(1,11,2008);
    
   System.out.println(date+" "+  date.isLeapyear()+"  "+date.daysInmonth()+" "+ date.AstroSign()+" "+date.geth()+""+date.getMonthName());
   mydate date2=new mydate(12,2,2013);
  
   System.out.println(date2+"   "+date2.isLeapyear()+"   "+date2.daysInmonth()+"    "+date2.AstroSign()+"  "+date2.geth()+""+date2.getMonthName()+""+date2.IsBefore(date2));
  
  
   
   int count=0;
   mydate date3=new mydate(10,10,1996);
   mydate today = new mydate(1,3,2016);
   
   while(!(date3.getday()==today.getday() && date3.getmonth()==today.getmonth()&&date3.getyear()==today.getyear() ))
   {
      date3.nextday();
      count++;
   }
   
   System.out.println(count);
   
   
   mydate date4= date.copy();
   System.out.println(date4+ "date 4");
   if (date4.equals(date))
   {
      System.out.println("the dates are the same");
   }
   else
   {
      System.out.println("the dates are not the same");
      
   }
      mydate date5=date.copy();
      System.out.println(date5+"date5");
      date5.nextdays(100);
      System.out.println(date5+"date5");
      
      
      System.out.println(mydate.today());
   
   
 }


}
