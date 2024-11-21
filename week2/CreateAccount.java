package assignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		//Initialize the WebDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Mximize the window
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter a username and password
																			
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click the "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("SREENIVAASANN S");
		
		//Enter a description as "Selenium Automation Tester." 
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//Enter a Number Of Employees.
		driver.findElement(By.id("numberEmployees")).sendKeys("12");
		
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		
	     //Verify that the Title is displayed correctly.
		String title = driver.getTitle();
		  System.out.println(title);
		 if (title.contains("Create")) {
		  System.out.println("Title is printed");
			
		}else { System.out.println("Title is not printed");}
		//Close the browser window.
		driver.close();
		
																		
		
		
		

	}

}
