package basics;

public class testclock
{
  public static void main(String[]args)
  {
     clock clock1=new clock(14,03,12);
     clock clock2=new clock(12,12,33);
     System.out.println(clock1);
     System.out.println(clock1.settimeformat(false));
     System.out.println(clock2);
  }
}
