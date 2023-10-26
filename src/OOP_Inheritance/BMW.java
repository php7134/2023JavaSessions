package OOP_Inheritance;

public class BMW extends Car {
	
	//Method Overriding
	
	@Override
	public void start()
	{
		System.out.println("BMW----start");
	}
	
	@Override
	public void petrolEngine()
	{
		System.out.println("BMW---petrol engine");
	}
	

	public void autoParking()
	{
		System.out.println("BMW----auto parking");
	}
	public void theftSafety()
	{
		System.out.println("BMW---- theftSaftey");
	}
	
	public static void billing()
	{
		System.out.println("BMW - billing");
	}


}
