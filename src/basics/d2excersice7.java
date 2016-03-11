package basics;
import java.util.Scanner;


public class d2excersice7
{
 public static void main(String[]args)
 {
    Scanner keyboard=new Scanner(System.in);
    double shares =1000;
    double shareprice1=32.87;
    double comissionbought;
    double moneypaid =shares*shareprice1;
    double soldprice=33.92;
    double comissionsell;
    double profit1;
    double profit2;
    comissionbought=(double) moneypaid*(2.0/100.0);
    profit1=moneypaid-comissionbought;
    System.out.println("shares"+shares+"shareprice"+shareprice1+"money paid"+moneypaid+"profit made"+profit1+"the commision was"+comissionbought);
    double moneypaid2=soldprice*shares;
    double sharepricesell;
    comissionsell=(double) moneypaid2*(2.0/100.0);
    profit2=moneypaid2-comissionsell;
    System.out.println("shares"+shares+"shareprice"+soldprice+"moneypaid"+moneypaid2+"profitmade"+profit2+"comission"+comissionsell);
    
    
    
    
    
    
    
    
    
 }
}
