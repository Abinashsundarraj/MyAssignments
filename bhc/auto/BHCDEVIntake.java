package bhc.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BHCDEVIntake {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://blackhills.macriskmanagement.com/?admin=true");
		//To Maximize
		driver.manage().window().maximize();
		//usernmae
		driver.findElement(By.id("LogInName")).sendKeys("asundarraj@maclear-grc.com");
		//password
		driver.findElement(By.id("Password")).sendKeys("Abinash123");
		Thread.sleep(3000);
		driver.findElement(By.id("CompanyID")).sendKeys("bhc");
		//To sign
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();

	}

}
