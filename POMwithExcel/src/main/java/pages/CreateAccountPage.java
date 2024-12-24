package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

//Every page should extend with ProjectSpecificMethod
public class CreateAccountPage extends ProjectSpecificMethod {
	
	//Chrome Constructor installation
	public CreateAccountPage (ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateAccountPage accountName(String AccName) {
		//Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys(AccName);
		return this;
	}
	public CreateAccountPage description(String descript) {
		//Enter a description as "Selenium Automation Tester." 
	    driver.findElement(By.name("description")).sendKeys(descript);
	    return this;
	}
	public CreateAccountPage siteName(String site) {
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys(site);
		return this;
	}
	public CreateAccountPage countOfEmployees(String count) {
		//Enter a Number Of Employees.
		driver.findElement(By.id("numberEmployees")).sendKeys(count);
		return this;
	}
	public ViewAccountPage createAccountButton() {
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage(driver);
		//return new to return to ViewAccountPage page
	}
	
	
	
	
	
	
	
}
