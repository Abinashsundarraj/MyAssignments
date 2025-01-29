package mlh_prod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Mlhprod_Intakeonboarding extends MlhBase {
	@Test
	public void RunMlhIntake() throws InterruptedException, IOException {
		// public static void main(String[] args) throws InterruptedException,
		// IOException {
		// TODO Auto-generated method stub

//		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//		// Specify the directory where you want to save the screenshot
//		String dPath = "C:\\Users\\abina\\OneDrive\\Pictures\\Screenshots\\maclear screenshot";
//		String screenshotName = "screenshot.png";
//
//		// Create the directory if it does not exist
//		File directory = new File(dPath);
//		if (!directory.exists()) {
//			directory.mkdirs();
//		}
//
//		// Save the screenshot in the specified directory
//		File destinationFile = new File(dPath + File.separator + screenshotName);
//		FileUtils.copyFile(screenshot, destinationFile);
//		
//		System.out.println("Screenshot saved successfully.");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Vendor Management']")).click();

		// d1
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Vendor Intake 2.0']")).click();

		// Thread.sleep(3000);
		// driver.findElement(By.xpath("")).click();
		// display record
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("(//span[text()='DisplayRecords'])[19]")).click();
		/// create record
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[2]/li[7]/ul[1]/li/ul/li[1]/a/span[2]")).click();
		//MlhBase.takesnap();

		System.out.println("Screenshot saved successfully.");

		// driver.findElement(By.id("535a7539-4ad3-43f5-b706-4e0ee06faba0")).sendKeys("Abinash");

		// enter the company name
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[contains(@caption,'Vendor Assessment Requested By')]"))
				.sendKeys("Abinash");

		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[contains(@caption,'MLH Business Owner ')]")).sendKeys("Abinash");

		Thread.sleep(6000);
		// click on date search box
		driver.findElement(By.xpath("//*[@id='1b18030c-7d7a-48a9-a301-b003d865f696']")).click();

		// select date
		// driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();

		// td[@class=" "]

		// select current date
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']/a")).click();

		// WebElement date = driver.findElement(By.xpath("///td[@class='
		// ui-datepicker-today']/a"));
		// driver.executeScript("arguments[0].click();", date);
		// click on lookup MLH Departments the Vendors product or services will support
		Thread.sleep(3000);
		driver.findElement(By.id("CRLink")).click();
		/// select check box //if u want excat value use index[]
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='ClsCRCheckbox']")).click();
		/// save
		// Thread.sleep(3000);
		driver.findElement(By.id("btnSave")).click();
		/// rich box text
		// switch to frame1
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@id='tinymce']/div")).sendKeys("Abinash");
		driver.switchTo().defaultContent();

		// vendor information //a[@id='CRLink']/following::div[90]

		driver.findElement(By.xpath("(//a[@id='CRLink'])[2]")).click();
		// enter name and search
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"simpletable_filter\"]/label/input")).sendKeys("Abinash");
		// click on search butoon
		Thread.sleep(3000);
		driver.findElement(By.id("btnsearch")).click();
		// select check box
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='17652']")).click();
		// click on save
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='btnSave']")).click();
		//MlhBase.takesnap();

		// product discription
		/*
		 * Thread.sleep(6000); // switch to frame 2 driver.switchTo().frame(1);
		 * driver.findElement(By.xpath("//body[@id='tinymce']/div")).sendKeys(
		 * "Abinashsundar"); driver.switchTo().defaultContent();
		 */
		// scroll down
		Thread.sleep(6000);
		WebElement findElement = driver.findElement(By.xpath("//label[text()='Sherpa Assessment Status']"));
		Actions As = new Actions(driver);
		As.scrollToElement(findElement).perform();
		// Thread.sleep(5000);
		// drop down
		driver.findElement(By.xpath("//span[@class='select2-selection__arrow']")).click();
		// select VAQ
		driver.findElement(By.xpath("//li[text()='Vendor Assessment Questionnaire']")).click();

		// drop down
		driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[2]")).click();
		// select yes
		driver.findElement(By.xpath("//li[text()='Yes']")).click();
		// select tab
		driver.findElement(By.xpath("//a[text()='Inherent Risk']")).click();
		// save and continue
		driver.findElement(By.id("btnSaveAndCont")).click();
		// save and continue alert
		// Thread.sleep(5000);//method 1 if thread is not work go method 2
		// driver.switchTo().alert().accept();
		// alert//method 2
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent()).accept();

		// submit without requried field
		// scroll down
		WebElement scrolldown = driver.findElement(By.id("btnCancel"));
		Actions scroll = new Actions(driver);
		scroll.scrollToElement(scrolldown).perform();
		// submit without requried field
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='btnUpdate']")).click();
		//MlhBase.takesnap();
		// pop up
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[text()='OK'])[3]")).click();
//					File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//					// Specify the directory where you want to save the screenshot
//					String dPath2 = "C:\\Users\\abina\\OneDrive\\Pictures\\Screenshots\\maclear screenshot";
//					String screenshotName2 = "screenshot.png";
//
//					// Create the directory if it does not exist
//					File directory2 = new File(dPath);
//					if (!directory.exists()) {
//						directory.mkdirs();
//					}
//
//					// Save the screenshot in the specified directory
//					File destinationFile2 = new File(dPath + File.separator + screenshotName);
//					FileUtils.copyFile(screenshot, destinationFile);
		//MlhBase.takesnap();
		System.out.println("Screenshot saved successfully.");

		// assigned to lookup
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("(//a[@id='CRLink'])[3]")).click();
		Thread.sleep(5000);
		WebElement assign = driver.findElement(By.xpath("(//a[@id='CRLink'])[3]"));
		driver.executeScript("arguments[0].click();", assign);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"simpletable_filter\"]/label/input")).sendKeys("Abinash");
		// click on search butoon
		Thread.sleep(3000);
		driver.findElement(By.id("btnsearch")).click();
		// select check box
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='17058']")).click();
		// click on save
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='btnSave']")).click();
		//MlhBase.takesnap();

		// Go to Inherent Risk tabs
					Thread.sleep(5000);
					WebElement risk = driver.findElement(By.xpath("//a[text()='Inherent Risk']"));
					driver.executeScript("arguments[0].click();", risk);
					
					WebElement scrollup1 = driver.findElement(By.xpath("//span[text()='Other']"));
					Actions scroll1 = new Actions(driver);
					scroll1.scrollToElement(scrollup1).perform();
					// drop down
					Thread.sleep(5000);
					driver.findElement(By.xpath("(//span[@role='presentation'])[8]")).click();
					//Thread.sleep(5000);
					//WebElement Select = driver.findElement(By.xpath("(//span[@role='presentation'])[8]"));
					//driver.executeScript("arguments[0].click();", Select);
					// select no //*[@id="select2-a4c6c385-96f0-4648-9d90-b14756ff8d28-6v-result-sqw4-No"]
					Thread.sleep(5000);
					driver.findElement(By.xpath("(//li[@class='select2-results__option'])[2]")).click();
					// scroll to vendor type
					Thread.sleep(5000);
					driver.findElement(By.xpath("//input[@value='Computer Software']")).click();

					// scroll to tire
					Thread.sleep(5000);
					driver.findElement(By.xpath("(//Span[@class='select2-selection__rendered'])[17]")).click();
					//
					driver.findElement(By.xpath("//li[text()='Tier 4']")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("(//b[@role='presentation'])[18]")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//li[text()='Confidential']")).click();

					// Go to main page
					Thread.sleep(5000);
					WebElement vendor = driver.findElement(By.xpath("//a[text()='Vendor Assessments']"));
					driver.executeScript("arguments[0].click();", vendor);

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
		//MlhBase.takesnap();
		/*
		 * //To delete intake
		 * driver.findElement(By.xpath("//label[text()='Search:']")).sendKeys("Abinash")
		 * ; Thread.sleep(5000);
		 * driver.findElement(By.xpath("//a[@title='Delete']")).click();
		 * Thread.sleep(5000);
		 * driver.findElement(By.xpath("//button[text()='Yes, delete it!']")).click();
		 * Thread.sleep(5000);
		 * driver.findElement(By.xpath("//button[text()='OK']")).click();
		 * MlhBase.takesnap();
		 */

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Questionnaires']")).click();
		// click Vendor Assessment Questionnaire
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Vendor Assessment Questionnaire']")).click();
		// click display all page
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Display Records'])[29]")).click();
		// click maclear support
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Ticket']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Maclear Support']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Display Records'])[31]")).click();

		System.out.println(driver.getTitle());
		driver.quit();

	}

}
