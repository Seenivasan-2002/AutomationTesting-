package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class MyHome extends ProjectSpecificMethod {
	//extend projectspecificmethod
		//give data from properfile by get property method
	
	@When("Click on leads tab")
	public MyLeads leadClick() {
		//click on lead
		getDriver().findElement(By.linkText(prop.getProperty("myhomepage.leads"))).click();

		return new MyLeads();
	}
	@When("Click on account tab")
	public MyAccountPage accountClick() {
		//click on Account
		getDriver().findElement(By.linkText(prop.getProperty("myhomepage.accounts"))).click();

		return new MyAccountPage();
	}
	
}
