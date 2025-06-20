 package marathan.week2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tatacliqq {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--disable-notifications");
		ChromeDriver  driver = new ChromeDriver(s);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//1. Load the url 
		driver.get("https://www.tatacliq.com/");

	
	
		//2. MouseHover on 'Brands'
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions act = new Actions(driver);		
		act.moveToElement(brands).perform();		
																			//setTimeout(function(){debugger;},5000);
		//3. MouseHover on 'Watches & Accessories'
		WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		act.moveToElement(watch).perform();
	
		//4. Choose the first option from the 'Featured brands'.
		driver.findElement(By.xpath("//div[text()='Featured brands']/following::div")).click();

		//5. Select sortby: New Arrivals
		WebElement newarrival = driver.findElement(By.xpath("//select[@label='Popularity']"));
		Select sort = new Select(newarrival);
		sort.selectByVisibleText("New Arrivals");

		//6. choose men from catagories filter.
		driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilCheckbox']")).click();
		
		//7. print all price of watches
		List<WebElement> watches = driver.findElements(By.xpath("//div[contains(@class,'ProductDescription__priceHolder')]/h3"));
		System.out.println("Total Count of watches:"+ watches.size());
		
		System.out.println("price list of watches: ");
		Thread.sleep(5000);
		for (int i = 1; i <= watches.size(); i++) {
			System.out.print(i+" ");
			try {
				WebElement watchess = driver.findElement(By.xpath("(//div[contains(@class,'ProductDescription__priceHolder')]/h3)["+i+"]"));
				 System.out.println( watchess.getText());
			} catch (Exception e) {
				WebElement watchess = driver.findElement(By.xpath("(//div[contains(@class,'ProductDescription__priceHolder')]/h3)["+i+"]"));

				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
				wait.until(ExpectedConditions.stalenessOf(watchess)) ;
				}	
			}
		
		//8. click on the first resulting watch.
		WebElement price = driver.findElement(By.xpath("(//div[contains(@class,'ProductDescription__priceHolder')]/h3)"));
		String prices = price.getText();
		System.out.println( "Price of first Watch: "+prices);
		WebElement firstele = driver.findElement(By.xpath("//div[contains(@class,'imageAndDescriptionWrapper')]"));
		act.click(firstele).perform();
		
		//9. compare two price are similar
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>Rolex=new ArrayList<String>(windowHandles);
		driver.switchTo().window(Rolex.get(1));
		
		Thread.sleep(5000);
		String finalprice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']")).getText();
		System.out.println("The final price"+finalprice);
		if (finalprice.contains(prices)) {
			System.out.println("The both prices are similar");
		} else {
			System.out.println("The both prices are not similar");
		}
//		10. click Add to cart and get count from the cart icon.
		
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		
		String count = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("Count in the cart icon: "+count);
//		11. Click on the cart
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		
		Thread.sleep(5000);
//		12. Take a snap of the resulting page. 
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File store = new File("./snapShot/watch.png");
		FileUtils.copyFile(screenshot, store);
		
//		13. Close All the opened windows one by one.
		driver.close();
		driver.switchTo().window(Rolex.get(0));
		driver.close();
		
	}

}
