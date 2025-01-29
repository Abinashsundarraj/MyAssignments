package bhc.auto;
	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

	public class Virus_scan {
	    public static void main(String[] args) throws InterruptedException {
	        // Set the path for the ChromeDriver executable
	       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the WebDriver (here, using ChromeDriver)
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Navigate to the webpage containing the search bar
	            driver.get("https://www.virustotal.com/gui/url/58e037c8512d2b3a66c9b6c5ff0e01d40f16fa52e25f0c3dc5a57eb4ce7e9db9");  // Replace with the URL of the page

	            // Locate the search bar element by its name, id, or other locator strategy
	        	Shadow dom=new Shadow(driver);
	        	
	        	WebElement virusscan = dom.findElementByXPath("//input[@id='searchInput']");
	    		virusscan.clear();
	    		Thread.sleep(5000);
	    		virusscan.sendKeys("https://jhvendor.macriskmanagement.com",Keys.ENTER);
	    		//String screen = dom.findElementByXPath("//div[@class='positives']").getText(); // Adjust the locator as needed

	            // Clear the default value in the search bar
	    		//screen.clear();
	    		

	            // Optionally, you can also send new text if needed
	           // searchBar.sendKeys("https://jhvendor.macriskmanagement.com");

	            // Perform other actions if needed

	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}



