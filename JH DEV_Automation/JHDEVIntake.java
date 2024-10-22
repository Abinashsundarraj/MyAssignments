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

public class JHDEVIntake extends JHdevLoginBase {
	@Test
	public void RunJHIntake() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Third Party Risk']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Intake (Onboarding) Form']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Display Records'])[28]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='pull-right btn btn-design']")).click();
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Select Option']")).click();
		//driver.findElement(By.xpath("//*[@id=\"select2-1d4f7bf1-b8ac-42fe-bcf9-68279b979550-xc-container\"]")).click();
		//*[@id="select2-1d4f7bf1-b8ac-42fe-bcf9-68279b979550-xc-container"]
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='Select Option']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Yes']")).click();
		// vendor information
		driver.findElement(By.xpath("(//a[@id='CRLink'])[1]")).click();
		//enter name and search
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"simpletable_filter\"]/label/input")).sendKeys("Abi");
		//click on search butoon
		Thread.sleep(3000);
		driver.findElement(By.id("btnsearch")).click();
		//select check box
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='15886']")).click();
		//click on save
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='btnSave']")).click();
		///JHLoginBase.takesnap();
		
		
		//Business Function Requesting Vendor
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='fa fa-search'])[4]")).click();
		///select check box //if u want excat value use index[]
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='ClsCRCheckbox']")).click();
		/// save
		//Thread.sleep(3000);
		driver.findElement(By.id("btnSave")).click();
		
		//scroll down down
		WebElement scrolldown = driver.findElement(By.id("btnCancel"));
		Actions scroll = new Actions(driver);
		scroll.scrollToElement(scrolldown).perform();
		
		//save and continue
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		///JHLoginBase.takesnap();
		 // save and continue alert
		// Thread.sleep(5000);//method 1 if thread is not work go method 2
			//driver.switchTo().alert().accept();
			//alert//method 2
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.alertIsPresent()).accept();
			
			//scroll down down
			WebElement scrolldown1 = driver.findElement(By.id("btnCancel"));
			Actions scroll1 = new Actions(driver);
			scroll.scrollToElement(scrolldown1).perform();
				
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='<5 Years ']")).click();
		//select cureent date
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='icofont icofont-ui-calendar'])[3]")).click();
		//Projected Work Start Date
		Thread.sleep(6000);
		driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']/a")).click();
		//Expected Date of Contract Execution
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='icofont icofont-ui-calendar'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='15']")).click();
		
		//Please Select the Processes This Vendor Will Engage With
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//i[@class='fa fa-search'])[6]")).click();
				///select check box //if u want excat value use index[]
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@value='15848']")).click();
				/// save
				//Thread.sleep(3000);
				driver.findElement(By.id("btnSave")).click();
				
				//Will the Vendor Access or Store PII, Confidential or IP Information?
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//label[text()='No'])[1]")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//label[text()='No'])[2]")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//label[text()='No'])[3]")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[@title='Select Option']")).click();
				driver.findElement(By.xpath("//li[text()='1234']")).click();
				

				Thread.sleep(5000);
				driver.findElement(By.xpath("(//b[@role='presentation'])[4]")).click();
				driver.findElement(By.xpath("//li[text()='Yes']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[@title='Select Option']")).click();
				driver.findElement(By.xpath("//li[text()='No']")).click();
				
				
				//scroll down down
				WebElement scrolldown2 = driver.findElement(By.id("btnCancel"));
				Actions scroll2 = new Actions(driver);
				scroll.scrollToElement(scrolldown2).perform();
				//submit without requried field
				
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@value='Submit']")).click();
				///JHLoginBase.takesnap();
				//pop up
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//button[text()='OK'])[3]")).click();
				
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"1d604fea-c7c8-404e-ad32-88aebc7d2a09\"]")).click();
				// select current date
				Thread.sleep(5000);
				driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']/a")).click();
				
				
				///rich box text
				//switch to frame1
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Abinash test");
				driver.switchTo().defaultContent();
				
				driver.switchTo().frame(1);
				driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Abinashsundar test");
				driver.switchTo().defaultContent();
				
				//submit 
				//scroll down
				WebElement scrolldown3 = driver.findElement(By.id("btnCancel"));
				Actions scr = new Actions(driver);
				scr.scrollToElement(scrolldown3).perform();
				//final submit 
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@id='btnUpdate']")).click();
				///JHLoginBase.takesnap();
				
				Thread.sleep(6000);//method 1 if thread is not work go method 2
				driver.switchTo().alert().accept();
				
				
				
				
				

		
		
}
}
