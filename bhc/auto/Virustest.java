package bhc.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class Virustest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.virustotal.com/gui/url/58e037c8512d2b3a66c9b6c5ff0e01d40f16fa52e25f0c3dc5a57eb4ce7e9db9");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	
		Shadow dom=new Shadow(driver);
		String screen = dom.findElementByXPath("//div[@class='positives']").getText();
		int Number = Integer.parseInt(screen);
		if(Number>0) {
			System.out.println(Number+"takesnap");
		}
		else {
			System.out.println(Number+"snap not need");
		}
		//WebElement virusscan = dom.findElementByXPath("//input[@id='searchInput']");
		//virusscan.clear();
		//Thread.sleep(500);
		//virusscan.sendKeys("https://jhvendor.macriskmanagement.com",Keys.ENTER);
		
		 // Locate the search bar element by its name, id, or other locator strategy
		//Thread.sleep(6000);
       // WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));  // Adjust the locator as needed

        // Clear the default value in the search bar
       // searchBar.clear();

        // Optionally, you can also send new text if needed
       // searchBar.sendKeys("https://jhvendor.macriskmanagement.com");
		
	}

}
