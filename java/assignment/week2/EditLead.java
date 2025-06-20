package assignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {



	public static void main(String[] args) {
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
		
		//Enter the CompanyName Field Using Xpath.
		driver.findElement(By.xpath("// input[@id='createLeadForm_companyName']")).sendKeys("TEST");
		
		//- Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("// input[@id='createLeadForm_firstName']")).sendKeys("RAMANA");

		
		//- Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("// input[@id='createLeadForm_lastName']")).sendKeys("S");

		
		//- Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("// input[@id='createLeadForm_firstNameLocal']")).sendKeys("SR");

		
		//- Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Department");
		
		//- Enter the Description Field Using any Locator of your choice.
		WebElement descript1 = driver.findElement(By.id("createLeadForm_description"));
		descript1.sendKeys("Selenium Automation Tester");
		
		//- Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("seenitestlesf@gmail.com");
		
		//- Select State/Province as NewYork Using Visible Text. 
		WebElement province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select state =new  Select(province);
		 state.selectByVisibleText("New York");
		 
		//- Click on the Create Button.
			driver.findElement(By.name("submitButton")).click();

		
		//- Click on the edit button. 
			driver.findElement(By.linkText("Edit")).click();
		
		//- Clear the Description Field. 
			driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//- Fill the Important Note Field with Any text.
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Automation testing team");
		
		// - Click on the update button. 
		driver.findElement(By.name("submitButton")).click();
		 
		//- Get the Title of the Resulting Page.
		String title = driver.getTitle();
		System.out.println(title);
		//- Close the browser window.
		driver.close();
	}

}
