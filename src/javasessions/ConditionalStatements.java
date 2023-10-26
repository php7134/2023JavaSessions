package javasessions;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;

		System.out.println(a == b);

		if (a == b) {
			System.out.println("Hi");
		} else {
			System.out.println("Hello");
		}
		int c = 10;
		if (c > a) {
			System.out.println("Bye");
		}

		if (true) {
			System.out.println("hi selenium");
		} else {
			System.out.println("Bye selenium");
		}

		boolean flag = true;
		if (flag) {
			System.out.println("hi testing");
		} else {
			System.out.println("Bye testing");
		}

		boolean test = true;
		if (!test) {
			System.out.println("testing is done");
		} else {
			System.out.println("testing is pending");
		}

		// Nested if

		int number = 85;
		if (number <= 100)
		{
			System.out.println("Calculating your marks");
			if (number >= 90) 
			{
				System.out.println("GRADE A");
				if (number == 100) 
				{
					System.out.println("You got 100% schloarship");
				} else 
				{
					System.out.println("You are not eligible for 100% scholarship");
				}
			} 
			else
			{
				if(number>=80)
				{
					System.out.println("GRADE B");
				}
			}
		}
		else
		{
			System.out.println("Please pass the right marks...");
		}
		
		//if-elseif
		
//		String browser ="chrome";
//		
//		if(browser.equals("chrome"))
//		{
//			System.out.println("Launch chrome");
//		}
//		if(browser.equals("firfox"))
//		{
//			System.out.println("Launch firefox");
//		}
//		if(browser.equals("edge"))
//		{
//			System.out.println("Launch edge");
//		}
//		else
//		{
//			System.out.println("please pass the right browser.");
//		}
		
		//if-else if:
		
		String browser ="chrome";
		
		if(browser.equals("chrome"))
		{
			System.out.println("launch chrome");
		}
		else if (browser.equals("firefox"))
		{
			System.out.println("launch firefox");
		}
		else if (browser.equals("edge"))
		{
			System.out.println("launch edge");
		}
		else
		{
			System.out.println("Please pass right browser");
		}
	}
}
