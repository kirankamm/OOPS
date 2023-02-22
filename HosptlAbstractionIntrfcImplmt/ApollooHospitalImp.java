package hospital;

/* implimatation class*/

public class ApollooHospitalImp implements Hospital{
	
	Patient patient[];
	
	public ApollooHospitalImp() {
		
		return;
		
	} 
	
	
		boolean isApplicationFormFilled=true;
		  
		public ApollooHospitalImp(int size) {
		Patient[] patient = new Patient[size];
		System.out.println("Apollo Hospital Object is created");
		}
		
	//method overriding
		
		public boolean admit(Patient patient) {
			System.out.println("Inside add Patient of ApolloHospitals");
			if(isApplicationFormFilled==true) {
				System.out.println("Form the Filling comletely can add the patient now ...hurry");
			boolean isAdmitted = true;
			return isAdmitted;
			}
			return false;
			}

	@Override
	public boolean addPatient(Patient patient) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getAllPatients() {
		// TODO Auto-generated method stub
		
	}
		   }


 
	
	

	
	

