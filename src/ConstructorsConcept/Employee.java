package ConstructorsConcept;

public class Employee {
	String name;
	int age;
	double salary;
	
	//const...
	//name is same as class name
	//can not return any value
	//no return type for const
	//const..will be called when you create the object
	//const.. will be overloaded
	
	
	
	public Employee()
	{//0 param const
		System.out.println("default const..");
	}
	public Employee(int i )
	{// 1 parm const
		System.out.println("1 param const.." +i);
	}
	public Employee(int i, String p )
	{// 1 parm const
		System.out.println("1 param const.." +p);
	}
	

	public static void main(String[] args) {
		
		Employee obj=new Employee();
		obj.name="tom";
		obj.age=20;
		obj.salary=12.33;
		
		Employee obj1=new Employee(10);
		Employee obj2=new Employee(20, "Testing");
		
		
		
		
	}

}
