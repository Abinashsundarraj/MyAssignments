package bhc.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BHCDEVSolutiondashboard {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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
		driver.findElement(By.xpath("//span[text()='Solution Dashboard']")).click();
		
		//Thread.sleep(3000);
		//driver.findElement(By.id("donboarding")).click();
		
		
		//A1
		//Thread.sleep(5000);
		//driver.findElement(By.id("dnotification")).click();
		//A2
				Thread.sleep(5000);
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
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Vendor Dashboard']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Multiple Document Report']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Asset Management']")).click();
		

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Compliance']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Risk Management']")).click();
		

	}
}
