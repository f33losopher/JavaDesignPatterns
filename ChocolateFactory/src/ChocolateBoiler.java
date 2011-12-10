public class ChocolateBoiler
{
   private volatile static ChocolateBoiler _uniqueInstance;
   private boolean                         empty;
   private boolean                         boiled;

   // Double-checked locking. This dramatically reduces the overhead
   // with "synchronized". Synchronized will also only be called on the first
   // instantiation of the class.
   public static ChocolateBoiler getInstance()
   {
      if (_uniqueInstance == null)
      {
         synchronized (ChocolateBoiler.class)
         {
            if (_uniqueInstance == null)
            {
               _uniqueInstance = new ChocolateBoiler();
            }
         }
      }
      return _uniqueInstance;
   }

   private ChocolateBoiler()
   {
      empty = true;
      boiled = false;
   }

   public void fill()
   {
      if (isEmpty())
      {
         empty = false;
         boiled = false;
         // fill the boiler with a milk/chocolate mixture
      }
   }

   public void drain()
   {
      if (!isEmpty() && isBoiled())
      {
         // drain the boiled milk and chocolate
         empty = true;
      }
   }

   public void boil()
   {
      if (!isEmpty() && !isBoiled())
      {
         // bring the contents to a boil
         boiled = true;
      }
   }

   public boolean isEmpty()
   {
      return empty;
   }

   public boolean isBoiled()
   {
      return boiled;
   }
}
