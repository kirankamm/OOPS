package hospital;

import java.util.Scanner;

public class ApolloHospitalTester
   {
	
//util means this is class
public static void main(String args [])
       {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int size =sc.nextInt();
	
	Hospital hospital=new ApollooHospitalImp(size);
	
	for (int i=0;i<size;i++) 
	     {
		
		Patient pat=new Patient(size) ;
		    
		
		System.out.println("Enter the patientId");  
		pat.setPatientId(sc.nextInt());
		
		System.out.println("Enter the patientName");
		pat.setPatientName(sc.next());
		
		System.out.println("Enter the age");
		pat.setAge(sc.nextInt());
		
		System.out.println("Enter the gender");
	    pat.setGender(sc.next());
	    
		System.out.println("Enter the bloodGroup");
	    pat.setBloodGroup(sc.next());
		
	     }
       }
   }
	    
	    /*
	    
	    int option=0;
	    do {
		System.out.println("Enter 1 to fetch all patient");
		System.out.println("Enter 2 to fetch Patient by Id");
		System.out.println("Enter 3 to update patient age by Patient Name");
		System.out.println("Enter 4 to Exit");
        option = sc.nextInt();

        switch(option) {
		case 1:hospital.getPatient();
		break;
	    
		case 2:System.out.println("Enter to the Id Id to be fecthed");
		int patientId = sc.nextInt();
		hospital.getPatientByPatientId(patientId);
		break;
		
		case 3:System.out.println("Enter the updated age");
		    int updatedAge=  sc.nextInt();
		System.out.println("enter the patient name");
        }
		}while(option !=4);
		
        }
	    
		sc.close();  */
       
   
   
       
	 
	   
	  
   
   
   
   
   
   
   