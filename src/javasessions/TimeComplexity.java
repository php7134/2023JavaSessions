package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		System.out.println(i);
		
		//constant time : Big O(1)
		
		String name="Tom";
		System.out.println(name); //O(1)
		
		int n =10;
		for (int p=1;p<=n;p++)
		{
			System.out.println(p);
		}
		//1 + n + n + n  ==>3n+1  --> liner equation
		// 3n+1   --> 3n  --> 0(n)
		
		
		//1 to 100
		int p=1;
		int q=0;
		while (p<=100)
		{
			System.out.println("Hi");
			System.out.println(p);
			p++;
			q++;
			
		}
		//1 + 1 + n + n + n + n + n + n=> 6n+2 => 2(3n+1) => 2(3n) => O(n)
		System.out.println("--------------------------");
		//nested loop:
		//00 01 02 03 04
		//10 11 12 13 14
		//20 21 22 23 24
		//30 31 32 33 34
		
		for(int m=0; m<=3;m++)
		{
			for (int k=0; k<=4;k++)
			{
				System.out.print(m+""+k+" ");
			}
			System.out.println();
		}
		
		//(1+n+n+n)(1+n+n+n)(1+n+n+n) --> n^3+n^2+n+1 --> 0 (n^3)
		
		//BS - Binary Search:
		
		// byte range -128 to 127
		byte b1=100;
		byte b2=90;
		
		int b3= b1+b2;
		System.out.println(b3);
		
		byte b4= (byte) (b1+b2);
		System.out.println(b4);
		
		
		int x=100;
		int y=200;
		
		int z=x+y;
		System.out.println(z);
		
		for(char ch='0'; ch<='9';ch++)
		{
			System.out.println(ch + " = " + (byte)ch);
		}

		byte t1= 075; //octal number  -----> 0to7 for each digit
		System.out.println(t1);//53
		//Octal to decimal
		
		short t2=07766;
		System.out.println(t2);
		
		
	}

}
