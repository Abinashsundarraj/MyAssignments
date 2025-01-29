package bhcprod_auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BHEInatkeDelete extends BHEprodLoginBase{
	@Test
	public void BHEInatkeDelete() throws InterruptedException { 
	//To launch the URL
		//Method 2
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement vendorManagement = driver.findElement(By.xpath("//span[text()='Vendor Management']"));
		//Wait until the loader disappears
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressbar")));

		// Wait until the element is clickable
		wait.until(ExpectedConditions.elementToBeClickable(vendorManagement)).click();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//span[text()='Vendor Management']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Vendor Onboarding Form']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[2]/li[4]/ul[1]/li/ul/li[2]/a/span[2]")).click();
	//To delete intake
	driver.findElement(By.xpath("//label[text()='Search:']")).sendKeys("Abinash");
	Thread.sleep(5000);
	WebElement intake = driver.findElement(By.xpath("//a[@class='Clstoolbar']"));
	Actions AC = new Actions(driver);
	AC.moveToElement(intake).perform();
	
	WebElement delete = driver.findElement(By.xpath("//a[@title='Delete']"));
	driver.executeScript("arguments[0].click();", delete );
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Yes, delete it!']")).click();
	Thread.sleep(6000);
	WebElement OK = driver.findElement(By.xpath("//button[text()='OK']"));
	driver.executeScript("arguments[0].click();", OK );
	
	//driver.findElement(By.xpath("//button[text()='OK']")).click();
	
	driver.quit();

	}

}
