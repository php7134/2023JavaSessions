package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {

		// chrome:

		// ChromeDriver driver=new ChromeDriver();

		String browser = "chrome";
		WebDriver driver = null;

		
		//cross browser logic:
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("Safari")) {
			driver = new SafariDriver();
		}
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("page title:" + title);
		driver.findElement("emailid");
		driver.sendKeys("emailId", "abc@test.com");

		driver.findElement("password");
		driver.sendKeys("password", "abc@123");

		driver.findElement("loginbutton");
		driver.click("loginbutton");

		driver.close();

	}

}
