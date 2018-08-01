
package hospital.management.system.pkgfinal;

public class Patient extends Person
{
     protected String Weight;
     protected String Height;
     protected String Case;
     protected String HealthProblem;
     protected String Medication;
     protected String CheckupTime;
     
    
     
  
    public boolean setweight( String c){
          boolean redLamp = false;
          if(c.length() > 3)
               redLamp = true;
          for(int i=0;i<c.length(); i++)
              if(c.charAt(i) > '9' || c.charAt(i) < '0')
                  redLamp = true;
     this.Weight=c;
     return redLamp;
}
 
      public boolean setheight( String c){
          boolean redLamp = false;
          if(c.length() > 3)
               redLamp = true;
          for(int i=0;i<c.length(); i++)
              if(c.charAt(i) > '9' || c.charAt(i) < '0')
                  redLamp = true;
     this.Height=c;
     return redLamp;
}

    
       public void setcase( String c){
     this.Case=c;
}
    
       public void sethealthProblem( String c){
     this.HealthProblem=c;
}
    
       public void setmedication( String c){
     this.Medication=c;
}
    
       public void setcheckupTime( String c){
     this.CheckupTime=c;
}
       
    
    
}
