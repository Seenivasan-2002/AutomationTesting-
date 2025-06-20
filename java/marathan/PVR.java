package marathan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVR {

	public static void main(String[] args) {

		 ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.pvrcinemas.com/");
		
		//Choose Your location as "Chennai" (sometimes it will be located automatically)
		//4) Click on Cinema under Quick Book
		
		//5) Select Your Cinema
		//driver.findElement(By.linkText("Select Cinema")).click();
		
				//cinema.selectByVisibleText("INOX National,Virugambakkam Chennai");
		//6) Select Your Date as Tomorrow
		//7) Select Your Movie
		//8) Select Your Show Time
		//9) Click on Book Button
		//10) Click Accept on Term and Condition
		//11) Click any one available seat
		//12) Click Proceed Button
		//13) Print the Seat info under book summary
		//14) Print the grand total under book summary
		//15) Click Proceed Button
		//16) Close the popup
		//17) Print Your Current Page title
		//18) Close Browser
	}

}
