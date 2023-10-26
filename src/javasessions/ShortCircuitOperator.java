package javasessions;

public class ShortCircuitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=200;
		int c=300;
		
		// && is a short circuit operator
		if(a>b && a>c)
		{
			System.out.println("a is greatest number");
		}
		else if(b>c)
		{
			System.out.println("b is greatest number");
		}
		else
		{
			System.out.println("c is greatest number");
		}
	}

}
