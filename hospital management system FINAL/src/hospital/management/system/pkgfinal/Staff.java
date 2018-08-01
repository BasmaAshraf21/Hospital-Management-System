
package hospital.management.system.pkgfinal;
import java.util.*;
import java.io.*;


public class Staff extends Person
{
    protected  double salary;
    protected String password;
    protected String userName;
    
      public void setsalary( Double c){
          
     this.salary=c;
}
   
       public boolean setpasswod( String c){
           boolean redLamp = false;
           if(c.length() < 4)
               redLamp = true;
     this.password=c;
     return redLamp;
}
   
       public boolean setusername( String c){
           boolean redLamp = false;
          for(int i=0;i<c.length(); i++)
              if(c.charAt(i) < 'A' || c.charAt(i) > 'z')
                  redLamp = true;
     this.userName=c;
          return redLamp;
}
   
}
//    public void logIn()
//    
//}
