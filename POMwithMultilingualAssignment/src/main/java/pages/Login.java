package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class Login  extends ProjectSpecificMethod {
	
	//extend projectspecificmethod
		//give data from properfile by get property method
	
	@When("Enter the username")
	public Login  userName() {
		// enter the username
		getDriver().findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		return this;
	}
	 
	@When("Enter the password")
	public Login passWord() {
		//enter the password
		getDriver().findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		return this;
	}
	
	@When("Click on LoginButton")
	public Home clickOnLogin(){
		//click on login button
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new Home();
	}
}
