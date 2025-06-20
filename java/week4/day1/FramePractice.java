package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class FramePractice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement text = driver.findElement(By.xpath("//p[contains(text(),'OK')]"));
		text.isDisplayed();
	}

}
