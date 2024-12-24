package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

//Every page should extend with ProjectSpecificMethod
public class LoginPage extends ProjectSpecificMethod{
	
	//Chrome Constructor installation
	public LoginPage (ChromeDriver driver) {
		this.driver=driver;
	}

	public LoginPage userName() {
		//Enter UserName
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		return this;
	}
	public LoginPage passWord() {
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public WelcomePage loginButton() {
		//Click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	
}
