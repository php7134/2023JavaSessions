package javasessions;

public class DataTypesConcepts {

	public static void main(String[] args) {
		
        //Data Type
		// 1. primitive data type: it takes space in memory directly - without object
		
		//boolean type: true/false
		//Numeric Type: 
		
		   //a. character type: char
		   //b. Integer value:
		         //b.1: Integer:byte, short, int, long
		         //b.2: Floating-point: float, double
		
		
		//2 Non primitive data type: with object Array, String, Classes, Interfaces --OOP
		
		
		//1. byte:
		//size: 1 byte =8 bits
		//range: -128 to 127
		
		byte b=10;
		b=30;
		byte c=20;
		
		System.out.println(b);
		
		//2. short:
		//size: 2 byte=16 bits
		//range:-32768 to 32767
		
		short s=234;
		short s1=1;
		
		System.out.println(s);
		
		//3. int:
		//size:4 bytes= 32 bits
		//range: -2147483648 to 2147483647 => 2^31 to 2^31-1
		
		int i= 2300;
		int j=90334;
		int k= 0;
		
		//4. long:
		//size: 8 bytes= 64 bits
		//range: - 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 ==> 2^63 to 2^63-1
		
		long l=1212112112;
		long distance=88383849939l;
		
		long phone = 23457777262378L;// Not recommended
		
		System.out.println(phone);
		
		//BigInteger
		
		//5. float:
		//size: 4 bytes= 32 bits
		//range: after . it can take upto 7 digits
		float f1= 12.33f;
		float f2=(float)34.44;
		float f3= 100;  //100.00
		
		//6.double
		//size : 8 bytes=64 bits
		//range: after . it can take upto 15 digits
		double d= 12.333;
		double d1=1.1;
		
		//BigDecimal
		
		//7. char:
		//size: 2 bytes= 16 bits
		//range: 
		char c1= 'a';//a to z, A to Z
		char c2='1';//0-9
		char c3='H';
		char c4='$';
		
		
		//8. boolean:true/false
		//size: ~ 1 bits
		boolean flag=true;
		boolean test=false;
		
		
		
		
		
		
		
		
		
		
		
	}

}
