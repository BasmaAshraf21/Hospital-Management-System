
package hospital.management.system.pkgfinal;


public class Person extends FileManager
{
     protected String name;
     protected String id;
     protected String phoneNumber;
     protected String gender;
     protected String adress;
     protected String email;
     protected String age;
    
public boolean setname( String c){
          boolean redLamp = false;
          for(int i=0;i<c.length(); i++)
              if(c.charAt(i) < 'A' || c.charAt(i) > 'z')
                  redLamp = true;
     this.name=c;
          return redLamp;
}
    
      public boolean setID( String c){
          boolean redLamp = false;
          for(int i=0;i<c.length(); i++)
              if(c.charAt(i) > '9' || c.charAt(i) < '0')
                  redLamp = true;
     this.id=c;
     return redLamp;
}
    
       public boolean setphonenumber( String c){
           boolean redLamp = false;
          for(int i=0;i<c.length(); i++)
              if(c.charAt(i) > '9' || c.charAt(i) < '0')
                  redLamp = true;
     this.phoneNumber=c;
     return redLamp;
}
   
       public boolean setgender( String c){
           boolean redLamp = false; // false = done
           if(c.equals("male"));
           else if(c.equals("Male"));
           else if(c.equals("female"));
           else if(c.equals("Female"));
           else redLamp = true; // true = wrong
           this.gender=c;
           return  redLamp;
}
    
       public void setadress( String c){
     this.adress=c;
}
    
       public boolean setemail( String c){
           boolean redLamp = false;
           if(c.contains(" ")) redLamp = true;
           if(c.endsWith("@yahoo.com"));
           else if(c.endsWith("@hotmail.com"));
           else if(c.endsWith("@gmail.com"));
           else redLamp = true;
           this.email=c;
           return redLamp;
}
    
       public boolean setage( String c){
           boolean redLamp = false;
           if(c.length() > 2)
               redLamp = true;
          for(int i=0;i<c.length(); i++)
              if(c.charAt(i) > '9' || c.charAt(i) < '0')
                  redLamp = true;
     this.age=c;
     return redLamp;
     
}
   
    
    
}
