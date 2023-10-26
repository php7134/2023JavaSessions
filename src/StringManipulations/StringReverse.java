package StringManipulations;

import ExceptionHandling.MyException;

public class StringReverse {

	// Selenium
	// A -->A
	public static String reverseString(String st) {
		if(st==null)
		{
			System.out.println("null values can not be reversed ..plz pass the right value");
			throw new MyException("NULL VALUES");
		}
		if (st.length() == 1) {
			return st;
		}
		else if(st.length() == 0)
		{
			System.out.println("please pass the right value not the blank value");
		}
		String rev = "";
		for (int i = st.length() - 1; i >= 0; i--) {
			rev = rev + st.charAt(i);

		}
		return rev;

	}

	public static void main(String[] args) {
		System.out.println(reverseString("Selenium"));
		System.out.println(reverseString("A"));
		System.out.println(reverseString("AA"));
		System.out.println(reverseString("Selenium testing java lang"));
		//System.out.println(reverseString(null));
		System.out.println(reverseString(""));
		
		String m="selenium";
		StringBuilder sb=new StringBuilder("selenium");
		System.out.println(sb.reverse());

	}

}
