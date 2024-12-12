package week5.assignment.day2.dinamic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.assignment.day1.ProjectSpecificMethod;

public class DynamicSales extends ProjectSpecificMethod {

	//Set the dataProvider attribute with the value as the DataProvider method name.
	@DataProvider(name="getName")
	public  String[][] Names() throws IOException {
		
	//	Add a return statement to supply data to the test case.
		return NameData.readValue();
		
	}
	//data provider in test arguments
	@Test(dataProvider="getName")
	public  void Company(String name) {

		//Enter Name //name replaced by hardcore
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		
		//Click save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		//verify Legal Entity Name
		WebElement legalname = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
		String fullname = legalname.getText();
		
		if (fullname.contains(name)) {
			System.out.println(" Name is successfully verified!!");
			
		} else {
			System.out.println("Not verified");

		}	
	
	
		
	}

	
	
}
