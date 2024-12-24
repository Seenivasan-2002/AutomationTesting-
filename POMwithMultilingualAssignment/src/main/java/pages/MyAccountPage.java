package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class MyAccountPage extends ProjectSpecificMethod{

	//extend projectspecificmethod
		//give data from properfile by get property method
	@When("Click on Create Account")
	public CreateAccountPage clickOnCreate() {
		//		click on create account
		getDriver().findElement(By.linkText(prop.getProperty("myaccount.create"))).click();
		return new CreateAccountPage();
	}
}
