
package hospital.management.system.pkgfinal;

import java.util.Scanner;
import java.io.*;
public class HospitalManagementSystemFINAL {

    public static void main(String[] args) throws FileNotFoundException {
        int log,docChoice,recepChoice;
        String filePath;
        String patientName = null;   //m3rfsh leh hwa 7atahaly :/
        
        boolean value;
        boolean value2;
        
        Doctor doctorObject = new Doctor();
        String docName = null;
        doctorObject.name = docName;
        int docAge = 0 ;
        doctorObject.age = docAge;
        String docId = null;
        doctorObject.id = docId;
        String docNumber = null;
        doctorObject.phoneNumber = docNumber;
        String docEmail = null;                         
        doctorObject.email = docEmail;
        String docGender = null;
        doctorObject.gender = docGender;
        String docAdress = null;
        doctorObject.adress = docAdress;
        String docPass = null;
        doctorObject.password = docPass;
        String docSalary = null;
        doctorObject.salary = docSalary;
        String docUserName = null;
        doctorObject.userName = docUserName;
        
        
        Receptionist resebtionObject = new Receptionist();
        String resebName = null;
        resebtionObject.name = resebName;
        String resebId = null;
        resebtionObject.id = resebId;
        int resebAge = 0;
        resebtionObject.age = resebAge;
        String resebAdress = null;
        resebtionObject.adress = resebAdress;
        String resebEmail = null;
        resebtionObject.email = resebEmail;
        String resebGender = null;
        resebtionObject.gender = resebGender;
        String resebPass = null;
        resebtionObject.password = resebPass;
        String resebSalary = null;
        resebtionObject.salary = resebSalary;
        String resebUserName = null;
        resebtionObject.userName = resebUserName;
        
        Nurse nurseObject = new Nurse();
        String nurseUserName = null;
        nurseObject.userName = nurseUserName;
        String nursePass = null;
        nurseObject.password = nursePass;
        
        Manager managerObject = new Manager();
        
        Patient patientObject = new Patient();
        
        patientObject.name = patientName;
        String patientCase = null;
        patientObject.Case = patientCase;
        String patientId = null;
        patientObject.id = patientId;
        String patientReport = null;
        patientObject.Report = patientReport;
        float patientHeight = 0;
        patientObject.Height = patientHeight;
        String patientAdress = null;
        patientObject.adress = patientAdress;
        String patientEmail = null;
        patientObject.email = patientEmail;
        String patientGender = null;
        patientObject.gender = patientGender;
        String patientNumber = null;
        patientObject.phoneNumber = patientNumber;
        
        Scanner input = new Scanner(System.in);
        log = input.nextInt();
        
        System.out.println("If you want to login as a doctor please press 1");
        System.out.println("If you want to login as a receptionist please press 2");
        System.out.println("If you want to login as a nurse please press 3");
        System.out.println("If you want to login as a Manager please press 4");
        switch(log)
        {
            case 1:
                System.out.println("please enter your username:");
                docUserName = input.nextLine();
                System.out.println("please enter your password:");
                docPass = input.nextLine();
                value = doctorObject.login(docUserName,docPass);
                if (value == true){
                System.out.println("Press 1 to add a report to a patient");
                System.out.println("Press 2 to search for a patient");
                System.out.println("Press 3 to update information of a patient");
                System.out.println("press 4 to exit");

                docChoice = input.nextInt();
                while (true){
                switch(docChoice)
                {
                    case 1:
                        doctorObject.add(patientId,patientReport);
                        break;
                    case 2:
                        doctorObject.search(patientId,patientName);
                        break;
                    case 3:
                        doctorObject.update();
                    case 4:
                        return;
                        
                }
                }
                }
                else
                {
                    System.out.println("wrong username or password");
                    
                }
            
            case 2:
                System.out.println("please enter your username:");
                resebUserName = input.nextLine();
                System.out.println("please enter your password:");
                resebPass = input.nextLine();
                value2 = resebtionObject.login(resebUserName,resebPass);
                if(value2 == true)
                {
                   System.out.println("press 1 to add a new patient");
                   System.out.println("press 2 to ubdate the information of a patient");
                   System.out.println("press 3 to delete a patient");
                   System.out.println("press 4 to search for a patient");
                   System.out.println("press 5 to exit");
                   recepChoice = input.nextInt();
                   while(true)
                   {
                       switch(recepChoice)
                       {
                           case 1:
                               resebtionObject.add(patientName,patientId,patientAge,patientNumber,patientAdress,patientEmail,patientGender,patientHeight,PatientWeight,patientCase);
                               break;
                           case 2:
                               resebtionObject.update();
                               break;
                           case 3:
                               resebtionObject.delete(patientId);
                               break;
                           case 4:
                               resebtionObject.Search(patientId);
                               break;
                           case 5:
                               return;
                       }
                   }
                   
                }
                else
                {
                    System.out.println("wrong username or password");
                }
            case 3:
                System.out.println("please enter your username:");
                nurseUserName = input.nextLine();
                System.out.println("please enter your password:");
                resebPass = input.nextLine();
                value2 = resebtionObject.login(resebUserName,resebPass);
                if(value2 == true)
                {
                   System.out.println("press 1 to add a new patient");
                   System.out.println("press 2 to ubdate the information of a patient");
                   System.out.println("press 3 to delete a patient");
                   System.out.println("press 4 to search for a patient");
                   System.out.println("press 5 to exit");
                   recepChoice = input.nextInt();
                   while(true)
                   {
                       switch(recepChoice)
                       {
                           case 1:
                               resebtionObject.add(patientName,patientId,patientAge,patientNumber,patientAdress,patientEmail,patientGender,patientHeight,PatientWeight,patientCase);
                               break;
                           case 2:
                               resebtionObject.update();
                               break;
                           case 3:
                               resebtionObject.delete(patientId);
                               break;
                           case 4:
                               resebtionObject.Search(patientId);
                               break;
                           case 5:
                               return;
                       }
                   }
                   
                }
                else
                {
                    System.out.println("wrong username or password");
                }
                
                    
        }
            
                   
        
        

       
       
        
        
    }
    
}
