package mlh_prod;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

	public class Mlhprod_QNRDELETE extends MlhBase {
		@Test
		public void RunQNRDELETE() throws InterruptedException {

			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()='Questionnaires']")).click();
			// click Vendor Assessment Questionnaire
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()='Vendor Assessment Questionnaire']")).click();
			// click display all page
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[2]/li[8]/ul[2]/li/ul/li[2]/a/span[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//label[text()='Search:']")).sendKeys("Abinash");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//td[@tabindex='0']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//a[@title='Delete'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='Yes, delete it!']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='OK']")).click();
			driver.quit();
		}

	}



