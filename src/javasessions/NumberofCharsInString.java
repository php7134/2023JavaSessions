package javasessions;

import java.util.HashMap;

public class NumberofCharsInString {
	static void charactercount(String inputString)
	{
		HashMap< Character, Integer> charCountMap=new HashMap<Character, Integer>();
		
		char[] strArray=inputString.toCharArray();
		
		for (char c: strArray)
		{
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			}
			else
			{
				charCountMap.put(c, 1);
			}
		}
	}

	public static void main(String[] args) {

		String s="Google";
		//System.out.println("Number of chars in string is: " + s.length());
		
		/*
		 * for (int i=0;i<s.length();i++) { int noofChars = i;
		 * System.out.println(noofChars); }
		 */
		
		
	}

}
