import Commands.CeilingFanOffCommand;
import Commands.CeilingFanOnCommand;
import Commands.GarageDoorCloseCommand;
import Commands.GarageDoorOpenCommand;
import Commands.LightOffCommand;
import Commands.LightOnCommand;
import Commands.StereoOffCommand;
import Commands.StereoOnWithCDCommand;
import Invoker.RemoteControl;
import Receiver.CeilingFan;
import Receiver.GarageDoor;
import Receiver.Light;
import Receiver.Stereo;

public class RemoteLoader
{
   public static void main(String[] args)
   {
      RemoteControl remoteControl = new RemoteControl();

      Light livingRoomLight = new Light("Living Room");
      Light kitchenLight = new Light("Kitchen");
      CeilingFan ceilingFan = new CeilingFan("Living Room");
      GarageDoor garageDoor = new GarageDoor("");
      Stereo stereo = new Stereo("Living Room");

      LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
      LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
      LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
      LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
      
      CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
      CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
      
      GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);
      GarageDoorCloseCommand garageDoorDown = new GarageDoorCloseCommand(garageDoor);
      
      StereoOnWithCDCommand stereOnWithCD = new StereoOnWithCDCommand(stereo);
      StereoOffCommand stereoOff = new StereoOffCommand(stereo);
      
      remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
      remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
      remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
      remoteControl.setCommand(3, stereOnWithCD, stereoOff);
      remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
      
      System.out.println(remoteControl);
      
      remoteControl.onButtonWasPushed(0);
      remoteControl.offButtonWasPushed(0);
      remoteControl.undoButtonWasPushed();
      remoteControl.onButtonWasPushed(1);
      remoteControl.offButtonWasPushed(1);
      remoteControl.onButtonWasPushed(2);
      remoteControl.offButtonWasPushed(2);
      remoteControl.onButtonWasPushed(3);
      remoteControl.offButtonWasPushed(3);
      remoteControl.onButtonWasPushed(4);
      remoteControl.offButtonWasPushed(4); 
      
   }
}
