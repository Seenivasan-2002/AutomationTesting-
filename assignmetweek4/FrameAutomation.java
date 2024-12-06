package assignmetweek4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAutomation {

	public static void main(String[] args) {
		//- Initialize ChromeDriver 
		ChromeDriver driver = new ChromeDriver();
		
		//- Load the URL 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt ");
		
		//- Maximize the browser window 
		driver.manage().window().maximize();
		
		//- Switch to the frame 
		driver.switchTo().frame("iframeResult");
		
		//- Add an implicit wait to ensure the webpage elements are fully loaded 
		driver.manage().window().maximize();
		
		//- Click the "Try It" button inside the frame 
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//- Click OK/Cancel in the alert that appears 
		 Alert alert = driver.switchTo().alert();
		alert.sendKeys("SEENIVASAN");
		alert.accept();
		
		//- Confirm the action is performed correctly by verifying the text displayed
		
		  WebElement text = driver.findElement(By.xpath("//p[contains(text(),'SEENIVASAN')]"));
		  boolean displayed = text.isDisplayed();
		  System.out.println(displayed);
		  
		  //text output
		  WebElement optext = driver.findElement(By.id("demo"));
			String outtext = optext.getText();
			 System.out.println(outtext);
		 
			 driver.close();
		
	}

}
