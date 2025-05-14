package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.classfile.CodeBuilder.CatchBuilder;
import java.lang.classfile.instruction.SwitchCase;
import java.lang.runtime.SwitchBootstraps;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Baseclass {
	private static final ThreadLocal <RemoteWebDriver>driver= new ThreadLocal<RemoteWebDriver>();
	
	public void setDriver() {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver.set(new ChromeDriver(opt));
	}
	public RemoteWebDriver getDriver() {
		return driver.get();
	}
	
	
	
	public static ExtentReports reports;
	public static ExtentTest test;
	public String testName,testDescription,author,category;
	public static Properties property;
	public static FileInputStream file; 
	public static Actions act;
	
	
	
	
	@BeforeSuite
	public void startReport() {
		
		//ExtentHtmlReporter report = new ExtentHtmlReporter("./reports/Registrationtest.html");
		ExtentHtmlReporter report = new ExtentHtmlReporter("./reports/Fullsetuptest.html");
		reports = new ExtentReports();
		reports.attachReporter(report);
	}
	
	
	@BeforeClass
	public void testDetails() {
		test=reports.createTest(testName, testDescription);
		test.assignAuthor(author);
		test.assignCategory(category);
	}
	
	public void reportStep(String testdetails,String status)     {
		if (status.equalsIgnoreCase("pass")) {
			try {
				test.pass(testdetails, MediaEntityBuilder.createScreenCaptureFromPath(".././snapshot"+takeSnap()+".png").build());
			} catch (IOException e) {	
				reportStep("pass but can't took pic", "fail");
			}
		} else {
			try {
				test.fail(testdetails, MediaEntityBuilder.createScreenCaptureFromPath(".././snapshot"+takeSnap()+".png").build());
			} catch (IOException e) {		
				reportStep("report step error", "fail");
			}
		}
	}
	
	public double takeSnap() {
		double randomnum = Math.random()*99999;
		File source =getDriver().getScreenshotAs(OutputType.FILE) ;
		File destination= new File("./snapshot/takesnap"+randomnum+".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {	
			reportStep("cannot took snap", "fail");
		}
		return randomnum;
	}
	
	@BeforeMethod
	public void properties()     {
		
		try {
			file = new FileInputStream("src/main/resources/data.properties");
		} catch (FileNotFoundException e) {
			reportStep("property file path error", "fail");
		}
		 property = new Properties();
		try {
			property.load(file);
		} catch (IOException e) {	
			reportStep("Error in loading stage", "fail");
		}
	
	
	
	}
	
	
	
	@AfterMethod
	public void postCondition() {
		try {
		//	getDriver().close();
		} catch (Exception e) {
			reportStep("error in close", "fail");
		}
	}
	
	
	
	@AfterSuite
	public void closeReport() {
		reports.flush();
	}
	
	
	public void startApp(String url) {
		try {
			
			setDriver();
			
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			getDriver().get(url);
			
		} catch (Exception e) {
		reportStep(e.getMessage(), "fail");
		}
	}
	
	
	public void type(WebElement ele,String value) {
		try {
			ele.sendKeys(value);
			
		} catch (Exception e) {
			reportStep(e.getMessage(),"fail" );
		}
	}
	
	public void click(WebElement ele) {
		try {
			ele.click();
		} catch ( ElementClickInterceptedException e) { 
			getDriver().executeScript("arguments[0].click()", ele);}
	    catch(Exception e){
	    	reportStep(e.getMessage(), "fail");
	    }
	}
	
	
	public void switchToFrame(String idOrName) {
		try {
			getDriver().switchTo().frame(idOrName);
		} catch (Exception e) {
			reportStep(e.getMessage(), "fail");
		}
	}
	
	public void switchToFrameUsingXPath(String xpath) {
		try {
			getDriver().switchTo().frame(locateElement(locators.XPATH, xpath));
		} catch (Exception e) {
			reportStep(e.getMessage(), "fail");}
		}

	
	public void switchtodefaultContent() {
		try {
			getDriver().switchTo().defaultContent();
			} catch (Exception e) {
			reportStep(e.getMessage(), "fail");
		}
	}
	public String gettitle() {
		String title ="";
		try {
			 title = getDriver().getTitle();
		} catch (Exception e) {
			reportStep(e.getMessage(), "fail");
		}
		return title;
	}
	
	public void upload(WebElement ele, String path) {
		try {
			ele.sendKeys(path);
			
		} catch (Exception e) {
			reportStep(e.getMessage(), "fail");
		}
	}
	
	public void select(WebElement ele,String valueortext) {
		Select sel = new Select(ele);
		try {
			
			sel.selectByVisibleText(valueortext);
		
		} catch (NoSuchElementException e) {
			sel.selectByValue(valueortext);
		}catch (Exception e) {
			reportStep(e.getMessage(), "fail");
		}
	}
	

	public void movetoElement(WebElement ele) {
		try {
			 act = new Actions(getDriver());
			 act.moveToElement(ele).perform();
			
		} catch (Exception e) {
			reportStep("Not able to mouse hover"+e.getMessage(), "fail");
		}
	}
	public enum locators{
		ID, XPATH, CLASS_NAME, NAME, CSS,LINK_TEXT, PARTIAL_LINKTEXT,TAGNAME
	}

	public WebElement locateElement(locators locatortype,String value){
		try {
			switch (locatortype) {
			case ID :
				return getDriver().findElement(By.id(value));
			case NAME:
				return getDriver().findElement(By.name(value));
			case CLASS_NAME:
				return getDriver().findElement(By.className(value));
			case LINK_TEXT:
				return getDriver().findElement(By.linkText(value));
			case PARTIAL_LINKTEXT:
				return getDriver().findElement(By.partialLinkText(value));
			case TAGNAME:
				return getDriver().findElement(By.tagName(value));
			case XPATH:
				return getDriver().findElement(By.xpath(value));
			case CSS:
				return getDriver().findElement(By.cssSelector(value));
			default:
				System.err.println("locator is not valid");
				break;
			}
		} catch (Exception e) {
			reportStep(e.getMessage(), "fail");
		}
		return null;
	}
}
	
	
	

