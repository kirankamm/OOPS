package com.xworkz.encapsulationapp.hospital;

import com.xworkz.encapsulationapp.patient.Patient;

public class Hospital {

	

	Patient patient[];
    int index;
   
    public Hospital(int size) {

    System.out.println("Hospital object is creted");
	patient= new Patient[size];
	
    }
    
    	
public Hospital(){
   
   }

   
public boolean admit(Patient patient){      //Implementation....in industry//
	
System.out.println("Admit process started");

boolean isAdmitted=false;
 if(patient.getPatientName() !=null) {
this.patient[index++]=patient;
 	    	
 System.out.println("Patient Admit process succesfully");
 	    	
            isAdmitted =true;
 	         }
 	        System.out.println("Admit process ended");

 	   return isAdmitted;
}
 


public void getAllPatients() {

System.out.println("List of patient are");
for (int i=0; i<this.patient.length; i++) {

System.out.println(patient[i].getPatientId()+" "+ patient[i].getPatientId()+" "+
patient[i].getBloodGroup()+" "+patient[i].getGender()+" "+patient[i].getAge());

}	  	   	    	

}
 


public Patient getPatientByPatientId(int patientId) {
	
	System.out.println("INSIDE getPatientByPatientId METHOD");
	for(int in=0; in<patient.length; in++) {
	
		if(patient [in].getPatientId()==patientId) {
			
		System.out.println("PATIENT ID MATCHING ....PROCEED THE DATA");	
		System.out.println(patient[in].getPatientId()+" "+ patient[in].getPatientName()+" "+
				patient[in].getBloodGroup()+" "+patient[in].getGender()+" "+patient[in].getAge());
		return patient[in];
		}
		
	}
	System.out.println("END of getPatientByPatientId METHOD");	
return null;
}	
	


	public Patient getPatientByPatientName(String patientName) {
		
		System.out.println("INSIDE getPatientByPatientName METHOD");
		
		for(int j=0; j<patient.length; j++) {
		if(patient [j].getPatientName().equals(patientName)) {
				
			System.out.println("PATIENT ID MATCHING ....PROCEED THE DATA");
			
			System.out.println(patient[j].getPatientId()+" "+ patient[j].getPatientId()+" "+
					patient[j].getBloodGroup()+" "+patient[j].getGender()+" "+patient[j].getAge());
			return patient[j];
			}
			
		}
		System.out.println(" END of getPatientByPatientName METHOD");	
		return null;
	}
	
	
	
	
	public Patient getPatientByPatientBloodGroup(String bloodGroup) {
		
		System.out.println("INSIDE getPatientByPatientBloodGroup METHOD");
		
		for(int k=0; k<patient.length; k++) {
		if(patient [k].getBloodGroup().equals(bloodGroup)) {
				
			System.out.println("PATIENT ID MATCHING ....PROCEED THE DATA");
			
			System.out.println(patient[k].getPatientId()+" "+ patient[k].getPatientId()+" "+
					patient[k].getBloodGroup()+" "+patient[k].getGender()+" "+patient[k].getAge());
			return patient[k];
			}
			
		}
		System.out.println(" END of getPatientByPatientBloodGroup METHOD");	
		return null;
	}
	
	
	
	
public Patient getPatientByPatientGender(String  gender) {
		
		System.out.println("INSIDE getPatientByPatientGender METHOD");
		
		for(int L=0; L<patient.length; L++) {
		if(patient [L].getGender().equals(gender)) {
				
			System.out.println("PATIENT ID MATCHING ....PROCEED THE DATA");
			
			System.out.println(patient[L].getPatientId()+" "+ patient[L].getPatientId()+" "+
					patient[L].getBloodGroup()+" "+patient[L].getGender()+" "+patient[L].getAge());
			return patient[L];
			}
			
		}
		System.out.println(" END of getPatientByPatientGender METHOD");	
		return null;
	}
	
	

public Patient getPatientByPatientAge(int  age) {
	
	System.out.println("INSIDE getPatientByPatientAge METHOD");
	
	for(int K=0; K<patient.length; K++) {
	if(patient [K].getAge()==(age)) {
			
		System.out.println("PATIENT ID MATCHING ....PROCEED THE DATA");
		
		System.out.println(patient[K].getPatientId()+" "+ patient[K].getPatientId()+" "+
				patient[K].getBloodGroup()+" "+patient[K].getGender()+" "+patient[K].getAge());
		return patient[K];
		}
		
	}
	System.out.println(" END of getPatientByPatientAge METHOD");	
	return null;
}

	


public Patient updateNameByPatientId(String patientName,int patientId) {
	
	System.out.println("INSIDE updateNameByPatientId METHOD");
	
	for(int b=0; b<patient.length; b++) {
	if(patient [b].getPatientId()==(patientId)) {
			
		System.out.println("PATIENT ID MATCHING ....PROCEED THE DATA");
		
		System.out.println(patient[b].getPatientId()+" "+ patient[b].getPatientId()+" "+
				patient[b].getBloodGroup()+" "+patient[b].getGender()+" "+patient[b].getAge());
		return patient[b];
		}
		
	}
	System.out.println(" END of updateNameByPatientId METHOD");	
	return null;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	}
/*


public boolean updatePatientAgeByPatientId(int newAge,int patientId) {
boolean isAgeUpdate=false;
	  System.out.println("updatePatientAgeByPatient started");
for(int i = 0; i< patient.length;i++) {
if(patient[i].patientId==patientId) {
			  System.out.println("The Current Age is+patient[i].age");
			  patient[i].age=newAge;
			  System.out.println("The Current Age is+patient[i].age");
		  }
	  }
return isAgeUpdate ;  
 
}


}*/

