package assignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHomeassignment {

	public static void main(String[] args) throws InterruptedException {
		   //Initialize the WebDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Mximize the window
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//Click on the Create new account button. 
		driver.findElement(By.linkText("Create new account")).click();
		//- Enter the First name. 
		driver.findElement(By.name("firstname")).sendKeys("SUBA ");
		//- Enter the Surname. 
		driver.findElement(By.name("lastname")).sendKeys("SHREE");
		//- Enter the Mobile number or email address. 
		driver.findElement(By.name("reg_email__")).sendKeys("mayicomein1212@gmail.com");
		//- Enter the New password. 
		driver.findElement(By.name("reg_passwd__")).sendKeys("Tester@1212");
		//- Handle all three dropdowns in Date of birth 
		WebElement element = driver.findElement(By.id("day"));
		Select opt1 = new Select(element);
		opt1.selectByVisibleText("5");
		
		WebElement element1 = driver.findElement(By.id("month"));
		Select opt2 = new Select(element1);
		opt2.selectByVisibleText("Aug");
		
		WebElement element2 = driver.findElement(By.id("year"));
		Select opt3 = new Select(element2);
		opt3.selectByVisibleText("2007");
		//- Select the radio button in Gender.
		driver.findElement(By.id("sex")).click();
		
	}

}
