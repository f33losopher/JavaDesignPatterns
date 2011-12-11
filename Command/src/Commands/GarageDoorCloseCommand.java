package Commands;

import Interface.Command;
import Receiver.GarageDoor;

public class GarageDoorCloseCommand implements Command
{
   GarageDoor garageDoor;
   
   public GarageDoorCloseCommand(GarageDoor garageDoor)
   {
      this.garageDoor = garageDoor;
   }

   @Override
   public void execute()
   {
      garageDoor.down();
   }

   @Override
   public void undo()
   {
      garageDoor.up();
   }
}
