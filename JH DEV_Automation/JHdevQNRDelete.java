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

public class JHdevQNRDelete extends JHdevLoginBase {
	@Test
	public void RunJHQNRDelete() throws InterruptedException, IOException {
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Questionnaires']")).click();
		//JHLoginBase.takesnap();
		//click Vendor Assessment Questionnaire
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='3rd Party Questionnaire']")).click();
		// click display all page
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Display Records'])[33]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Search:']")).sendKeys("sejal");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[@tabindex='0']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@title='Delete'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Yes, delete it!']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		//JHLoginBase.takesnap();
	}
	}

