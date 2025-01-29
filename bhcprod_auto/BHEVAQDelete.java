package bhcprod_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BHEVAQDelete extends BHEprodLoginBase{
	@Test
	public  void BHEVAQDelete() throws InterruptedException {
		// TODO Auto-generated method stub

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Questionnaires']")).click();
		//click Vendor Assessment Questionnaire
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Vendor Assessment Questionnaire']")).click();
		// click display all page
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[2]/li[5]/ul[1]/li/ul/li[2]/a/span[2]")).click();
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
		
		driver.quit();
	}
}
