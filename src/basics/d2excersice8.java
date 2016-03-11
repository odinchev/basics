package basics;
import java.util.Scanner;


public class d2excersice8
{
 public static void main(String[]args)
 {
    Scanner keyboard=new Scanner(System.in);
    double shares;
    double shareprice1;
    double comissionbought;
    
    double soldprice;
    double comissionsell;
    double profit1;
    double profit2;
  System.out.println("comission");
    comissionbought=keyboard.nextDouble();
   
    System.out.println("shares");
    shares=keyboard.nextDouble();
    System.out.println("shareprice");
    shareprice1=keyboard.nextDouble();
    
    
    double moneypaid =shares*shareprice1;
    System.out.println("comission");
    comissionbought=(double) moneypaid*(comissionbought/100.0);
    profit1=moneypaid-comissionbought;
    
    
    System.out.println("shares"+shares+"shareprice"+shareprice1+"money paid"+moneypaid+"profit made"+profit1+"the commision was"+comissionbought);
   
    System.out.println("share price sell");
    soldprice=keyboard.nextDouble();
    double moneypaid2=soldprice*shares;
    System.out.println("comission sell");
    comissionsell=keyboard.nextDouble();
    comissionsell=(double)moneypaid2*(comissionsell/100);
    
    
    
    
    
    double sharepricesell;
    comissionsell=(double) moneypaid2*(2.0/100.0);
    profit2=moneypaid2-comissionsell;
    System.out.println("shares"+shares+"shareprice"+soldprice+"moneypaid"+moneypaid2+"profitmade"+profit2+"comission"+comissionsell);
    
    
    
    
    
    
    
    
    
 }
}
