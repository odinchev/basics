package basics;

public class book
{
   private String author;
   private String title;
   private double price;
   private int pages;
   
   public book()
   {
      author="none";
      title="none";
      price=0.00;
      pages=0;
       
   }
   public book(String author,String title,double price,int pages)
   {
      this.author=author;
      this.title=title;
      this.price=price;
      this.pages=pages;     
   }
 
   public void setprice (double p)
   {
      
      price=p;
      
   }
  
  public String getauthor()
   {
   return author;
   }
  public String gettitle()
  {
    return title; 
  }
  public double getprice()
  {
     return price;
  }
  public int getpages()
  {
     return pages;
  }
  public String toString()
  {
     return author+""+title+""+pages+""+(price-price*20/100);
  }
}
