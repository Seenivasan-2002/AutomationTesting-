package marathan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PvrTest {

	public static void main(String[] args)  {

       ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("cinemas-inactive")).click();
		
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Virugambakkam')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Tomorro')]")).click();
		
		driver.findElement(By.xpath("(//span[text()='ZEBRA'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='03:15 PM']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		driver.findElement(By.xpath("(//span[text()='7'])[2]")).click();
		//button[text()='Proceed']
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		String ticketinfo = driver.findElement(By.xpath("//div[@class='seat-info']")).getText();
	     System.out.println(ticketinfo);
	     
	     String price = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
		System.out.println(price);
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		String title = driver.getTitle();
		System.out.println("Your Current Page title :"+ title);
		
		driver.close();
	}

}
