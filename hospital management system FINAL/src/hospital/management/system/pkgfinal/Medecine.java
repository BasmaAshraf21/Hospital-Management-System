
package hospital.management.system.pkgfinal;


public class Medecine {
     protected Double Medecine_Cost;
     protected String Medecine_ID;
     protected String Quantity;
     protected String Medecine_Name;
    
    
      public void setMedecine_Cost( Double c){
     this.Medecine_Cost=c;
}
      
    
      public boolean setMedecine_ID( String c){
          boolean redLamp = false;
          for(int i=0;i<c.length(); i++)
              if(c.charAt(i) > '9' || c.charAt(i) < '0')
                  redLamp = true;
     this.Medecine_ID=c;
     return redLamp;
}
     
     
      public boolean setquantity( String c){
          boolean redLamp = false;
          for(int i=0;i<c.length(); i++)
              if(c.charAt(i) > '9' || c.charAt(i) < '0')
                  redLamp = true;
     this.Quantity=c;
     return redLamp;
}
     
      
      public boolean setMedecine_Name( String c){
          boolean redLamp = false;
          for(int i=0;i<c.length(); i++)
              if(c.charAt(i) < 'A' || c.charAt(i) > 'z')
                  redLamp = true;
     this.Medecine_Name=c;
          return redLamp;
}
    
    
}
