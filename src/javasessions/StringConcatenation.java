package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println(a+b);//30
		
		String x="Hello";
		String y="Selenium";
		
		System.out.println(x+y);
		System.out.println(a+x);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+a+b);
		System.out.println(a+b+x+y+(a+b));
		
		double c=12.33;
		double d=23.44;
		
		System.out.println(x+y+c+d);
		System.out.println(x+y+a+b+c+d);
		
		char g='m';
		char p='n';
		
		String l="testing";
		String u="automation";
		
		System.out.println(l+u);
		System.out.println(l+u+g+p);
		
		char t1='a';//97
		char t2='b';//98
		
		System.out.println(t1+t2);
		
		char t3='z';//122
		System.out.println(t1+t2+t3);
		System.out.println(t1);
		
		System.out.println(t2-t1);
		
		char gender='m';
		
		System.out.println('a'+'b');
		System.out.println(a+b);
		
		//Range
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		System.out.println('$'+'a');
		
		System.out.println((byte)'a');
		System.out.println((byte)'$');
		System.out.println((int)'a');
		
		
		int s1=100;
		int s2=300;
		System.out.println("the value of s1 is: "+s1);
		System.out.println("the value of s1 is: "+s2);
		
		System.out.println("the sum is: "+ (s1 + s2));
		

	}

}
