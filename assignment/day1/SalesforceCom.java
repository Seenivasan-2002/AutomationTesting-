package week5.assignment.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//Testcase2 
public class SalesforceCom extends ProjectSpecificMethod {

	@Test
	public  void Company() {

		
	// Enter the company name as "Test Leaf"
	driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
	
	//Enter the Description
	driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
	
	//Select Status as 'Active'
	WebElement status = driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__i')]"));

	Actions act = new Actions(driver);
	act.scrollToElement(status);
	driver.executeScript("arguments[0].click();", status);
	
	driver.findElement(By.xpath("//span[text()='Active']")).click();
	
	
	//Click on Save
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	
	//Verify the Alert message
	WebElement verify = driver.findElement(By.xpath("//div[@class='fieldLevelErrors']"));
	String text = verify.getText();
	System.out.println("Alert msg : "+text);
	
	if(text.contains("Legal Entity Name")) {
		System.out.println("Alert msg was verified successfully!!");
	}else {
		System.out.println("alert not verified");
	}
	
	
		
	}

}
