package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
        ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int everylinks = links.size();
		
		System.out.println("total links in the website : "+ everylinks);
		
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
		
	}

}
