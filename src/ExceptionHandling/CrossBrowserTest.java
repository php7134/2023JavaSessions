package ExceptionHandling;

public class CrossBrowserTest {

	public static void main(String[] args) {

		String browser = "opera";

		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		if (browser.equals("safari")) {
			System.out.println("launch safari");
		} else {
			System.out.println("please pass right browser");
			throw new MyException("browser not found exception.");
		}
	}

}
