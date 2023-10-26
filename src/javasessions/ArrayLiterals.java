package javasessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2. Array Literals

		int a[] = { 1, 3, 5, 85, 334 };

		System.out.println(a.length);
		System.out.println(Arrays.toString(a));

		double d[] = { 1.1, 2.3, 4.5, 5.6 };
		char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

		String browser[] = { "chrome", "firfox", "IE", "Edge", "Safari" };

		for (int k = 0; k < browser.length; k++) {
			System.out.println(browser[k]);
			if (browser[k].equals("IE")) {
				System.out.println("this is deprecated");
			}

			switch (browser[k]) {
			case "chrome": {

				System.out.println("chrome by google");
				break;
			}
			case "firfox": {

				System.out.println("firfox by mozilla");
				break;
			}
			case "IE": {

				System.out.println("IE by Microsoft but depricated");
				break;

			}
			case "Edge": {

				System.out.println("Edge by Microsoft");
				break;
			}
			case "Safari": {

				System.out.println("Safari by Apple");
				break;
			}

			default:
				System.out.println("Please pass the correct browser.");
				;
			}
		}

	}

}
