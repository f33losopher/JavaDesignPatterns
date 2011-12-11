package Receiver;
import Commands.LightOnCommand;

public class GarageDoor
{
   private String name;
   private Light light = new Light("Garage Door");
   private LightOnCommand lightOn = new LightOnCommand(light);
   
   public GarageDoor(String name)
   {
      this.name = name;
   }

   public void up()
   {
      System.out.println(name + " Door is UP");
   }

   public void down()
   {
      System.out.println(name + " Door is DOWN");
   }

   public void stop()
   {
      System.out.println(name + " Door is STOPPED");
   }

   public void lightOn()
   {
      lightOn.execute();
   }

   public void lightOff()
   {

   }
}
