package javaAssignments;

public class Employee {
	
	static final String cname="IBM";
	static final String ceoname="elon";
	String ename;
	int age;
	String deparment;
	String empid;
	int salary;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee();
		e1.ename="test1";
		e1.age=30;
		e1.deparment="HR";
		e1.empid="001";
		e1.salary=30000;
		
		System.out.println(e1.ename+" "+e1.age+ " "+e1.deparment+ " "+e1.empid+ " "+e1.salary+ " "+cname+" "+ceoname);
		
		Employee e2= new Employee();
		e2.ename="test2";
		e2.age=31;
		e2.deparment="IT";
		e2.empid="002";
		e2.salary=60000;
		System.out.println(e2.ename+" "+e2.age+ " "+e2.deparment+ " "+e2.empid+ " "+e2.salary+ " "+cname+" "+ceoname);

		Employee e3= new Employee();
		e3.ename="test3";
		e3.age=32;
		e3.deparment="Admin";
		e3.empid="003";
		e3.salary=20000;
		System.out.println(e3.ename+" "+e3.age+ " "+e3.deparment+ " "+e3.empid+ " "+e3.salary+ " "+cname+" "+ceoname);


	}

}
