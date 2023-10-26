package StringManipulations;

public class StringConcept {

	public static void main(String[] args) {

		//String literals
		
		String s="Hello";
		String s1="Hello";
		String s2="hello";
		
		System.out.println(s==s1); //true
		System.out.println(s1==s2);
		
		//String Objects with new Keyword:
		String  st=new String("Java");
		String st1=new String("Hello");
		
		System.out.println(s==st1); //false
		System.out.println(s.equals(st1)); //true
		
		String st2=new String("Hello");
		
		String test=new String("Selenium");
		test.intern(); //1 String constant pool		
		String t1="Selenium";
		
		String st4=new String();
		System.out.println(st4.length());

		
				
		
	}

}
