package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://github.com/Seenivasan-2002/AutomationTesting-");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.close();

	}

}
