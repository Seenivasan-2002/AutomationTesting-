package assignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		//Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver =new ChromeDriver();
		
		//Load the URL https://leafground.com/button.xhtml . 
		driver.get("https://leafground.com/button.xhtml");
		
		//Maximize the browser window.
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on the button with the text ‘Click and Confirm title.’ 
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
	
		//- Verify that the title of the page is ‘dashboard.’ 
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Dashboard")) {
			System.out.println("Title is verified");
		}else {
			System.out.println("Title is not verified");
		}
		
		driver.navigate().back();
		//- Check if the button with the text ‘Confirm if the button is disabled’ is disabled. 
		WebElement ability = driver.findElement(By.xpath("(//div[@class='card']/button)[2]"));
		     boolean enabled = ability.isEnabled();
		if (enabled) {
			System.out.println("Button is enabled");
		}else {
			System.out.println("Button is disabled");
		}
		
		//- Find and print the position of the button with the text ‘Submit.’ 
		
		WebElement position = driver.findElement(By.xpath("//h5[contains(text(),'Submit')]/following::button"));
	
		System.out.println("The position of the Submit Button (X,Y): "+position.getLocation());
		
		//- Find and print the background color of the button with the text ‘Find the Save button color.’
		
		WebElement color = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]"));
				
		 System.out.println("Backround color of the button : "+color.getCssValue("background-color"));
		 
		//- Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		WebElement hw = driver.findElement(By.xpath("//h5[contains(text(),'height')]/following::button"));
				
		System.out.print("the height of  the button "+ hw.getCssValue("height"));
		System.out.println("    the width of  the button "+ hw.getCssValue("width"));
		System.out.println( "Button's  width and hight  is "+hw.getSize());
		// - Close the browser window.
		//driver.close();
		
	}

}
