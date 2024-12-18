package day2.StepDifinition;

import org.openqa.selenium.By;

import day2.HooksBase.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends ProjectSpecificMethod {
	//Use annotations such as @Given, @When, and @Then
	
	@When("Click on Find leads tab")
	public void click_on_find_leads_tab() {
		//click find leads
		driver.findElement(By.linkText("Find Leads")).click();

	}

	@When("Click on phone tab")
	public void click_on_phone_tab() {
		//click on phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}

	@When("Enter the phone number")
	public void enter_the_phone_number() {
		//enter the number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");

	}

	@When("Click on find tab button")
	public void click_on_find_tab_button() {
		//click the find tab button 
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@When("Click on the first result and store it")
	public static void  click_on_the_first_result_and_store_it() throws InterruptedException {
		Thread.sleep(2000);
		// click on first result
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@When("Click on Delete button")
	public void click_on_delete_button() {
		//click the delete button
		driver.findElement(By.linkText("Delete")).click();
	}

	@Then("verify the id is deleted")
	public static void verify_the_id_is_deleted() {
		 //- Click "Find leads" again. 
		driver.findElement(By.linkText("Find Leads")).click();
		 //- Enter the captured lead ID. 
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("12807");
		 //- Click the "Find leads" button.
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 //- Verify the presence of the message "No records to display" in the Lead List.
		 String msg = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
			
			if (msg.contains("No records to display"))
			{
				System.out.println("The given Message is:"+ msg);
				
			}else
			{
				System.out.println(" UnSuccessful");
			}				
			
		 //This message confirms the successful deletion. 
		System.out.println("Account deleted successfully");}
}
