package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;


public class ProjectSpecificMethod extends AbstractTestNGCucumberTests {

	//Add thread local for driver
	private static final ThreadLocal<RemoteWebDriver>sDriver = new ThreadLocal<RemoteWebDriver>();
	
	
	// use the setter and getter method to use driver from private method to global
	public void setDriver() {
		sDriver.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver() {
	return	sDriver.get();
	}
	
	public static Properties prop;
	
	@BeforeMethod
	public void preCondition() throws IOException{
		
		//Path for ** English** 
		
		
		//FileInputStream prc = new FileInputStream("src/main/resources/LeafTaps.Eng.Properties");
		
		
		
		
		//path for**spanish(spain)**
		FileInputStream prc = new FileInputStream("src/main/resources/LeafTaps.Spn.Properties");

		//intiatiate the property class
		 prop= new Properties();
		
		 //to connect properties and path
		 prop.load(prc);
		 
	
		 //set driver and get driver to chrome intialiazation
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod
	public void postCondition(){
		getDriver().close();

		
	}
	
}
