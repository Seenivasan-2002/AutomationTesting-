package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountPage extends ProjectSpecificMethod {
	//extend projectspecificmethod
	//give data from properfile by get property method
	
	@When("Enter the AccountName")
	public CreateAccountPage accountName() {
		//Enter an account name.
		getDriver().findElement(By.id("accountName")).sendKeys(prop.getProperty("createaccount.name"));
		return this;
	}
	@When("Enter the description")
	public CreateAccountPage description() {
		//Enter a description as "Selenium Automation Tester." 
		getDriver().findElement(By.name("description")).sendKeys(prop.getProperty("createaccount.description"));
	    return this;
	}
	@When("Enter the site name")
	public CreateAccountPage siteName() {
		//Enter a Site Name as “LeafTaps”
		getDriver().findElement(By.id("officeSiteName")).sendKeys(prop.getProperty("createaccount.sitename"));
		return this;
	}
	@When("Enter the Count of employee")
	public CreateAccountPage countOfEmployees() {
		//Enter a Number Of Employees.
		getDriver().findElement(By.id("numberEmployees")).sendKeys(prop.getProperty("createaccount.count"));
		return this;
	}
	@Then("Click on AccountSubmitButton")
	public CreateAccountPage createAccountButton() {
		//Click the "Create Account" button.
		getDriver().findElement(By.className("smallSubmit")).click();
		return this;
	}
	
	
	
	
	
	
	
}
