package day2.staticsteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	
	//Use annotations such as @Given, @When, and @Then
	public ChromeDriver driver;
	@Given("Load the Url")
	public void load_the_url() {
		//disable the notification
			ChromeOptions notice = new ChromeOptions();
			notice.addArguments("--disable-notifications");
				//load the url
				driver=new ChromeDriver(notice);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://login.salesforce.com");

	}
	@When("Enter the username as {string}")
	public void enter_the_username_as(String UN) {
		//enter the username
		driver.findElement(By.id("username")).sendKeys(UN);
	}
	@When("Enter the password as {string}")
	public void enter_the_password_as(String pwd) {
		//enter the password
		driver.findElement(By.id("password")).sendKeys(pwd);
		//click the login button
		driver.findElement(By.id("Login")).click();

	}
	@When("Click the App Launcher Icon")
	public void click_the_app_launcher_icon() {
		//click the app launcher icon
		driver.findElement(By.xpath("//button[contains(@class,'slds-context-bar__button')]")).click();
		//click view all
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		
	}
	@When("Select Accounts")
	public void select_accounts() {
		// click on accounts
	   WebElement account = driver.findElement(By.xpath("//p[text()='Accounts']"));
	   driver.executeScript("arguments[0].click();", account);
	   
	}
	@When("Search for the account using as {string}")
	public void search_for_the_account_using_as(String name) {
		//enter the unique name
	driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys(name,Keys.ENTER);
	
	}
	@When("select Edit")
	public void select_edit() {
		//click your id
	   WebElement result = driver.findElement(By.linkText("Seenivasan S"));
		driver.executeScript("arguments[0].click();", result);
		
		//click on dropdown
	   WebElement drop = driver.findElement(By.xpath("//span[text()='Show more actions']"));
		driver.executeScript("arguments[0].click();", drop);
		
		//click the edit option
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
	}
	@When("Set Type to Technology Partner")
	public void set_type_to_technology_partner() {
		// set type as technology partner
		WebElement type = driver.findElement(By.xpath("//button[@aria-label='Type']"));
		driver.executeScript("arguments[0].click();", type);

		WebElement tech = driver.findElement(By.xpath("//span[text()='Technology Partner']"));
		driver.executeScript("arguments[0].click();", tech);

	}
	@When("Set Industry to Healthcare")
	public void set_industry_to_healthcare() {
		//Set Industry to Healthcare
		WebElement health = driver.findElement(By.xpath("//button[@aria-label='Industry']"));
		driver.executeScript("arguments[0].click();", health);

		WebElement care = driver.findElement(By.xpath("//span[text()='Healthcare']"));
		driver.executeScript("arguments[0].click();", care);

	}
	@When("Enter the Billing Address {string}")
	public void enter_the_billing_address(String billing) {
		//Enter the Billing Address
	    driver.findElement(By.xpath("//textarea[@autocomplete='street-address']")).sendKeys(billing);
	}
	@When("Enter the Shipping Address {string}")
	public void enter_the_shipping_address(String shipping) {
		//Enter the Shipping Address 
	    driver.findElement(By.xpath("(//textarea[@autocomplete='street-address'])[2]")).sendKeys(shipping);
  
	}
	@When("Set Customer Priority to Low")
	public void set_customer_priority_to_low() {
		//Set Customer Priority to Low
		WebElement priority = driver.findElement(By.xpath("//button[@aria-label='Customer Priority']"));
		driver.executeScript("arguments[0].click();", priority);

		WebElement Low = driver.findElement(By.xpath("//span[text()='Low']"));
		driver.executeScript("arguments[0].click();", Low);

	}
	@When("Set SLA to Silver")
	public void set_sla_to_silver() {
		//Set SLA to Silver
		WebElement sla = driver.findElement(By.xpath("//button[@aria-label='SLA']"));
		driver.executeScript("arguments[0].click();", sla);

		WebElement silver = driver.findElement(By.xpath("//span[text()='Silver']"));
		driver.executeScript("arguments[0].click();", silver);

	}
	@When("Set Active to NO")
	public void set_active_to_no() {
		//Set Active to NO
		WebElement active = driver.findElement(By.xpath("//button[@aria-label='Active']"));
		driver.executeScript("arguments[0].click();",active);

		WebElement no = driver.findElement(By.xpath("//span[text()='No']"));
		driver.executeScript("arguments[0].click();", no);

	}
	@When("Enter a unique number in the Phone field {string}")
	public void enter_a_unique_number_in_the_phone_field(String pno) {
		//Enter a unique number in the Phone field
		driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys(pno);
	}
	@When("Set Upsell Opportunity to No")
	public void set_upsell_opportunity_to_no() {
		//Set Upsell Opportunity to No
		WebElement opp = driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']"));
		driver.executeScript("arguments[0].click();", opp);

		WebElement non = driver.findElement(By.xpath("//span[text()='No']"));
		driver.executeScript("arguments[0].click();", non);

	}
	@When("Click Save")
	public void click_save() {
		//Click Save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	@Then("verify the phone number")
	public void verify_the_phone_number() {
		//verify the phone number
		String msg = driver.findElement(By.xpath("//a[contains(text(),'57173719')]")).getText();	
		System.out.println(msg);	
		
		if (msg.contains("57173719"))
		{
			System.out.println("Phone number Verified");
		}else
		{
			System.out.println("Phone number Not Verified");
		}	
}
}
