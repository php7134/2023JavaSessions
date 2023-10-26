package javasessions;

public class Employee {
	
	//class variables  -- class data members 
	String name;
	int age;
	String city;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String name ="Ram"; // local variables
		// Class is template or blueprint of object/category of object.
		// object -- is a physical entity
		
		Employee obj=new Employee();
		
		obj.name="Tom";
		obj.age=29;
		obj.city="CA";
		
		System.out.println(obj.name +" " + obj.age+ " " + obj.city);
		
		//
		Employee obj1=new Employee();		
		System.out.println(obj1.city);
		System.out.println(obj1.age);
		System.out.println(obj1.name);
		
		//
		
		obj1.name ="Ram";
		System.out.println(obj1.city);
		System.out.println(obj1.age);
		System.out.println(obj1.name);
		
		// No reference objects -- not recommended
		
		new Employee().name="Peter";
		new Employee().age=30;
		new Employee().city="Pune";
		
		
		
		
		
		
		

	}

}
