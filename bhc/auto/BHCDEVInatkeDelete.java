package bhc.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BHCDEVInatkeDelete {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver(); 
	//To launch the URL
	driver.get("https://blackhills.macriskmanagement.com/?admin=true");
	//To Maximize
	driver.manage().window().maximize();
	//usernmae
	driver.findElement(By.id("LogInName")).sendKeys("asundarraj@maclear-grc.com");
	//password
	driver.findElement(By.id("Password")).sendKeys("SSO837");
	
	//To sign
	Thread.sleep(3000);
	driver.findElement(By.id("btnLogin")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Vendor Management']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Vendor Onboarding Form']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[text()='Display Records'])[17]")).click();
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
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='OK']")).click();
	}

}
