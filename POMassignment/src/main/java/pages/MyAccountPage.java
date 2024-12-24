package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

//Every page should extend with ProjectSpecificMethod
public class MyAccountPage extends ProjectSpecificMethod{

	//Chrome Constructor installation
	public MyAccountPage (ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateAccountPage clickOnCreate() {
		//click on create account
		driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage(driver);
		//return to CreateAccountPage
	}
}
