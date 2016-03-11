package basics;

public class testscore
{
  private int grade1;
  private int grade2;
  private int grade3;
  
  
  public testscore()
  {
     
     grade1=0;
     grade2=0;
     grade3=0;
     
  }
  public testscore(int grade1,int grade2,int grade3)
  {
    this.grade1=grade1;
    this.grade2=grade2;
    this.grade3=grade3;               
  }
 
  public int getgrade1()
  {
     return grade1;
  }
  public int getgrade2()
  {
     return grade2;
  }
  public int getgrade3()
  {
     return grade3;
  }
  public String toString()
  {
     return "avg" + (grade1+grade2+grade3) /(3);
  }
}

