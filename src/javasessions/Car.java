package javasessions;

public class Car {
	
	String name;
	String color;
	int price;
	static final int wheeels=4;
	
	//static is the common prop for all object type
	// but object will hold the static prop
	// static variable will be stored in CMA
	//and it will create only one copy for all the objects.
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1= new Car();
		c1.name="BMW";
		c1.color="White";
		c1.price=80;
		
		System.out.println(c1.name+" "+c1.color+" "+c1.price+ " "+Car.wheeels);
		System.out.println(c1.wheeels);// not aright way of calling static var using the ref name
		
		Car c2= new Car();
		c2.name="Audi";
		c2.color="Red";
		c2.price=70;
		System.out.println(wheeels);
		
		System.out.println(c2.name+" "+c2.color+" "+c2.price+" "+Car.wheeels);
		
		Car c3= new Car();
		c3.name="Honda";
		c3.color="Black";
		c3.price=20;
		
		System.out.println(c3.name+" "+c3.color+" "+c3.price+" "+Car.wheeels);

	}

}
