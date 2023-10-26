package OOP_Interface;

public interface USMedical extends WHO {
	
	//static and final in nature by default 
	
	int min_fee=10;
	boolean isApproved=true;

	
	//abstract methods: 100% abstraction  ---OOP
	public void physioService();
	
	public void cardioService();
	
	public void denatalService();
	
	public void emergencyServices();
	
	public void covidVaccinations();
	
	
	//after jdk 1.8:
	
	//1.  we can have static methods with method body
	public static void billing() {
		
		System.out.println("US Medical --- billing");
	}
	//1.  default method with method body:
	default void medicalTest () {
		System.out.println("US medical test");
	}
}
