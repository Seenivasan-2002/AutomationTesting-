package assignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelect {

	public static void main(String[] args) throws InterruptedException {
		        //Initialize the WebDriver
				ChromeDriver driver = new ChromeDriver();
				
				//Mximize the window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Load the URL
				driver.get("http://leaftaps.com/opentaps/.");
				
				//Enter a username and password
																					
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//Click the "Login" button
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Click on the "CRM/SFA" link.
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//Click on the "Accounts" tab.
				driver.findElement(By.linkText("Accounts")).click();
				
				//Click on the "Create Account" button.
				driver.findElement(By.linkText("Create Account")).click();
				
				//Enter an account name.
				driver.findElement(By.id("accountName")).sendKeys("SUBAASHREEE S ");
				
				//Enter a description as "Selenium Automation Tester." 
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
				
				//Select "ComputerSoftware" as the industry.
				WebElement element = driver.findElement(By.name("industryEnumId"));
				Select opt1 = new Select(element);
				opt1.selectByVisibleText("Computer Software");
				
				//Select "S-Corporation" as ownership using SelectByVisibleText.
				WebElement element1 = driver.findElement(By.name("ownershipEnumId"));
				Select opt2 = new Select(element1);
				opt2.selectByVisibleText("S-Corporation");

				//Select "Employee" as the source using SelectByValue. 
				WebElement element2 = driver.findElement(By.id("dataSourceId"));
				Select opt3 = new Select(element2);
				opt3.selectByValue("LEAD_EMPLOYEE");
				
				//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
				WebElement element3 = driver.findElement(By.id("marketingCampaignId"));
				Select opt4 = new Select(element3);
				opt4.selectByIndex(6);
				
				//Select "Texas" as the state/province using SelectByValue.
				WebElement element4 = driver.findElement(By.name("generalStateProvinceGeoId"));
				Select opt5 = new Select(element4);
				opt5.selectByValue("TX");
				
			
				
				//Click the "Create Account" button.
				driver.findElement(By.className("smallSubmit")).click();
				
				
				Thread.sleep(30000);
				//Verify that the account name is displayed correctly.
				  String text = driver.findElement(By.partialLinkText("SUBASHREE")).getText();
				  System.out.println(text);
				  if (text.contains("SUBASHREE")) {System.out.println("Lead is Created");
					
				}else {
					System.out.println("Lead is not created");
				}
				//Close the browser window.
				driver.close();
	}

}
