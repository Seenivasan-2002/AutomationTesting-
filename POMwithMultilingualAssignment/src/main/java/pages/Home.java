package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home extends ProjectSpecificMethod {
	//extend projectspecificmethod
	
	@When("Click on crmsfa")
	public MyHome clickOnCrmsfa(){
		// click on crmsfa
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHome();
		}
	public Login clickLogout() {
		//click on logout
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new Login();
	}
}
