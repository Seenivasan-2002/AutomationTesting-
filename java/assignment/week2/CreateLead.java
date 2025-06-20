package assignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		       //Initialize the WebDriver
				ChromeDriver driver = new ChromeDriver();
				
				//Mximize the window
				driver.manage().window().maximize();
				
				//Load the URL
				driver.get("http://leaftaps.com/opentaps/");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Enter a username and password
				driver.findElement(By.id("username")).sendKeys("demosalesmanager"); 
					
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//Click the "Login" button
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Click on the "CRM/SFA" link.
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//Click on the "Leads" tab.
				driver.findElement(By.linkText("Leads")).click();
				
				// Click on the "Create Lead" button.
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter a CompanyName.
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TEST LEAF");
				
				// Enter a FirstName.
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SeeENIVASAN");
				
				//Enter a LastName. 
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
				
				
				//Enter a Title .
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Automation Testing");
				
				// Click the "Create Lead" button.
				driver.findElement(By.name("submitButton")).click();
				
				// Verify that the Title is displayed correctly.
				String title = driver.getTitle();
				System.out.println(title);
				if (title.contains("View")) {
					System.out.println("Title is prinnted");
				} else {System.out.println("Title is not printed");}
				
				// Close the browser window.
				driver.close();

	}

}
