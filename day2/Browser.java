package week1.day2;

public class Browser {
	public String launchBroswer(String browserName) {
		// TODO Auto-generated method stub
System.out.println("Browser Launched successfully");
return browserName;
	}
	public void loadurl() 
	{
		System.out.println("Applicatin url loaded successfully");
		}
	public static void main(String[] args) {
		Browser lg = new Browser();
		lg.launchBroswer("chromebrowser");
		lg.loadurl();
	}
		
		
	}
	

