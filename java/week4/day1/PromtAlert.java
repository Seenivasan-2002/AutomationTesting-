package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {

	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Seenivasan S");
		alert.accept();
		
		String result = driver.findElement(By.id("confirm_result")).getText();
		
		System.out.println(result);
	
		driver.close();
	}

}
