package week5.assignment.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

// create Testcase: 1
public class SalesforceId extends ProjectSpecificMethod  {
	@Test
	public  void id()  {
		
		//Enter the Name
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Seenivasan S");
	
	//click on save
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	
	// the result and verify
	WebElement legalname = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
	String name = legalname.getText();
	
	if (name.contains("Seeni")) {
		System.out.println(" Name is successfully verified!!");
		
	} else {
		System.out.println("Not verified");

	}
	}
	

}
