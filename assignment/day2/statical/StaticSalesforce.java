package week5.assignment.day2.statical;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StaticSalesforce {
		
	
	
	//Add @Parameter annotation in the Java class on top of the method that needs to receive parameter data.
	@Parameters({"url","un","pwd"})

	@Test
	public  void Sales(String link , String Username,String Password) {
		ChromeOptions notice = new ChromeOptions();
		notice.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(notice);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//Login to https://login.salesforce.com
	///Replace hardcoded values in the required test steps with the parameterized values.
		driver.get(link);
	
	driver.findElement(By.id("username")).sendKeys(Username);
	driver.findElement(By.id("password")).sendKeys(Password);
	driver.findElement(By.id("Login")).click();
	
	
	//Click on the toggle menu button from the left corner
	
	driver.findElement(By.xpath("//button[contains(@class,'slds-context-bar__button')]")).click();
	
	//Click View All
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	
	//click Legal Entities from App Launcher
	driver.findElement(By.xpath("(//input [@ role='combobox'])[2]")).sendKeys("Legal Entities");
	driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
	
	//Click on New Legal Entity
	driver.findElement(By.xpath("//div[text()='New']")).click();

	//Enter the Company name as 'TestLeaf'.
	driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
	
	//Enter Description as 'Salesforces'.
	driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
	
	//Select Status as 'Active'
	WebElement status = driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__i')]"));

	Actions act = new Actions(driver);
	act.scrollToElement(status);
	driver.executeScript("arguments[0].click();", status);
	
	driver.findElement(By.xpath("//span[text()='Active']")).click();
	
	//Click on Save
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	
	//verify the alert message
	
	WebElement verify = driver.findElement(By.xpath("//div[@class='fieldLevelErrors']"));
	String text = verify.getText();
	System.out.println("Alert msg : "+text);
	
	if(text.contains("Legal Entity Name")) {
		System.out.println("Alert msg was verified successfully!!");
	}else {
		System.out.println("alert not verified");
	}
	
	//Close the window
	driver.close();
	}
	
	


	

}
