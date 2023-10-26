package javaAssignments;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=25;
		int b=78;
		int c=87;
		
		if((a>b)&(a>c))
		{
			System.out.println("Greatest of the 3 is: "+a);
		}
		else if ((b>a)&(b>c))
		{
			System.out.println("Greatest of the 3 is: "+b);
		}
		else
		{
			System.out.println("Greates of the 3 is:" +c);
		}

	}

}
