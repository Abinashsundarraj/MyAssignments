package MLH_dev;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QNRDELETEALL {

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
			driver.findElement(By.id("OTP")).sendKeys("SSO837");
			// To sign
			Thread.sleep(3000);
			driver.findElement(By.id("btnLogin")).click();
			
			
			
			
			// to delete multiple records
		    Thread.sleep(1000);

		    // Navigate to the 'Questionnaires' section
		    driver.findElement(By.xpath("//span[text()='Questionnaires']")).click();
		    Thread.sleep(1000);

		    // Click on 'Vendor Assessment Questionnaire'
		    driver.findElement(By.xpath("//span[text()='Attestation Questionnaire']")).click();
		    Thread.sleep(1000);

		    // Click on 'Display Records'
		    driver.findElement(By.xpath("(//span[text()='Display Records'])[25]")).click();
		    Thread.sleep(1000);

		  ////  // Loop to delete 20 records one by one
		 //   for (int i = 1; i <= 20; i++) {
		   //     try {
		            // Wait for the first record to be clickable
		      //      Thread.sleep(5000); // Adjust this time based on your page load speed
		      //      driver.findElement(By.xpath("(//td[@tabindex='0'])[" + i + "]")).click(); // Click the i-th record

		            // Click the 'Delete' option
		         //   Thread.sleep(5000);
		          //  driver.findElement(By.xpath("(//a[@title='Delete'])[" + i + "]")).click(); // Click on delete link of the record

		            // Confirm the deletion
		         //   Thread.sleep(5000);
		         //   driver.findElement(By.xpath("//button[text()='Yes, delete it!']")).click(); // Click to confirm deletion
		          //  Thread.sleep(5000);

		            // Click OK after deletion
		         //   driver.findElement(By.xpath("//button[text()='OK']")).click(); 
		         //   Thread.sleep(5000); // Wait for the record to be deleted and the page to refresh
		            
		            
		            
		            
		         // Loop to delete 20 records one by one
		            for (int i = 1; i <= 50; i++) {
		                try {
		                    // Wait for the first record in the "Display All" page to be clickable
		                    Thread.sleep(1000); // Adjust this time based on your page load speed

		                    // Select the first record after page redirection
		                    driver.findElement(By.xpath("(//td[@tabindex='0'])[1]")).click(); // Click the first record

		                    // Click the 'Delete' option for the selected record
		                    Thread.sleep(1000);
		                    driver.findElement(By.xpath("(//a[@title='Delete'])[2]")).click(); // Click on delete link of the record

		                    // Confirm the deletion
		                    Thread.sleep(5000);
		                    driver.findElement(By.xpath("//button[text()='Yes, delete it!']")).click(); // Click to confirm deletion
		                    Thread.sleep(5000);

		                    // Click OK after deletion
		                    driver.findElement(By.xpath("//button[text()='OK']")).click();
		                    Thread.sleep(2000); // Wait for the record to be deleted and the page to refresh


		            // Optionally, you can refresh the page or wait for the next record to load
		        } catch (Exception e) {
		            System.out.println("Error occurred while deleting record " + i + ": " + e.getMessage());
		        }
		    }
		}
			

	}


