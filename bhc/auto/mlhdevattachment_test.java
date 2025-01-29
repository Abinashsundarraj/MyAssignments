package bhc.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mlhdevattachment_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		//To launch the URL
		driver.get("https://mlhdev.macriskmanagement.com/");
		// To Maximize
		driver.manage().window().maximize();
		// usernmae
		driver.findElement(By.id("LogInName")).sendKeys("asundarraj@maclear-grc.com");
		// password
		driver.findElement(By.id("OTP")).sendKeys("123456");
		// To sign
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();

		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Vendor Management']")).click();

		// d1
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Vendor Intake']")).click();

		// Thread.sleep(3000);
		// driver.findElement(By.xpath("")).click();
		// display record
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("(//span[text()='DisplayRecords'])[19]")).click();
		/// create record
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Create Records'])[20]")).click();
		
		//Go to vendor certificate tab
		Thread.sleep(5000);
		WebElement vendorcertificate = driver.findElement(By.xpath("//a[text()='Vendor Certifications']"));
		driver.executeScript("arguments[0].click();", vendorcertificate);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='Clsfiles'])[5]")).sendKeys("C:\\testleaf\\MLH_Automation\\Inheritance_Classroom_Assignment-Hints.pdf");
	}

}
