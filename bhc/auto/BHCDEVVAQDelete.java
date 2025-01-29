package bhc.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BHCDEVVAQDelete {
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
		driver.findElement(By.xpath("//span[text()='Questionnaires']")).click();
		//click Vendor Assessment Questionnaire
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Vendor Assessment Questionnaire']")).click();
		// click display all page
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Display Records'])[30]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Search:']")).sendKeys("Abinash");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[@tabindex='0']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@title='Delete'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Yes, delete it!']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}
}
