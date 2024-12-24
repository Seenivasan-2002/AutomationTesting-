package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

//Every page should extend with ProjectSpecificMethod
public class WelcomePage extends ProjectSpecificMethod{

	//Chrome Constructor installation
	public WelcomePage (ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyHomePage clickOnCrmsfa() {
		//click on CRMSFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
				
	}
	
	public LoginPage logoutButton() {
		//Click on logout button
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}
	
}
