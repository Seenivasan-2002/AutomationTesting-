package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;



public class ProjectSpecificMethod  {

	//declare the driver as global
	public ChromeDriver driver;

	@BeforeMethod
	public void preCondition() {
		//Initialize the WebDriver
			 driver = new ChromeDriver();
				
				//Mximize the window
				driver.manage().window().maximize();
				
				//Load the URL
				driver.get("http://leaftaps.com/opentaps/.");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod			
	public void postCondition() {
		//close the window
		driver.close();
	}
	
	
				
				
}
	
	
