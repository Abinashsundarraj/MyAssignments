package mlh_prod;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class MlhBase {
	public static  ChromeDriver driver;
	public int arib;
	@BeforeMethod
		public  void start() throws InterruptedException, IOException {
			
			 driver=new ChromeDriver(); 
			//To launch the URL
			 driver.get("https://mlh.macriskmanagement.com/?admin=true");
			//To Maximize
			driver.manage().window().maximize();
			//usernmae
			driver.findElement(By.id("LogInName")).sendKeys("asundarraj@maclear-grc.com");
			//password
			driver.findElement(By.id("OTP")).sendKeys("SSO837");
			//To sign
			Thread.sleep(3000);
			driver.findElement(By.id("btnLogin")).click();
			
			//File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			// Specify the directory where you want to save the screenshot
			//String dPath = "C:\\Users\\abina\\OneDrive\\Pictures\\Screenshots\\maclear screenshot";
			//String screenshotName = "screenshot"+arib+".png";

			// Create the directory if it does not exist
			//File directory = new File(dPath);
			//if (!directory.exists()) {
				//directory.mkdirs();
			//}

			// Save the screenshot in the specified directory
			//File destinationFile = new File(dPath + File.separator + screenshotName);
			//FileUtils.copyFile(screenshot, destinationFile);
			System.out.println("Screenshot saved successfully.");
	}

	@AfterTest
	public void emailattachment() throws IOException {
		// SMTP server information
		String host = "email-smtp.us-east-1.amazonaws.com";
		final String user = "AKIA4DW4PSZN6K6LHIKH"; // replace with your email
		final String password = "BNaUy+q29Q5Rjv/j5YQkmmBh7jkrtY6lEeYMXAoblQG6"; // replace with your email password
		// for 1 email send
		// Recipient's email ID needs to be mentioned
		// String to = "asundarraj@maclear-grc.com"; // replace with the recipient's
		// email
		
		
		
			// SMTP server information
			
			/*
			 * String host = "smtp.gmail.com"; final String user =
			 * "abinashsundarraj@gmail.com"; // replace with your email final String
			 * password = "nzwv ixev nlre eukb"; // replace with your email password
			 */			 
		// Get system properties
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true"); // Enable STARTTLS
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587"); // Port for TLS
		
		
		
		
		 
		// Get the Session object and pass username and password
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});
		try {
			// Create a default MimeMessage object
	Message message = new MimeMessage(session);
// Set From: header field
	message.setFrom(new InternetAddress("support@maclear-grc.com"));
	
	InternetAddress[] toAddresses = { new InternetAddress("asundarraj@maclear-grc.com"),
			new InternetAddress("rkanna@maclear-grc.com"),
			new InternetAddress("rsingh@maclear-grc.com"),new InternetAddress("spatel@maclear-grc.com"),
			new InternetAddress("kdholakia@maclear-grc.com"),
			new InternetAddress("sparikh@maclear-grc.com"),
			new InternetAddress("delliot@maclear-grc.com"),new InternetAddress("abinashsundarraj@gmail.com")
			};message.setRecipients(Message.RecipientType.TO,toAddresses);
			
			
			//new InternetAddress("rkanna@maclear-grc.com"),
			//new InternetAddress("rsingh@maclear-grc.com"),
			//new InternetAddress("spatel@maclear-grc.com"),
			//new InternetAddress("kdholakia@maclear-grc.com"),
			//new InternetAddress("delliot@maclear-grc.com")};message.setRecipients(Message.RecipientType.TO,toAddresses);

	// Set To: header field
	// message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

	// Set Subject: header field
	message.setSubject("Test Mail");

	// Now set the actual message
	message.setText("This is a test mail ... :-)");
	// Set Subject: header field
	message.setSubject("MLH -Prod Automation report");

	// Create the message part
	BodyPart messageBodyPart = new MimeBodyPart();

	// Now set the actual message
	messageBodyPart.setText("This is Automation Report for MLH Prod - Major Functionnality.");

	// Create a multipart message
	Multipart multipart = new MimeMultipart();

	// Set text message part
	multipart.addBodyPart(messageBodyPart);

	// Part two is attachment
	messageBodyPart=new MimeBodyPart();
	String filename = "C:\\testleaf\\MLHPROD_Automation\\test-output\\emailable-report.html";
	// change to the
	// String filename1 = "C:\\abinash\\emailable-report.html";
	// path of your
	// file
	DataSource source = new FileDataSource(
			filename);messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(new File(filename).getName());
			multipart.addBodyPart(messageBodyPart);

	// Send the complete message parts
	message.setContent(multipart);

	// DataSource source1 = new FileDataSource(filename1);
	// messageBodyPart.setDataHandler(new DataHandler(source1));
	// messageBodyPart.setFileName(new File(filename1).getName());
	// multipart.addBodyPart(messageBodyPart);

	// Send the complete message parts
	// message.setContent(multipart);

	// Send message
	Transport transport = session.getTransport(
			"smtp");transport.connect(host,user,password);transport.sendMessage(message,message.getAllRecipients());transport.close();

	System.out.println("Sent message successfully....");

	}catch(
	MessagingException e)
	{
		e.printStackTrace();
	}
	}

	// for email to send 1 account
	/*
	 * try { // Create a default MimeMessage object Message message = new
	 * MimeMessage(session);
	 * 
	 * // Set From: header field //message.setFrom(new InternetAddress(user));
	 * 
	 * // Set To: header field //message.setRecipients(Message.RecipientType.TO,
	 * InternetAddress.parse(to));
	 * 
	 * // Set Subject: header field message.setSubject("Test Mail");
	 * 
	 * // Now set the actual message message.setText("This is a test mail ... :-)");
	 * 
	 * // Set Subject: header field message.setSubject("Test Mail with Attachment");
	 * 
	 * // Create the message part BodyPart messageBodyPart = new MimeBodyPart();
	 * 
	 * // Now set the actual message
	 * messageBodyPart.setText("This is a test mail with an attachment.");
	 * 
	 * // Create a multipart message Multipart multipart = new MimeMultipart();
	 * 
	 * // Set text message part multipart.addBodyPart(messageBodyPart);
	 * 
	 * // Part two is attachment messageBodyPart = new MimeBodyPart(); String
	 * filename =
	 * "C:\\testleaf\\MLHDEV.Automation\\test-output\\emailable-report.html"; //
	 * change to the path of your file DataSource source = new
	 * FileDataSource(filename); messageBodyPart.setDataHandler(new
	 * DataHandler(source)); messageBodyPart.setFileName(new
	 * File(filename).getName()); multipart.addBodyPart(messageBodyPart);
	 * 
	 * // Send the complete message parts message.setContent(multipart);
	 * 
	 * 
	 * // Send message Transport transport = session.getTransport("smtp");
	 * transport.connect(host, user, password); transport.sendMessage(message,
	 * message.getAllRecipients()); transport.close();
	 * 
	 * System.out.println("Sent message successfully....");
	 * 
	 * 
	 * } catch (MessagingException e) { e.printStackTrace(); } }
	 */public static void takesnap() throws IOException {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Specify the directory where you want to save the screenshot
		String dPath = "C:\\Users\\abina\\OneDrive\\Pictures\\Screenshots\\maclear screenshot";
		String screenshotName = "screenshot/" + imagenumber() + ".png";

		// Create the directory if it does not exist
		File directory = new File(dPath);
		if (!directory.exists()) {
			directory.mkdirs();
		}

		// Save the screenshot in the specified directory
		File destinationFile = new File(dPath + File.separator + screenshotName);
		FileUtils.copyFile(screenshot, destinationFile);
	}

	public static int imagenumber() {
		Random random = new Random();
		int arib = random.nextInt(100);
		return arib;

	}

}
