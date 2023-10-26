package javaAssignments;

import javasessions.User;

public class EmployeeTest {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeTest u1= new EmployeeTest();
		u1.name="Riya";
		u1.age=30;
		u1.city="Pune";
		
		
		EmployeeTest u2= new EmployeeTest();
		u2.name="Abhi";
		u2.age=35;
		u2.city="LA";
		
		
		EmployeeTest u3= new EmployeeTest();
		u3.name="Geet";
		u3.age=25;
		u3.city="BNG";
		
		EmployeeTest u4= new EmployeeTest();
		u4.name="Seeta";
		u4.age=28;
		u4.city="HYD";
		
		u1=u2;
		System.out.println(u1.name+ " " + u1.age+ " " + u1.city);	
		System.out.println(u2.name+ " " + u2.age+ " " + u2.city);
		System.out.println(u3.name+ " " + u3.age+ " " + u3.city);
		
		System.out.println("------------");
		u2=u3;
		System.out.println(u1.name+ " " + u1.age+ " " + u1.city);	
		System.out.println(u2.name+ " " + u2.age+ " " + u2.city);
		System.out.println(u3.name+ " " + u3.age+ " " + u3.city);
		
		System.out.println("------------");
		u3=u4;
		System.out.println(u1.name+ " " + u1.age+ " " + u1.city);	
		System.out.println(u2.name+ " " + u2.age+ " " + u2.city);
		System.out.println(u3.name+ " " + u3.age+ " " + u3.city);
		
				System.out.println("------------");
		u4=u1;
		System.out.println(u1.name+ " " + u1.age+ " " + u1.city);	
		System.out.println(u2.name+ " " + u2.age+ " " + u2.city);
		System.out.println(u3.name+ " " + u3.age+ " " + u3.city);
		
		

	}

}
