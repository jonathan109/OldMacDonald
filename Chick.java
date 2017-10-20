class Chick implements Animal 
{     
   private String myType;
   private String mySound;
   public Chick(String type, String sound, String soundA)
   {
     myType = type;
     if (Math.random() < .5)
       mySound = sound;
     else 
       mySound = soundA;
   }
   public Chick()
   {
     myType = "unknown";
     mySound = "cheep";
   }
   public String getSound()
   {
     return mySound;
   }
   public String getType()
   {
     return myType;
   }
}