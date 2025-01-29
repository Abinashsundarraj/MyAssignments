package mlh_prod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mlhprod_Intakedelete extends MlhBase {
	@Test
	public void RunIntakedelete() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Vendor Management']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Vendor Intake 2.0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[2]/li[7]/ul[1]/li/ul/li[2]/a/span[2]")).click();
		// To delete intake
		driver.findElement(By.xpath("//label[text()='Search:']")).sendKeys("Abinash");
		Thread.sleep(5000);
		WebElement intake = driver.findElement(By.xpath("//a[@class='Clstoolbar']"));
		Actions AC = new Actions(driver);
		AC.moveToElement(intake).perform();

		WebElement delete = driver.findElement(By.xpath("//a[@title='Delete']"));
		driver.executeScript("arguments[0].click();", delete);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Yes, delete it!']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		driver.quit();
		

	}

}
