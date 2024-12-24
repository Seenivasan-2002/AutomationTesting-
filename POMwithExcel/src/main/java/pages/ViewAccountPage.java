package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

//Every page should extend with ProjectSpecificMethod
public class ViewAccountPage extends ProjectSpecificMethod {
	//Chrome Constructor installation
	public ViewAccountPage (ChromeDriver driver) {
		this.driver=driver;
	}
	public ViewAccountPage verifyName() {
		//name verification
		String Name = driver.findElement(By.xpath("//table[@class='fourColumnForm']//td[2]/span")).getText();
		System.out.println("Name and Id: "+Name);
		return this;
	}

}
