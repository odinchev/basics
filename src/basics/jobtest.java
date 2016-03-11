package basics;

public class jobtest
{
  public static void main(String [] args)
  {
     Person pers1=new Person("bob","1.1.1911");
     Job j1=new Job(12,"baker",pers1 );
     System.out.println(j1);
     Person pers2=new Person ("jake","1.2.1912");
     Job j2=new Job(5,"cooker",pers2);
     System.out.println(j2);
  }
}
