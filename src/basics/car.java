package basics;

public class car
{
   private String make;
   private String model;
   private String color;
   private String licencenumber;
   private String year;
   public car(String make,String model,String color,String licencenumber,String year)
   {
      this.make=make;
      this.model=model;
      this.color=color;
      this.licencenumber=licencenumber;
      this.year=year;
   }
   public car(String make,String model,String color,String year)
   {
      licencenumber="00000";
   }
   public String getmake()
   {
      return make;
   }
   public String getmodel()
   {
      return model;
   }
   public String getcolor()
   {
      return color;
   }
   public String getyear()
   {
      return year;
   }
   public void setcolor(String c)
   {
      color=c;
   }
   public void setlicencenumber(String l)
   {
      licencenumber=l;
   }
   public car copy()
   {
      return new car(make,model,color,licencenumber,year);
   }

   public String toString()
   {
      return make+" "+model+" "+color+" "+licencenumber+" "+year;
   }
   public boolean equals(car te)
   {
      if(make==te.make&&model==te.model&&color==te.color&&licencenumber==te.licencenumber&&year==te.year)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}
