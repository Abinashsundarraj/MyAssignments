package jh_auto;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JHdevSolutiondashboard extends JHdevLoginBase {
	@Test
	public void RunJHDEVSolutiondashboard() throws InterruptedException, IOException {
		
		//
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='pcoded-mtext'])[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[text()='Historical Report']")).click();
		//JHLoginBase.takesnap();
		//A2
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Intake Report']")).click();
		//A3
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Third Party Risk']")).click();
		//A4
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Audit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='BC/DR']")).click();
		//A4
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Compliance']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Risk']")).click();
		//JHLoginBase.takesnap();
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='pcoded-mtext'])[2]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='pcoded-mtext'])[3]")).click();
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("(//span[@class='pcoded-mtext'])[4]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Business Hierarchy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Policy']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Compliance']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Risk Management']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Business Continuity']")).click();

	}

}
