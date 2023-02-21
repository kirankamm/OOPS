package com.xworkz.managerapp.manager.ShoowRoom;

import java.util.Scanner;

public class ShowRoomTester {
public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int size= scanner.nextInt();
		
		Showroom room =new Showroom();


	        for (int i=0; i<size; i++)  
	        {

	 		   Manager man=new Manager();

        	
	   
		System.out.println("Enter the Manager Id");
		int manegerId= scanner.nextInt();   
		
		
		System.out.println("Enter the Manager Contact No");
		long contactNo = scanner.nextLong();
		
		System.out.println("Enter the Manager Name");
		String managerName=scanner.next();
		
		System.out.println("Enter the Manager Address");
		String address=scanner.next();
		
		System.out.println("Enter the Manager Qualification");
		String managerQualification=scanner.next();
		
		System.out.println("Enter the Manager Gender");
		String gender=scanner.next();
		}
	        
        int option=0;
    	String enter="no";
    	do {
    					
		System.out.println("Enter 1 to get all  the  manager details");
		System.out.println("Enter 2 to get manager detais by Manager Contact No ");
		System.out.println("Enter 3 to get manager detais by Manager Name ");
		System.out.println("Enter 4 to get manager detais by Manager Address ");
		System.out.println("Enter 5 to get manager detais by Manager Qualification");
		System.out.println("Enter 6 to get manager detais by patient age ");
		System.out.println("Enter 7 get Manager details by  ManagerManager Gender");
		System.out.println("Enter 8 to Exit ");

		
		
		
		 option = scanner.nextInt();

		
		
		switch (option) {
		
		case 1:room.getAllManager();
		break;
		
		case 2: System.out.println("Enter the manager id");
		int managerId=scanner.nextInt();
        room.getManagerNameBymanagerID(managerId);
        
		break;
		   
	
		case 3: System.out.println("enter the Manager id");
		
		int managerID1=scanner.nextInt();
		
		System.out.println("enter the   Manager new contacte No");
        long newContacteNo =scanner.nextLong();
        room.updateContacteNoByManagerId(newContacteNo);
		break;
		
	
		case 4: System.out.println("Enter the Manager Name");
        String manegerName=scanner.next();
        room.getManagerBymanagerName(manegerName);
        break;
	
        
		case 5: System.out.println("Enter the Manager Address");
		String manegerAddress=scanner.next();
        room.getManagerNameByAddress(manegerAddress);

		break;
		
		
		case 6: System.out.println("Enter the Manager Qualification");
        String Qualification=scanner.next();
        room.getManagerByQualification(Qualification);
		break;
		
		case 7: System.out.println("Enter the Manager Gender");
        String manegerGender=scanner.next();
        room.getManagerByGender(manegerGender);
	    break;
		   

		}
		System.out.println("type--- yes/no");
       enter=scanner.next();
		
    	}
	//	Manager manager =new  Manager(managerId,managerName,address,managerQualification,contactNo,managerGander );
			
	   while (enter.equals("yes"));
    	
	
           		
		
		System.out.println("Main method ended");
		scanner.close();
	
		}
}
