
package hospital.management.system.pkgfinal;

import java.io.*;



public class FileManager  {
    public void list(String fileName){
        String line;
        String fname = "E:\\college\\PL2\\JAVA Projects\\hospital management system FINAL";
        
        try {
            FileReader fr = new FileReader(fname);
            try (BufferedReader br = new BufferedReader(fr)) {
                while ((line = br.readLine()) != null)
                {
                    System.out.println(line);
                }
            }
            
            
        }
        catch(Exception e){
            
        }
    }
           public String line;

   
    
    
    public void add(String name)
    {
            try (FileWriter fr = new FileWriter("file");BufferedWriter pf = new BufferedWriter(fr)) {
                
                 pf.close();
            }
            
         catch (IOException ex) {
        
        }
    }
    
    public boolean login(String name ,String password ) throws FileNotFoundException{
            String line = null;
            boolean log = false;
            try {
                        // FileReader reads text files in the default encoding.
                        FileReader fileReader = 
                            new FileReader("C:\\Users\\Sarah N\\Desktop\\test.txt");
                        
                try ( // Always wrap FileReader in BufferedReader.
                        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                    while ((line = bufferedReader.readLine()) != null) {
                        //System.out.println(line);
                        String[] parts = line.split("-");
                        String idPart = parts[0];
                        String passPart = parts[1];
                        if(name.equals(idPart) && password.equals(passPart) ){
                            log = true;
                            break;
                        }
                    }
                    // Always close files.
                }
                    }
                    catch(FileNotFoundException ex) {
                        System.out.println(
                            "Unable to open file '" + 
                            ".text" + "'");                
                    }
                    catch(IOException ex) {
                        System.out.println(
                            "Error reading file '" 
                            + ".text" + "'");                  
                        // Or we could just do this: 
                        // ex.printStackTrace();
                    }
            
                    return log;
    }
    
    public String search(String name ,String password ) throws FileNotFoundException{
            String line = null;
            boolean log = false;
            try {
                        // FileReader reads text files in the default encoding.
                        FileReader fileReader = 
                            new FileReader("C:\\Users\\Sarah N\\Desktop\\test.txt");
                        
                try ( // Always wrap FileReader in BufferedReader.
                        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                    while ((line = bufferedReader.readLine()) != null) {
                        String item;
                        //System.out.println(line);
                        String[] parts = line.split("-");
                        String idPart = parts[0];
                        String passPart = parts[1];
                        if(name.equals(idPart) && password.equals(passPart) ){
                            log = true;
                            item=line;
                            break;
                        }
                    }
                    // Always close files.
                    bufferedReader.close();
                }
                    }
                    catch(FileNotFoundException ex) {
                        System.out.println(
                            "Unable to open file '" + 
                            ".text" + "'");                
                    }
                    catch(IOException ex) {
                        System.out.println(
                            "Error reading file '" 
                            + ".text" + "'");                  
                        // Or we could just do this: 
                        // ex.printStackTrace();
                    }
            
                    return line;
     }
    
    public void delete(String ID) throws FileNotFoundException{
        String name = null;
            String b =search(ID,name);
                    

        try
        {
          File OldFile =new File("C:\\Users\\Basma\\Desktop\\hospital1.txt");
          File NewFile =new File ("C:\\Users\\Basma\\Desktop\\xx.txt");
          FileReader FR = new FileReader (OldFile);
          BufferedReader bfr = new BufferedReader(FR);
          
          String line= bfr.readLine();
          FileWriter FW = new FileWriter(NewFile);
          BufferedWriter bfw = new BufferedWriter (FW);
          while(line!=null)
          {
          if(!line.equals(b))
          {
          bfw.write(line);
          bfw.newLine();
          }
          line= bfr.readLine();
          }
          bfw.close();
          bfr.close();
          OldFile.delete();
          NewFile.renameTo(OldFile);
          
        }
        catch(Exception EX){
          
            
            
        }
       
        
        
    }
    
}
