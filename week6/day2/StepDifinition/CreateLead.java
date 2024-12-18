package day2.StepDifinition;

import org.openqa.selenium.By;

import day2.HooksBase.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethod {

	//Use annotations such as @Given, @When, and @Then
	
	@When("Click on create lead")
	public void click_on_create_lead() {
		// click createlead
		driver.findElement(By.linkText("Create Lead")).click();
    
	}

	@When("Enter the companyname as {string}")
	public void enter_the_companyname_as(String company) {
		//enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);

		
	}

	@When("Enter the firstname as {string}")
	public void enter_the_firstname_as(String fname) {
		// enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

	}

	@When("Enter the Lastname as {string}")
	public void enter_the_lastname_as(String lname) {
		//enter the lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);

	}

	@When("Click on submit button")
	public void click_on_submit_button() {
		//enter the submit buttom
		driver.findElement(By.name("submitButton")).click();

	}
}
