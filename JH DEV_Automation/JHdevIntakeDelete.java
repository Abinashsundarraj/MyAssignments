package jh_auto;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JHdevIntakeDelete extends JHdevLoginBase {
	@Test
	public void RunJHIntakeDelete() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		///JHLoginBase.takesnap();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Third Party Risk']")).click();
		///JHLoginBase.takesnap();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Intake (Onboarding) Form']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Display Records'])[28]")).click();
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
		///JHLoginBase.takesnap();
	}
}
