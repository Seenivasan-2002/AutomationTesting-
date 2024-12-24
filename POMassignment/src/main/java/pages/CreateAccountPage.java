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
	
	public CreateAccountPage accountName() {
		//Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("Tester2");
		return this;
		//return this to return with in page
	}
	public CreateAccountPage description() {
		//Enter a description as "Selenium Automation Tester." 
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
	    return this;
	}
	public CreateAccountPage siteName() {
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("testLeaf");
		return this;
	}
	public CreateAccountPage countOfEmployees() {
		//Enter a Number Of Employees.
		driver.findElement(By.id("numberEmployees")).sendKeys("12");
		return this;
	}
	public ViewAccountPage createAccountButton() {
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage(driver);
		//return new to return to ViewAccountPage page
	}
	
	
	
	
	
	
	
}
