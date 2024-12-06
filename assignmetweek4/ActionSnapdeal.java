package assignmetweek4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionSnapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions s =new ChromeOptions();
		s.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(s);
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Launch (https://www.snapdeal.com/)
		
		
		//2. Go to "Men's Fashion".
		WebElement mens = driver.findElement(By.linkText("Men's Fashion"));
		Actions act = new Actions(driver);
		act.moveToElement(mens).perform();
		
		//3. Go to "Sports Shoes" Sports Shoes
		WebElement sports = driver.findElement(By.linkText("Sports Shoes"));
		sports.click();
		
		//. 4. Get the count of sports shoes.
		WebElement countofsp = driver.findElement(By.xpath("//span[contains(@class,'category-count')]"));
		String count = countofsp.getText();
		System.out.println("Count of Sports shoes: "+count);
		
		//5. Click on "Training Shoes".
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//6. Sort the products by "Low to High".
		driver.findElement(By.xpath("//i[contains(@class,'sort-arrow')]")).click();
		
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		//Price Low To High
		
		//7. Check if the displayed items are sorted correctly. 
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		System.out.println("starting of sorted list: ");
		for(int i=0;i<=price.size();i++) {
			
			try {
				System.out.println(price.get(i).getText());
			} catch (Exception e) {
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
				
		}
		
		}
		
		//8. Select any price range ex:(500-700). 
		WebElement start = driver.findElement(By.xpath("//input[@Class='input-filter']"));
		start.clear();
		start.sendKeys("1500");
		WebElement end = driver.findElement(By.xpath("(//input[@Class='input-filter'])[2]"));
		end.clear();
		end.sendKeys("1600");
		driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow')]")).click();

		Thread.sleep(3000);
		//9. Filter by any colour.
		
		driver.findElement(By.xpath("//div[contains(@class,'sdCheckbox filters-list')]")).click();
		

		
		//10. Verify all the applied filters.
		System.out.println("Applied filters :");
			WebElement filter = driver.findElement(By.xpath("(//div[@class='filters']/div)[1]"));
			System.out.println(filter.getText());
		
			WebElement filter2 = driver.findElement(By.xpath("//a[text()=' Black']"));
			System.out.println(filter2.getText());
			
		Thread.sleep(2000);
		//11. Mouse hover on the first resulting "Training Shoes".
		WebElement firstres = driver.findElement(By.xpath("//div[contains(@class,'product-tuple-listing')]"));
		Actions obj = new Actions(driver);
		obj.moveToElement(firstres).perform();
		
		//12. Click the "Quick View" button.
		driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]")).click();
		
		//13. Print the cost and the discount percentage. 
		Thread.sleep(2000);
		
		 WebElement cost = driver.findElement(By.className("payBlkBig"));
		 String realcost = cost.getText();
		 System.out.println("original cost:"+realcost);
		 
		 WebElement percent = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
		 String discount = percent.getText();
		 System.out.println("discount percentage: "+discount);
		 		
		//14. Take a snapshot of the shoes.
		 File screenshot = driver.getScreenshotAs(OutputType.FILE);
		 File str = new File("./snapShot/shoe.png");
		 FileUtils.copyFile(screenshot, str);
		//15. Close the current window. 
		driver.close();
		 
		//16. Close the main window.
		driver.quit();
	}

}
