package javasessions;

public class Student {
	
	//WAF
	//Create a method --getting student marks	
	//pass a parameter: studentName (String)
	//return the student marks -> int

	public int getStudentMarks(String studentName)
	{
		System.out.println("getting marks for : "+studentName);
		int marks=-1;
		
		if(studentName.equalsIgnoreCase("Riya"))
		{
			marks=90;
			
		}
		else if(studentName.equalsIgnoreCase("Vikas"))
		{
			marks=100;
			
		}
		else if(studentName.equalsIgnoreCase("Neetu"))
		{
			marks=80;
			
		}
		else if(studentName.equalsIgnoreCase("Navit"))
		{
			marks=10;
			
		}
		else
		{
			System.out.println("no student found...pls find the right student name...." + studentName);
		}
		
		return marks;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		int m1=s1.getStudentMarks("Riya");
		System.out.println(m1);

		int m2=s1.getStudentMarks("Navit");
		System.out.println(m2+60);
		
		if(m2>=0)
		{
			System.out.println("print the marksheet");
		}
		
		int m3=s1.getStudentMarks("Tom");
		System.out.println(m3);
		
		if(m3>=0)
		{
			System.out.println("print the marksheet");
		}
	}

}
