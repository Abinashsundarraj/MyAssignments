package bhcprod_auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BHESolutiondashboard extends BHEprodLoginBase{
	@Test
	public void BHESolutiondashboard() throws InterruptedException {
		// TODO Auto-generated method stub

				Thread.sleep(3000);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement SolutionDashboard = driver.findElement(By.xpath("//span[text()='Solution Dashboard']"));
				//Wait until the loader disappears
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressbar")));

				// Wait until the element is clickable
				wait.until(ExpectedConditions.elementToBeClickable(SolutionDashboard)).click();
		//driver.findElement(By.xpath("//span[text()='Solution Dashboard']")).click();
		
		//Thread.sleep(3000);
		//driver.findElement(By.id("donboarding")).click();
		
		
		//A1
		//Thread.sleep(5000);
		//driver.findElement(By.id("dnotification")).click();
		//A2
				Thread.sleep(9000);
				driver.findElement(By.xpath("//a[text()='Notification Chart']")).click();
		//A2
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='ISMS Policy Report']")).click();
		//A3
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Vendor Sub-Service Providers']")).click();
		//A4
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='3rd Party Risk']")).click();
		//A5
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Risk Management']")).click();
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='Vendor Dashboard']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Multiple Document Report']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Asset Management']")).click();
		

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Compliance']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Risk Management']")).click();
		
		driver.quit();
		

	}
}
