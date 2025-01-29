package MLH_dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mlhdev_Intakedelete extends MlhBase {
	@Test
	public void RunIntakedelete() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Vendor Management']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Vendor Intake']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Display Records'])[20]")).click();
		// To delete intake
		driver.findElement(By.xpath("//label[text()='Search:']")).sendKeys("Abinash");
		Thread.sleep(5000);
		WebElement intake = driver.findElement(By.xpath("//a[@class='Clstoolbar']"));
		Actions AC = new Actions(driver);
		AC.moveToElement(intake).perform();

		WebElement delete = driver.findElement(By.xpath("//a[@title='Delete']"));
		driver.executeScript("arguments[0].click();", delete);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Yes, delete it!']")).click();
		
		//driver.findElement(By.xpath("/html/body/div[49]/div[7]/div/button")).click();
		////button[@class='confirm']
		//WebElement ok = driver.findElement(By.xpath("//button[@class='confirm']"));
		//driver.executeScript("arguments[0].click();", ok);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.quit();
		

	}

}
