
package week5.assignment.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//Create a Java class named ProjectSpecificMethod
public class ProjectSpecificMethod {

	public ChromeDriver driver;
	
	//Add common start codes in @Before
	@BeforeMethod
	public void preCondition() {
		
		// add Chromeoptions for disable notifications 
		ChromeOptions notice = new ChromeOptions();
		notice.addArguments("--disable-notifications");
	 driver = new ChromeDriver(notice);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//Login to https://login.salesforce.com
	driver.get("https://login.salesforce.com");
	driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
	driver.findElement(By.id("password")).sendKeys("leaf@2024");
	driver.findElement(By.id("Login")).click();
	
	//- Click on the toggle menu button from the left corner
	driver.findElement(By.xpath("//button[contains(@class,'slds-context-bar__button')]")).click();
	
	
	//Click View All
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	
	//click Legal Entities from App Launcher
	driver.findElement(By.xpath("(//input [@ role='combobox'])[2]")).sendKeys("Legal Entities");
	driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
	
	//click Legal Entities from App Launcher
	driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	
	@AfterMethod
	public void postCondition() {
		//close the window
		driver.close();
	}
	
	
	
	
	
}
