package ConstructorsConcept;

public class User {
	String firstName;
	String lastname;
	String emailId;
	String phone;
	String password;
	String city;
	
	//user can be created if you have 
	//FN, LN
	//FN, LN emailID
	//FN, LN password
	//FN
	//FN, LN, emailid, phone, password, city
	
	public User(String firstName, String lastname) {
		this.firstName = firstName;
		this.lastname = lastname;
	}
	
	public User(String firstName, String lastname, String emailId) {
		this.firstName = firstName;
		this.lastname = lastname;
		this.emailId = emailId;
	}

	public User(String firstName) {
		this.firstName = firstName;
	}
	
	public void getInfo()
	{
		System.out.println("get info");
	}
	public void getInfo(int i)
	{
		System.out.println("get info"+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1=new User("Ankit");
		System.out.println(u1.firstName+ " "+u1.lastname);
		u1.lastname="Sinha";
		System.out.println(u1.firstName+ " "+u1.lastname);
		
		User u2=new User("Mahesh", "Kumar", "mahesh@gmail.com");
		System.out.println(u2.emailId);
		u2.city="Pune";
		

	}

	

}
