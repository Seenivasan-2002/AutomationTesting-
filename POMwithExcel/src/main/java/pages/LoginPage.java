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
		//enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		return this;
	}
	public LoginPage passWord() {
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public WelcomePage loginButton() {
		//click on loginbutton
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	
}
