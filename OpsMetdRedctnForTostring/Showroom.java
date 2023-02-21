package com.xworkz.managerapp.manager.ShoowRoom;

import com.xworkz.managerapp.manager.ShoowRoom.Showroom;

public class Showroom 
{
		Manager manager[] =new Manager[2];
			
			int  i;

			private long newcontactNo;

			private String gender;
			
	public Showroom() {
			
	}
	
	public String saveManager(Manager manager) 
				{
			System.out.println("method 1 start");
	                if(manager.managerName != null && !(manager.managerName.isEmpty())) {
		            this.manager[i++]=manager;
				  }
	                return"qwerty";
				  }
	
	
	public void getDetails(){
		
	System.out.println("method 2 start");
		
	for (Manager man : manager) {
		
		System.out.println(man);
	}
	System.out.println(manager[i]);
	
	 /*for (int i=0;  i<manager.length; i++) {
			 
	System.out.println(manager[i].managerId+" "+manager[i].managerName+
						" "+manager[i].gender+" "+manager[i].contactNo+" "+manager[i].qualification);
		 }*/
	     }
	
	
	public Manager getManagerByQualification(String qualification){
		System.out.println("method 3 start");
		
		 for (int i=0;  i<manager.length; i++) {
		 if(manager[i].qualification==qualification){ 
		
			 
			 System.out.println(manager[i]);
			 
		/*System.out.println(manager[i].managerId+" "+manager[i].managerName+
						" "+manager[i].gender+" "+manager[i].contactNo+" "+manager[i].qualification);*/
		 }
	     }
		 return null;
		 }
	
	
	
	public Manager getManagerNameByAddress(String address) {
		System.out.println("method By Address start");
		
		for (int i=0;  i<manager.length; i++) {
	    if(manager[i].gender==address){ 
			
	    	
	   	 System.out.println(manager[i]);
	   	 
			/* System.out.println(manager[i].managerId+" "+manager[i].managerName+
						" "+manager[i].gender+" "+manager[i].contactNo+" "+manager[i].qualification);*/
			 }
		}
		return null;
		}
	
	

	
	public Manager getManagerBymanagerName(String managerName) {
		
		for (int i=0;  i<manager.length; i++) {
		if(manager[i].managerName==managerName){ 
			
		System.out.println("method By ID start");
		
		System.out.println(manager[i]);
		
		/*System.out.println(manager[i].managerId+" "+manager[i].managerName+
						" "+manager[i].gender+" "+manager[i].contactNo+" "+manager[i].qualification);*/
			 }
		}
		return null;}
	
	public Manager getManagerNameBymanagerID(int managerId) {
		
		for (int i=0;  i<manager.length; i++) {
		if(manager[i].managerId==managerId){ 
			
		System.out.println("method By ID start");
		
		
		System.out.println(manager[i]);
		
		/*System.out.println(manager[i].managerId+" "+manager[i].managerName+
						" "+manager[i].gender+" "+manager[i].contactNo+" "+manager[i].qualification);*/
			 }
		}
		return null;}
	
	public Manager getManagerByGender(String gender) {
		
		
		for (int i=0;  i<manager.length; i++) {
		if(manager[i].gender==gender){ 
			
		System.out.println("method By gender start");

		System.out.println(manager[i]);

		/*System.out.println(manager[i].managerId+" "+manager[i].managerName+
						" "+manager[i].gender+" "+manager[i].contactNo+" "+manager[i].qualification);*/
			 }
		}
		return null;
		}
	
	
	public Manager updateContacteNoByManagerId(long newContacteNo,int managerID) {
		System.out.println("method update By ID start");
		
		for (int i=0;  i<manager.length; i++) {
		if(manager[i].gender==gender){ 
		this.manager[i].contactNo=newContacteNo;
		
		System.out.println(manager[i].contactNo);
		manager[i].setContactNo(newContacteNo);

		System.out.println(manager[i]);

		/*System.out.println(manager[i].managerId+" "+manager[i].managerName+
						" "+manager[i].gender+" "+manager[i].contactNo+" "+manager[i].qualification);*/
			 }
		}
		return null;}

	public void getAllManager() {
		// TODO Auto-generated method stub
		
	}

	public void updateContacteNoByManagerId(long newContacteNo) {
		// TODO Auto-generated method stub
		
	}
	
}
	
	
	
	
	
		
		
		
		
		
		
        