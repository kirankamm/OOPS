package com.xworkz.encapsulationapp.tester;

import java.util.Scanner;

import com.xworkz.encapsulationapp.hospital.Hospital;
import com.xworkz.encapsulationapp.patient.Patient;

public class HospitalTester {

public static void main(String args []){

	System.out.println("METHOD HAS STARTED");

	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size");
	int size =scan.nextInt();
	Hospital hos=new Hospital(size);
	
	
	//ApollooHospital apol =new ApolloHospital();  //variable can be used for child class ApolloHospital
	// or
	//Hospital hospital=new ApollooHospital(size);
	
	for (int i=0;  i<size; i++) 
	     {
		
		/*    
		Patient pat=new 
		Patient(size) ;

		or */
		
		Patient pat=new Patient() ;

		
		System.out.println("Enter the patientId");
	    int	patientId=scan.nextInt();
		pat.setPatientId(patientId);
		
		System.out.println("Enter the patientName");
		String patientName=scan.next();
		pat.setPatientName(patientName);
		
		System.out.println("Enter the age");
		int Age=scan.nextInt();
		pat.setAge(Age);
		
		System.out.println("Enter the gender");
		String Gender=scan.next();
		pat.setGender(Gender);
	    
		System.out.println("Enter the bloodGroup");
		String BloodGroup=scan.next();
		pat.setBloodGroup(BloodGroup);
	    
		hos.admit(pat);
	     }

	int option=0;
	String enter="no";
	do {
			
		System.out.println("Enter 1 to get all patients details");
		System.out.println("Enter 2 to get Patient datais by patient Id");
		System.out.println("Enter 3 to update patient name  by Patient id");
		System.out.println("Enter 4 to get patient detais by patient age ");
		System.out.println("Enter 5 to get patient detais by patient name ");
		System.out.println("Enter 6 to get patient detais by patient blood group ");
		System.out.println("Enter 7 to get patient detais by patient genger ");
		System.out.println("Enter 8 to EXIT");

		
		option = scan.nextInt();
        switch(option) {
        
		case 1:hos.getAllPatients();
		break;
	    
		case 2:System.out.println("Enter the patient Id");
		int id = scan.nextInt();
		hos.getPatientByPatientId(id);
		break;
		
		case 3:System.out.println("Enter the patient id");
		int idl=  scan.nextInt();
		System.out.println("enter the new name to be   updated");
		String newName=scan.next();
		hos.updateNameByPatientId(newName,idl);
		break;
		
		
		case 4:System.out.println("Enter the patient age");
		int age=  scan.nextInt();
		hos.getPatientByPatientAge(age);
		break;
		
		
		
		case 5:System.out.println("Enter the patient name");
		String patientName=  scan.next();
		hos.getPatientByPatientName(patientName);
		break;
		

		case 6:System.out.println("Enter the patient blood group");
		String bloodGroup=  scan.next();
        hos.getPatientByPatientBloodGroup(bloodGroup);
		break;
		
		case 7:System.out.println("Enter the patient gender");
		String gender=  scan.next();
		hos.getPatientByPatientGender(gender);
		break;
		
		case 8:System.out.println("Do yo want to continue");
        break;
		
		
        default:System.out.println("please enter the valid number");
        break;
        
        }
        
        System.out.println("TYPE--yes/no");
        enter =scan.next();
        
	     }
        while(enter.equals("yes"));
        		
        		System.out.println("METHOD HAS ENDED");
        		
        		scan.close();

        }
	}
        		
        		
       
