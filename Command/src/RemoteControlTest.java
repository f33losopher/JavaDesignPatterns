import Commands.GarageDoorOpenCommand;
import Commands.LightOnCommand;
import Invoker.SimpleRemoteControl;
import Receiver.GarageDoor;
import Receiver.Light;


public class RemoteControlTest
{

   /**
    * @param args
    */
   public static void main(String[] args)
   {
      SimpleRemoteControl remote = new SimpleRemoteControl();
      Light light = new Light("Garage Light");
      GarageDoor garageDoor = new GarageDoor("");
      LightOnCommand lightOn = new LightOnCommand(light);
      GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
      
      remote.setCommand(lightOn);
      remote.buttonWasPressed();
      remote.setCommand(garageOpen);
      remote.buttonWasPressed();
   }

}
