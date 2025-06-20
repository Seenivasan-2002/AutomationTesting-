	package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Handle notifications 
				ChromeOptions s =new ChromeOptions();
				s.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(s);
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		WebElement menfs = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions obj = new Actions (driver);
		
		obj.moveToElement(menfs).perform();
		
		WebElement Shirts = driver.findElement(By.xpath("//span[text()='Shirts']"));
		
		obj.click(Shirts).perform();
		
		WebElement firstimg = driver.findElement(By.xpath("//img[@class='product-image ']"));
		
		obj.moveToElement(firstimg).perform();
		
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']")).click();

		Thread.sleep(10000);
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		
		File store = new File("./snapshot/shirts.png");
		
		FileUtils.copyFile(screenshot, store);
		
		driver.close();
	}

}
