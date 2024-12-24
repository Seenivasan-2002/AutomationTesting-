package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

//Every page should extend with ProjectSpecificMethod
public class MyHomePage extends ProjectSpecificMethod {
	
	//Chrome Constructor installation
	public MyHomePage ( ChromeDriver driver) {
		this.driver=driver;
	}
	public MyAccountPage accountClick() {
		//click on accounts tab
		driver.findElement(By.linkText("Accounts")).click();

		return new MyAccountPage(driver);
	}
}
