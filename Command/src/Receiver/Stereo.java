package Receiver;

public class Stereo
{
   private String name;
   
   public Stereo(String name)
   {
      this.name = name;
   }

   public void on()
   {
      System.out.println(name + " Stereo On");
   }

   public void off()
   {
      System.out.println(name + " Stereo Off");
   }

   public void setCd()
   {
   }

   public void setDvd()
   {
   }

   public void setRadio()
   {
   }

   public void setVolume(int volume)
   {
   }
}
