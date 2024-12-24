package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class MyLeads extends ProjectSpecificMethod {
// extend the ProjectSpecificMethod
	
	
	@When("Click on create lead")
	public CreateLead clickCreate() {
		//click on create lead 
		//give data from properfile by get property method
		getDriver().findElement(By.linkText(prop.getProperty("myleads.create"))).click();
		return new CreateLead();
	}
}
