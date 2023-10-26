package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser= "chrome";
		
		switch(browser) {
		case "chrome":
			System.out.println("Launch chrome");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "edge":
			System.out.println("Launch edge");
		default:
			break;
		}		
	}

}
