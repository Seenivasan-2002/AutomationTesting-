package assignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		//- Initialize the WebDriver (ChromeDriver). 
		ChromeDriver driver = new ChromeDriver();
		
		//- Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//- Maximize the browser window.
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//- Enter the username.
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//- Enter the password.
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//- Click the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//- Click the "crm/sfa" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//- Click the "Leads" link.
		driver.findElement(By.linkText("Leads")).click();
		
		//- Click "Find leads."
	 	driver.findElement(By.linkText("Find Leads")).click();
		
		//- Click on the "Phone" tab.
	    driver.findElement(By.linkText("Phone")).click();
		
		//- Enter the phone number.
	    driver.findElement(By.name("phoneNumber")).sendKeys("99");
	    
	    
		//- Click the "Find leads" button.
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		 
		 //Capture the lead ID of the first resulting lead.
		 WebElement leadid = driver.findElement(By.linkText("12807"));
		 
		//- Click the first resulting lead.
                leadid.click();
		  WebElement oldid = driver.findElement(By.xpath("//span[text()='Testleaf (12807)']"));
		      System.out.println(oldid.getText());
				 
		 //- Click the "Delete" button. 
		 driver.findElement(By.linkText("Delete")).click();
		 //- Click "Find leads" again. 
		driver.findElement(By.linkText("Find Leads")).click();
		 //- Enter the captured lead ID. 
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("12807");
		 //- Click the "Find leads" button.
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 //- Verify the presence of the message "No records to display" in the Lead List.
		 String msg = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
			
			if (msg.contains("No records to display"))
			{
				System.out.println("The given Message is:"+ msg);
				
			}else
			{
				System.out.println(" UnSuccessful");
			}				
			
		 //This message confirms the successful deletion. 
		System.out.println("Account deleted successfully");
		driver.close();
		
	}

}
