
package hospital.management.system.pkgfinal;


public class Department {
     protected String DepartmentName;
    protected String Code;
      public boolean setDepartmentName( String c){
          boolean redLamp = false; // false = done
     this.DepartmentName=c;
     for (int i = 0; i<c.length(); i++)
         if(c.charAt(i) > 'z' || c.charAt(i) < 'A')
             redLamp = true; // true = wrong
     return redLamp;
}
    
      public boolean setcode( String c){
           boolean redLamp = false; // false = done
     this.Code=c;
     for (int i = 0; i<c.length(); i++)
         if(c.charAt(i) > '9' || c.charAt(i) < '0')
             redLamp = true; // true = wrong
     return redLamp;
}
}