
package hospital.management.system.pkgfinal;

public class Rooms {
   protected String RoomNumber ;
   protected String RoomLocation ;
   public boolean steroomumber (String c)
   {
       boolean redLamp = false;
          for(int i=0;i<c.length(); i++)
              if(c.charAt(i) > '9' || c.charAt(i) < '0')
                  redLamp = true;
     this.RoomNumber=c;
     return redLamp;
   }
    
    public boolean steroomlocation (String c)
   {
       boolean redLamp = false;
          for(int i=0;i<c.length(); i++)
              if(c.charAt(i) > '9' || c.charAt(i) < '0')
                  redLamp = true;
     this.RoomLocation=c;
     return redLamp;
   }
   
   
}
