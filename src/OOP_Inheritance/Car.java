package OOP_Inheritance;

public class Car extends Vehicle {
	
	public final void service()
	{
		System.out.println("Car Service");
	}

	public void start() {
		System.out.println("car ---start");
	}

	public void stop() {
		System.out.println("car ---stop");
	}

	public void refuel() {
		System.out.println("car ---refuel");
	}
	@Override
	public void petrolEngine()
	{
		System.out.println("Car---petrol engine");
	}
	public static void billing()
	{
		System.out.println("Car---billing");
	}
	private void pickcolor()
	{
		System.out.println("Car---pickColor");
	}
	

}
