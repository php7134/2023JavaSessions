package StringManipulations;

public class StringImmutable {

	public static void main(String[] args) {

		String s="Selenium";
		
		String t=s+"Hello";
		
		System.out.println(t);
		System.out.println(s);
		
		String st="Java";
		System.out.println(st+"Python");
		System.out.println(st);
		
		st=st+"Automation";
		System.out.println(st);
		
		String u="Java";
		
		//mutable classes
		//StringBuilder and StringBuffer
		StringBuilder sb=new StringBuilder("Testing");
		sb.append("Automation");
		System.out.println(sb);
		
		String pop="       Submit       ";
		pop=pop.trim();
		System.out.println(pop);
	}

}
