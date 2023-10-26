package OOP_Encapsualtion;

public class Browser {
	
	
	
	public void launchBrowser()
	{
		System.out.println("launching browser.........");
		checkBrowserVersion();
		checkOSCompatability();
		checkRAM();
        checkCPU();
        System.out.println("browser is launched..........");
	}

	private void checkBrowserVersion()
	{
		System.out.println("check browser version.........");
	}

	private void checkOSCompatability()
	{
		System.out.println("checkOSCompatability.........");
	}

	private void checkRAM()
	{
		System.out.println("check RAM.........");
	}

	private void checkCPU()
	{
		System.out.println("checkCPU.........");
	}

}
