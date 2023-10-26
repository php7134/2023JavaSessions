package OOP_Abstract;

public class LoginPage extends Page {

	@Override
	public void title() {
		System.out.println("login title");
	}

	@Override
	public void url() {
		System.out.println("https://www.abc.com/login.html");
		
	}
	@Override
	public void calculatePageLoadTimeout()
	{
		System.out.println("page time out --- 5 secs");
	}
    public void forgotPwd()
    {
    	System.out.println("forgotPwd");
    }
	
}
