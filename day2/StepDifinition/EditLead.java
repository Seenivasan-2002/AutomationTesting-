package day2.StepDifinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import day2.HooksBase.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends ProjectSpecificMethod {
	//Use annotations such as @Given, @When, and @Then
	
	
	@When("Click on find lead tab")
	public void click_on_find_lead_tab() {
		//click find leads
		driver.findElement(By.linkText("Find Leads")).click();

	}

	@When("Click on phone option")
	public void click_on_phone_option() {
		//click on phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@When("Enter the phone number as {string}")
	public void enter_the_phone_number_as(String num) {
		//enter the number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(num);
	}

	@When("Click the find lead button")
	public void click_the_find_lead_button() {
		//click the find tab button
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
	}

	@When("Click the first option")
	public void click_the_first_option() throws InterruptedException {
		Thread.sleep(5000);
		//click the first option
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();	
	}

	@When("Click on edit")
	public void click_on_edit() {
		//click on edit
		driver.findElement(By.linkText("Edit")).click();
	}

	@When("Update the Companyname")
	public void update_the_companyname() {
		// clear the exist name and rename
		WebElement update =driver.findElement(By.id("updateLeadForm_companyName"));
        update.clear();
        update.sendKeys("TCS");
	}

	@Then("Click on Submit button")
	public void click_on_submit_button() {
		//click on submit
		driver.findElement(By.name("submitButton")).click();
}

}
