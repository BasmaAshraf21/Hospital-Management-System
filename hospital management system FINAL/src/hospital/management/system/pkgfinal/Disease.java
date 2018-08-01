
package hospital.management.system.pkgfinal;


public class Disease {
     protected String Describtion;
     protected String Disease_Name;
      public void setdescribtion ( String c){
     this.Describtion =c;
}
    
public boolean setDisease_Name( String c){
          boolean redLamp = false;
          for(int i=0;i<c.length(); i++)
              if(c.charAt(i) < 'A' || c.charAt(i) > 'z')
                  redLamp = true;
     this.Disease_Name=c;
          return redLamp;
}
}
