package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethod{
	
	//extend projectspecificmethod
	
		//give data from properfile by get property method
	@When("Enter the CompanyName")
	public CreateLead companyName() {
		//enter the companyName
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(prop.getProperty("createlead.company"));
		return this;
	}
	@When("Enter the FirstName")
	public CreateLead firstName() {
		//enter the first name
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(prop.getProperty("createlead.fname"));
		return this;
	}
	@When("Enter the LastName")
	public CreateLead lastName() {
		//enter the last name
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(prop.getProperty("createlead.lname"));
		return this;
	}
	@Then("Click on leadSubmitButton")
	public CreateLead submit() {
		//click on submit button
		getDriver().findElement(By.name("submitButton")).click();
		return this;
	}
	
}
