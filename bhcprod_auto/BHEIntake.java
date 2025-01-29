package bhcprod_auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BHEIntake extends BHEprodLoginBase{
@Test
	public void BHEIntake() throws InterruptedException {
		// TODO Auto-generated method stub
	//Method 1
	//WebElement element = driver.findElement(By.xpath("//span[text()='Vendor Management']"));
	//((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	//Method 2
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement vendorManagement = driver.findElement(By.xpath("//span[text()='Vendor Management']"));
	//Wait until the loader disappears
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressbar")));

	// Wait until the element is clickable
	wait.until(ExpectedConditions.elementToBeClickable(vendorManagement)).click();

		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='Vendor Management']")).click();
		driver.findElement(By.xpath("//span[text()='Vendor Onboarding Form']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[2]/li[4]/ul[1]/li/ul/li[1]/a/span[2]")).click();
		
		
		//scroll down
		Thread.sleep(8000);
				WebElement findElement1 = driver.findElement(By.xpath("//label[text()='Name of Vendor Company ']"));
				Actions bhc1 = new Actions(driver);
				bhc1.scrollToElement(findElement1).perform();
		
		//vendor contact information
		//Thread.sleep(6000);
		////WebElement lookup = driver.findElement(By.xpath("(//a[@id='CRLink'])[2]"));
		//driver.executeScript("arguments[0].click();", lookup);
		
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[@id='CRLink'])[2]")).click();
		//enter name and search
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("Abinash");
		//click on search butoon
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//select check box
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='24457']")).click();
		//click on save
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='btnSave']")).click();
		
		//BHE Business Owner / Sponsor for this Vendor
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@id='CRLink'])[3]")).click();
		//enter name and search
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Abinash");
		//click on search butoon
		Thread.sleep(5000);
		driver.findElement(By.id("btnsearch")).click();
		//select check box
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='23643']")).click();
		//click on save
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='btnSave']")).click();
		
		//Black Hills Energy Technical SME
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@id='CRLink'])[4]")).click();
		//enter name and search
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Abinash");
		//click on search butoon
		Thread.sleep(5000);
		driver.findElement(By.id("btnsearch")).click();
		
	
		
		
		//select check box
		//WebElement assign = driver.findElement(By.xpath("//input[@id='23643']"));
		//driver.executeScript("arguments[0].click();", assign);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='23643']")).click();
		//click on save
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='btnSave']")).click();
		
		//vendor product discription
		Thread.sleep(5000);
		//switch to frame 1
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Abinash");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		//Is this part of an EPMO project?
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Abinash");
		driver.switchTo().defaultContent();
		
		//What kind of data is being sent to the vendor?
		driver.switchTo().frame(2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Test record");
		driver.switchTo().defaultContent();
		
		//How will the vendor be accessing Black Hills Energy data and/or its environment?
		driver.switchTo().frame(3);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("This is a test record");
		driver.switchTo().defaultContent();
		//Thread.sleep(6000);
		//Thread.sleep(6000);
		driver.findElement(By.xpath("//label[text()='No ']")).click();
		
		//scroll down
		WebElement findElement = driver.findElement(By.xpath("//th[text()='Division Description']"));
		Actions bhc = new Actions(driver);
		bhc.scrollToElement(findElement).perform();
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Select Option'])[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Not Required']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Select Option'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='No, this is a new solution']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Select Option'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='No']")).click();
		
				
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@dateclass='dummy']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']/a")).click();
		
		//BHE Divisions Vendor Product or Services will Support
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@id='CRLink'])[5]")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Abinash");
		//click on search butoon
		//Thread.sleep(3000);
		//driver.findElement(By.id("btnsearch")).click();
		//select check box
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='11511']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).click();

		//click on save
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='btnSave']")).click();
		
		// save and continue
		Thread.sleep(3000);
				driver.findElement(By.id("btnSaveAndCont")).click();
				// save and continue alert
				// Thread.sleep(5000);//method 1 if thread is not work go method 2
				// driver.switchTo().alert().accept();
				// alert//method 2
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
				wait1.until(ExpectedConditions.alertIsPresent()).accept();

				// submit without requried field
				// scroll down
				WebElement scrolldown = driver.findElement(By.id("btnCancel"));
				Actions scroll = new Actions(driver);
				scroll.scrollToElement(scrolldown).perform();
				// submit without requried field
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@id='btnUpdate']")).click();
				Thread.sleep(5000);
				WebElement element2 = driver.findElement(By.xpath("//span[text()='Corporate']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='Corporate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='No']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Select Option'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Yes']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@title='Select Option'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Yes']")).click();
		
		// submit
				// scroll down
				WebElement scrolldown1 = driver.findElement(By.id("btnCancel"));
				Actions scr = new Actions(driver);
				scr.scrollToElement(scrolldown1).perform();
				// final submit
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@id='btnUpdate']")).click();
				// driver.switchTo().alert().accept(); method 1
				Thread.sleep(6000);// method 1 if thread is not work go method 2
				WebDriverWait waitok = new WebDriverWait(driver, Duration.ofSeconds(30));
				waitok.until(ExpectedConditions.alertIsPresent()).accept();
		
				driver.quit();
	}

}
