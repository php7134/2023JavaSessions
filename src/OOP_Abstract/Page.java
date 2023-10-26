package OOP_Abstract;

public abstract class Page {
	
	//100% abstraction
	//0% abstraction
	//partial abstraction
	
	public Page()
	{
		System.out.println("page constant...");
	}
	
	public Page(int i)
	{
		System.out.println("one param page constant...");
	}

	
	public abstract void title();
	public abstract void url();
	
	
	public void calculatePageLoadTimeout()
	{
		System.out.println("page time out --- 20 secs");
	}
	
	public final void displayLogo()
	{
		System.out.println("dispaly logo");
	}
	public static void footer()
	{
		System.out.println("page footer");
	}

	
}
