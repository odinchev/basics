package basics;
import java.util.GregorianCalendar; 

public class mydate
{
private int day;
private int month;
private int year;
private int h;
GregorianCalendar currentDate=new GregorianCalendar();
int currentDay  =currentDate.get(GregorianCalendar.DATE);
int currentMonth =currentDate.get(GregorianCalendar.MONTH)+1;
int currentYear =currentDate.get(GregorianCalendar.YEAR);

public mydate ()
  {
   day=currentDay;
   month=currentMonth;
   year=currentYear;
  }
public mydate(int day, int month,int year)
 {
   this.day=day;
   this.month=month;
   this.year=year;
   this.h=h;
 }

public void seth (int h)
  {
   
   h=h;
  }


public void setday(int d)
  {
   day=d;

  }
public void setmonth(int m)
    
  { 
   month=m;  
   
   
   
  }
public void setyear(int y)
 {
   year=y;
   
   
   
 }
public int getday()
  {
   return day;
  }
public int getmonth()
  {
   return month;
  }
public int geth  ()
  {
   return h;
  }
public int getyear()
 {
   return year;
 }
public String toString() 
 {
  return day+" "+month+" "+year +" "; 
 }
public String AstroSign()
      {
           if((month==1 && day>19) ||  (month==2 && day<18))
           {
              return "aquarius";
           }
           else if ((month==2 && day>19)||(month==3 && day<21)){
             return "pisces";
           }
           else if ((month==3 && day>20)||((month==4 && day<20)))
           {
              return "aries";
           }
           else if((month==4 && day>19)|| (month==5 && day<21))
           {
              return "taurus";
           }
           else if((month==4 && day>20)||(month==6 && day<21))
           {
              return "gemini";
           }
           else if ((month==6 && day>20)||(month==7 && day<23))
           {
              return "cancer";
           }
           else if ((month==7 && day>23)|| ((month==8 && day<23)))
           {
              return "leo";
           }
           else if ((month==8 && day>22)||((month==9 && day<23)))
           {
              return"virgo";
           }
           else if ((month==9 && day>22) ||(month==10 && day<23))
           {
              return"libra";
           }
           else if ((month==10 && day>23)||(month==11&& day<22))
           {
              return"scorpio";
           }
           else if ((month==11 && day>21)||(month==12 && day<22))
           {
              return"sagittarius";
           }
           else if ((month==12&& day>21)||(month==1&& day<20))
           {
              return"capricorn";
           }
           else 
              
           {
           return "null";
           
           }
      }



public String DayoftheWeek()
{
    
 h=(day+13*(month+1)/5+year%100+(year%100/4)+(year/100)+5*year/100)%7;
 return "day is"+h;
}







    public int daysInmonth()
    {
       if(month==1 || month ==3)
       {
          return 31;
       }
       else if(month==4||month==6||month==9||month==11)
       {
          return 30;
       }
       else if(month == 2)
       {
          if (isLeapyear()==true)
          {
             return 29;
          }
          else
          {
             return 28;
          }
    }
       else
       {
          return -1;
       }
       
       
       
    }
       
    public  boolean isLeapyear()
    {

       
         if(year%4==0) {
            return true ;
         }
         else if(!(year%4==0))
         {
            return false;
         }
         else if(year%400==0)
         {
            return true;
         }
         else{
          return  false;
         }
    }
        public String getMonthName ()
         {
            switch (month)
            {
               case 1:
                  System.out.println("january"); 
                  break;
               case 2:
                  System.out.println("febuary");
                  break;
               case 3:
                  System.out.println("march");
                  break;
               case 4:
                  System.out.println("april");
                  break;
               case 5:
                  System.out.println("may");
                  break;
               case 6:
                  System.out.println("june");
                  break;
               case 7:
                  System.out.println("july");
                  break;
               case 8: 
                  System.out.println("august");
                  break;
               case 9:
                  System.out.println("september");
                  break;
               case 10:
                  System.out.println("october");
                  break;
               case 11:
                  System.out.println("november");
                  break;
               case 12:
                  System.out.println("december");
                  break;
                 default:
                    System.out.println("error");
                    return "" ;
            }
            return"";
         }
        public void nextday()
        {
          day++;
          
          
          if(day>daysInmonth())
          {
             day=1;
             month++;
             
             if(month>12)
             {
                month=1;
                year++;
             }
          }
          
        }
        
        public boolean equals(mydate te)
        {
           if (year == te.year && month == te.month && day == te.day)
           {
         return true;
           }
           else {
              return false;
           }
           
        }
        public mydate copy ()
        {
           return new mydate (day,month,year);
        }
        public mydate(mydate te)
        {
           day = te.day;
           month = te.month;
           year = te.year;
           
        }
        ;
       public void nextdays(int days)
       {
          for (int i=0;i<=days;i++)
          {
             nextday();
             
          }
       }
         
          public static mydate today()
          
          {
             GregorianCalendar currentDate=new GregorianCalendar();
             int currentDay  =currentDate.get(GregorianCalendar.DATE);
             int currentMonth =currentDate.get(GregorianCalendar.MONTH)+1;
             int currentYear =currentDate.get(GregorianCalendar.YEAR);
             
             
            return new mydate(currentDay,currentMonth,currentYear);
          }
          
          
          
          public boolean IsBefore(mydate date2)
          {
             if( month<=date2.getmonth()&&day<=date2.getday()&&year<=date2.getyear())
             {
                return true;
             }
            return false;
             
             
          }
          
          
          
          
       }
       
     
    


