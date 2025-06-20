package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	public static void main(String[] args) {
		// Handle notifications 
				ChromeOptions s =new ChromeOptions();
				s.addArguments("--disable-notifications");
		
		//- Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver(s);
		
		//- Load the URL 
		driver.get("https://www.irctc.co.in/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click on the "FLIGHTS" link.
		WebElement flight = driver.findElement(By.xpath("(//label[text()='FLIGHTS'])[2]"));
				
		Actions action = new Actions(driver);
		action.scrollToElement(flight).perform();
		
		flight.click();
		
		//windowhandles
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String>Flight = new ArrayList<String>(windowHandles);
		
		//Switch to child class
		driver.switchTo().window(Flight.get(1));
		
		//Capture the title of the new window
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		
		//Close the parent tab
		driver.switchTo().window(Flight.get(0));
		
		driver.close();
		
		
		
		
	}

}
