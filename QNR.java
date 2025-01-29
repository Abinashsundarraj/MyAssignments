package MLH_dev;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class QNR extends MlhBase {
	@Test
	public void RunQNR() throws InterruptedException, IOException {
		// public static void main(String[] args)throws InterruptedException,
		// IOException{
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Questionnaires']")).click();
		// click Vendor Assessment Questionnaire
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Vendor Assessment Questionnaire']")).click();
		// click display all page
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Display Records'])[23]")).click();
		// to create QNR
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Questionnaires']")).click();
		// click Vendor Assessment Questionnaire
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Vendor Assessment Questionnaire']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Create Records'])[23]")).click();
		driver.findElement(By.xpath("//label[text()='Single Questionnaire']")).click();
		driver.findElement(By.xpath("//label[text()='Include Attachments']")).click();
		driver.findElement(By.id("btnRecordLookUp")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("Abinash");
		driver.findElement(By.xpath("//input[@value='16969']")).click();
		driver.findElement(By.id("btnSaveRecord")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("QuestionnaireEndDate")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='10']")).click();
		driver.findElement(By.id("btnSubmit")).click();
		// without fill the questionnaire click on save
		Thread.sleep(6000);
		WebElement save = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[1]"));
		driver.executeScript("arguments[0].click();", save);
		// Delete QNR
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//label[text()='Search:']")).sendKeys("Abinash");
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//td[@tabindex='0']")).click();

		// driver.findElement(By.xpath("//input[@class='form-control
		// input-sm']")).sendKeys("Abinash");

		// driver.findElement(By.xpath("//td[@tabindex='0']")).click();
		// driver.findElement(By.xpath("(//a[text()='Edit'])[2]")).click();
		// driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("This
		// is test record");
		// driver.findElement(By.xpath("(//input[@class='form-control
		// input-sm'])[5]")).sendKeys("This is test record");
		// driver.findElement(By.xpath("(//input[@class='form-control
		// input-sm'])[6]")).sendKeys("This is test record");

	}

}
