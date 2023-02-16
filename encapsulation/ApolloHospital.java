package com.xworkz.encapsulationapp.hospital;

import com.xworkz.encapsulationapp.patient.Patient;

public class ApolloHospital extends Hospital {

	public boolean isApplicationFormFilled=true;
	  
	public ApolloHospital(int size) {
	
    patient=new Patient[size];
	
	System.out.println("ApolloHospital Object is created");
	}
	
//method overriding
	
	@Override
	
	    public boolean admit(Patient patient) {
		
		System.out.println("Inside add Patient of ApolloHospital");
		
		if(isApplicationFormFilled==true) {
			
	    System.out.println("Form the Filling comletely can add the patient now ...hurry");
		
		return super.admit(patient);
		}
		return false;
		}
	
	
	public String canteen() {
	System.out.println("Eating");
		return "idaly";
	}

}
