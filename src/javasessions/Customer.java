package javasessions;

public class Customer {
	String name;
	int age;
	double salary;
	char gender;
	boolean isActive;
	String dob;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1=new Customer();
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.print(c1.salary);
        System.out.println(c1.gender);
        System.out.println(c1.isActive);
        
        c1.name="Tom";
        System.out.println(c1.name);
        
        Customer c2= new Customer();
        
        Customer c3=new Customer(); //object with reference
        
        new Customer(); //no reference object
        
        Customer c4;
        Customer c5=null; //nul reference object
        
        
        //call garbage collector
        System.gc(); //is not recommended..not a good practice
        
        Customer c6=new Customer();
        Customer c7=new Customer();
        
        c6=c7;
        
        Customer c8;
        c8=new Customer();
        
        
	}

}
