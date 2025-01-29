package bhcprod_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BHEVendorQuestionnaire {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver(); 
		//To launch the URL
		driver.get("https://bhcdev.macriskmanagement.com/?admin=true");
		//To Maximize
		driver.manage().window().maximize();
		//usernmae
		driver.findElement(By.id("LogInName")).sendKeys("asundarraj@maclear-grc.com");
		//password
		driver.findElement(By.id("OTP")).sendKeys("123456");
		//To sign
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Questionnaires']")).click();
		//click Vendor Assessment Questionnaire
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Vendor Assessment Questionnaire']")).click();
		// click display all page
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Display Records'])[23]")).click();
		//to create QNR
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Questionnaires']")).click();
		//click Vendor Assessment Questionnaire
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Vendor Assessment Questionnaire']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Create Records'])[33]")).click();
		driver.findElement(By.xpath("//label[text()='Single Questionnaire']")).click();
		driver.findElement(By.xpath("//label[text()='Include Attachments']")).click();
		driver.findElement(By.id("btnRecordLookUp")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("Abinash");
		driver.findElement(By.xpath("//input[@value='17017']")).click();
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
	}
}
