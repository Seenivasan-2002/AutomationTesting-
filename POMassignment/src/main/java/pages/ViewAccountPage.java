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
	
	public ViewAccountPage verifyTittle() {
		//title verification
		String title = driver.getTitle();
		  System.out.println(title);
		 if (title.contains("Create")) {
		  System.out.println("Title is printed");
			
		}else { 
			System.out.println("Title is not printed");
		}
		 return this;
	}

}
