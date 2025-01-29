package bhc.auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BHCdev {
	

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
		driver.findElement(By.id("OTP")).sendKeys("SSO837");
		
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Vendor Management']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Vendor Onboarding Form']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Create Records'])[18]")).click();
		
		
		//scroll down
		Thread.sleep(6000);
				WebElement findElement1 = driver.findElement(By.xpath("//label[text()='Name of Vendor Company ']"));
				Actions bhc1 = new Actions(driver);
				bhc1.scrollToElement(findElement1).perform();
		
		//vendor contact information
		//Thread.sleep(6000);
		////WebElement lookup = driver.findElement(By.xpath("(//a[@id='CRLink'])[2]"));
		//driver.executeScript("arguments[0].click();", lookup);
		
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//a[@id='CRLink'])[2]")).click();
		//enter name and search
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("Abinash");
		//click on search butoon
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//select check box
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='12269']")).click();
		//click on save
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='btnSave']")).click();
		
		//BHE Business Owner / Sponsor for this Vendor
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@id='CRLink'])[3]")).click();
		//enter name and search
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Abinash");
		//click on search butoon
		Thread.sleep(3000);
		driver.findElement(By.id("btnsearch")).click();
		//select check box
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='11511']")).click();
		//click on save
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='btnSave']")).click();
		
		//Black Hills Energy Technical SME
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@id='CRLink'])[4]")).click();
		//enter name and search
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Abinash");
		//click on search butoon
		Thread.sleep(3000);
		driver.findElement(By.id("btnsearch")).click();
		
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='11511']")));
		element.click();
		
		//select check box
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@value='23643']")).click();
		//click on save
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='btnSave']")).click();
		
		//vendor product discription
		Thread.sleep(5000);
		//switch to frame 1
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Abinash");
		driver.switchTo().defaultContent();
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
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Corporate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='No']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Select Option'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Yes']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@title='Select Option'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='No']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
