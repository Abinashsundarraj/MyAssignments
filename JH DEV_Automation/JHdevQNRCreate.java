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

public class JHdevQNRCreate extends JHdevLoginBase {
	@Test
	public void RunJHQNRCreate() throws InterruptedException, IOException {
		// TODO Auto-generated method stu
		
	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Questionnaires']")).click();
		//click Vendor Assessment Questionnaire
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='3rd Party Questionnaire']")).click();
		 //click display all page
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Display Records'])[33]")).click();
		//to create QNR
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Questionnaires']")).click();
		//click 3rd Party Questionnaire
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='3rd Party Questionnaire']")).click();
		//JHLoginBase.takesnap();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Create Records'])[34]")).click();
		driver.findElement(By.xpath("//label[text()='Single Questionnaire']")).click();
		driver.findElement(By.xpath("//label[text()='Include Attachments']")).click();
		driver.findElement(By.id("btnRecordLookUp")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("sejal");
		driver.findElement(By.xpath("//input[@value='13233']")).click();
		driver.findElement(By.id("btnSaveRecord")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("QuestionnaireEndDate")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='10']")).click();
		driver.findElement(By.id("btnSubmit")).click();
		//without fill the questionnaire click on save
	    Thread.sleep(6000);
		WebElement save = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[1]"));
		driver.executeScript("arguments[0].click();", save);	
		//JHLoginBase.takesnap();
}
}
