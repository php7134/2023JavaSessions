package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp=new LoginPage();
		lp.title();
		lp.url();
		lp.calculatePageLoadTimeout();
		lp.forgotPwd();
		lp.displayLogo();
		
		//child class object can be referred by parent abstract class ref variable
		
		Page p=new LoginPage();
		p.title();
		p.url();
		p.calculatePageLoadTimeout();
		p.displayLogo();
		
		
		
		
	}

}
