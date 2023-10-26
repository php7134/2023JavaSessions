package javasessions;

public class Shopping {
	
	//Method Overloading
	//1. Same method name in same class
    //2. Same method name with different parameters
	//3. Same method name with different order of parameters 
	//4. Same method name with different types of parameters.
	//5. Return type doesn't matter.
	
	public void test() {
		System.out.println("test method");
	}
	
	public void test (int a)
	{
		System.out.println(a);
	}
	public void test (int i, int j)
	{
		System.out.println(i+j);
	}
	public void test(String p) {
		System.out.println(p);
	}
	public void test(String p, int q) {
		System.out.println(p+q);
	}
	public void test(int p, String q) {
		System.out.println(p+q);
	}
	
	//use cases real time
	public void login() {

	}

	public void login(String un, String psw) {

	}

	public void login(String un, String psw, String role) {

	}
	//
	public void serach()
	{
		
	}
	public void serach(String productName)
	{
		
	}
	public void serach(String productName, int pricerange)
	{
		
	}
	public void serach(String productName, int pricerange, String color)
	{
		
	}
	
	//payment:
	public void dopayment(String upi) {
		
	}
	public void dopayment(String cc, int cvv)
	{
		
	}
	public void dopayment(String paypal, String psw, int otp)
	{
		
	}
	
	//uber booking
	public void booking(String carType, String from, String to)
	{
		
	}
	public void booking(String carType, String from, String to, int passenger)
	{
		
	}
	public void booking(String carType, String from, String to, int passenger, String payopt)
	{
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shopping shop=new Shopping();
		shop.login("test123", "admin");
		

	}

}
