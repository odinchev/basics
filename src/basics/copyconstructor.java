package basics;

public class copyconstructor
{
   private int inventoryitem;
   public copyconstructor(int inventoryitem)
   {
      
   }
      public copyconstructor(copyconstructor copy)
      {
         inventoryitem=copy.inventoryitem;
      }
}
