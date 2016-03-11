package basics;

public class tracttest
{
 public static void main(String[]args)
 {
    tractclass tract=new tractclass(4,1);
    tractclass tract1=new tractclass(1,4);
    System.out.println(tract+"  "+tract.getarea());
    System.out.print(tract1+" "+tract1.getarea());
    
 }
}
