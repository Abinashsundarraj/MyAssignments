package MLH_dev;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mlhdev_Solutationdashboard extends MlhBase {
	@Test
	public void Runsoulation() throws InterruptedException, IOException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='pcoded-mtext'])[1]")).click();

		Thread.sleep(3000);
		driver.findElement(By.id("donboarding")).click();

		/*
		 * File screenshot = ((TakesScreenshot)
		 * driver).getScreenshotAs(OutputType.FILE);
		 * 
		 * // Specify the directory where you want to save the screenshot String dPath =
		 * "C:\\Users\\abina\\OneDrive\\Pictures\\Screenshots"; String screenshotName =
		 * "Screenshot.png";
		 * 
		 * // Create the directory if it does not exist File directory = new
		 * File(dPath); if (!directory.exists()) { directory.mkdirs(); }
		 * 
		 * // Save the screenshot in the specified directory File destinationFile = new
		 * File(dPath + File.separator + screenshotName); FileUtils.copyFile(screenshot,
		 * destinationFile);
		 */

		System.out.println("Screenshot saved successfully.");

		// A1
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Risk']")).click();
		// A2
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Audit']")).click();
		// A3
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Support']")).click();
		// A4
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='MLH Demo']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='pcoded-mtext'])[2]")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='pcoded-mtext'])[3]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='pcoded-mtext'])[4]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Compliance']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Risk Management']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Audit']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();

		// d1
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Internal Contacts']")).click();
		driver.quit();

	}

}
