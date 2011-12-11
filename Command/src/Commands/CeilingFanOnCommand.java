package Commands;

import Interface.Command;
import Receiver.CeilingFan;

public class CeilingFanOnCommand implements Command
{
   CeilingFan ceilingFan;

   public CeilingFanOnCommand(CeilingFan ceilingFan)
   {
      this.ceilingFan = ceilingFan;
   }
   
   @Override
   public void execute()
   {
      ceilingFan.on();
   }

   @Override
   public void undo()
   {
      ceilingFan.off();
   }

}
