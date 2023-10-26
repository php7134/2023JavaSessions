package javaAssignments;

public class IncremnetDecrement {
	public static void main(String[] args) 
	{
		int i = 11;
		
		i = i++ + ++i;
		
		System.out.println(i);
		
			int a=11, b=22, c;
			
			c = a + b + a++ + b++ + ++a + ++b;
			
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("c="+c);
		}
	
	}


