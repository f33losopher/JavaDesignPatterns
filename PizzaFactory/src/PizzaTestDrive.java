
public class PizzaTestDrive
{
  public static void main(String[] args)
  {
    PizzaStore nyStore = new NYPizzaStore();

    Pizza pizza = nyStore.orderPizza("Cheese");

    System.out.println("Ethan ordered a " + pizza.getName() + "\n");
  }
}
