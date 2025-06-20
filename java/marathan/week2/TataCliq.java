package marathan.week2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions s =new ChromeOptions();
		s.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(s);
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		    1. Load the url 
		
		driver.get("https://www.tatacliq.com/");

//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		
		
//			2. MouseHover on 'Brands'
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions act = new Actions(driver);		
		act.moveToElement(brands).perform();		
																				//setTimeout(function(){debugger;},5000);
//			3. MouseHover on 'Watches & Accessories'
		WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		act.moveToElement(watch).perform();
		
//			4. Choose the first option from the 'Featured brands'.
			driver.findElement(By.xpath("//div[text()='Featured brands']/following::div")).click();

			//			5. Select sortby: New Arrivals
			WebElement newarrival = driver.findElement(By.xpath("//select[@label='Popularity']"));
			Select sort = new Select(newarrival);
			sort.selectByVisibleText("New Arrivals");

			//			6. choose men from catagories filter.
			driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilCheckbox']")).click();

			List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
	        System.out.println("Number of Prices Retrieved: " + priceElements.size());

	        List<Integer> prices = new ArrayList<>();
	        for (WebElement priceElement : priceElements) {
	            String priceText = priceElement.getText().replaceAll("[^0-9]", ""); // Remove currency and non-numeric characters
	            if (!priceText.isEmpty()) {
	                prices.add(Integer.parseInt(priceText));
	            }
	        }

	        // Print retrieved prices
	        System.out.println("Prices: " + prices);

	        // Verify if the prices are sorted from low to high
	        List<Integer> sortedPrices = new ArrayList<>(prices);
	        Collections.sort(sortedPrices);

	        if (prices.equals(sortedPrices)) {
	            System.out.println("The prices are sorted correctly (Low to High).");
	        } else {
	            System.out.println("The prices are NOT sorted correctly.");
	        }
//			//			7. print all price of watches
//			List<WebElement> watches = driver.findElements(By.xpath("//div[contains(@class,'ProductDescription__priceHolder')]/h3"));
//			for (int i = 1; i < watches.size(); i++) {
////				 driver.findElement(By.xpath("(//div[contains(@class,'ProductDescription__priceHolder')]/h3)["+i+"]"));
//				System.out.println( watches.get(i).getText());				
//		}
//			
			
//			8. click on the first resulting watch.
//		WebElement watch1 = driver.findElement(By.xpath("//div[contains(@class,'ProductDescription__priceHolder')]/h3"));
//		String wat1 = watch1.getText();
//		System.out.println(wat1);
//		watch1.click();
			
////			9. Handle Alert Pop Up <dependency>
//	    <groupId>io.github.sukgu</groupId>
//	    <artifactId>automation</artifactId>
//	    <version>0.1.4.1</version>
//	</dependency>
		
//			9. compare two price are similar
		
//			10. click Add to cart and get count from the cart icon.
		
//			11. Click on the cart
		
//			12. Take a snap of the resulting page. 
		
//			13. Close All the opened windows one by one.
	
	}

}
