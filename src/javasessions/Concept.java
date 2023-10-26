package javasessions;

import java.util.ArrayList;

public class Concept {
	//WAF
	//supply a browser name: String :chrome/ff/safari/IE
	//buss logic : launch the browser
	//return value
	
	public boolean launchBrowser(String browserName)
	{
		System.out.println(browserName);
		boolean flag=true;
		switch (browserName.toLowerCase().trim())
		{
		case "chrome":
			System.out.println("launch chrome");
			break;

		case "edge":
			System.out.println("launch edge");
			break;

		case "firefox":
			System.out.println("launch firefox");
			break;
			
		default:
			System.out.println("plz pass the right browser...."+ browserName);
			break;
		}
		return flag;	
		
	}
	
	public void testing() {
		System.out.println("testing method");
		return;
	}
	
	//WAF
	//supply input param: Company Name (String):IBM,MS,Google
	//return: the list of employee of company :ArrayList<String>
	
	public ArrayList<String> getEmpList(String compName) {
		System.out.println("company name is :" + compName);
		
		ArrayList<String> empList=new ArrayList<String>();
		
		if(compName.equalsIgnoreCase("IBM"))
		{
			empList.add("Rakesh");
			empList.add("Ravi");
			empList.add("Geeta");
		}
		else if(compName.equalsIgnoreCase("MS"))
		{
			empList.add("Abhi");
			empList.add("Heena");
			empList.add("Azam");
			empList.add("Sheena");
		}
		else if(compName.equalsIgnoreCase("Google"))
		{
			empList.add("Fawad");
			empList.add("Dhruv");
		}
		else {
			System.out.println("Company name is not found please pass right comp name.");
		}
		
		return empList;
		
	}
	
	

	public static void main(String[] args) {

		Concept c=new Concept();
		
		ArrayList<String> ibmList=c.getEmpList("IBM");
		System.out.println(ibmList);
		
		ArrayList<String> googleList=c.getEmpList("Google");
		System.out.println(googleList);
		System.out.println(googleList.size());
		
		ArrayList<String> ctsList=c.getEmpList("CTS");
		System.out.println(ctsList);
		System.out.println(ctsList.size());
		
		boolean isLaunched=c.launchBrowser("opera");
		if(isLaunched) {
			System.out.println("enter the url.....");
		}
		else
		{
			System.out.println("don't enter the url");
		}
	}

}
