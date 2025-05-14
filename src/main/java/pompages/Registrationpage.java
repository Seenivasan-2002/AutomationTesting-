package pompages;

import base.Baseclass;

public class Registrationpage extends Baseclass {

	public Registrationpage launchRegister() {
		startApp(property.getProperty("rgurl"));
		reportStep("Successfully navigated to registration page", "pass");
		return this;
	}
	
	public Registrationpage Name() {
		type(locateElement(locators.ID, "txtName"),property.getProperty("username") );
		reportStep("Name entered successfully", "pass");
		return this;
	}
	public Registrationpage emailId() {
		type(locateElement(locators.ID, "txtEmail"), property.getProperty("emailid"));
		reportStep("Email id entered successfully","pass");
		return this;
	}
	public Registrationpage password() {
		type(locateElement(locators.ID, "txtPassword"), property.getProperty("password"));
		reportStep("Password entered successfully", "pass");
		return this;
	}
	public Registrationpage phoneNumber() {
		type(locateElement(locators.ID, "txt_mobile"), property.getProperty("phonenumber"));
		reportStep("phonenumber entered successfully", "pass");
		return this;
	}
	public Registrationpage checkBox() {
		switchToFrameUsingXPath("//iframe[@title='reCAPTCHA']");
		click(locateElement(locators.CLASS_NAME,"recaptcha-checkbox-border"));
		try {Thread.sleep(30000);} catch (Exception e) {}
		switchtodefaultContent();
		reportStep("Checkbox successfully clicked", "pass");
		return this;
	}
	public Registrationpage Terms() {
		click(locateElement(locators.ID,"checkbox-signup"));
		reportStep("Terms and Conditions box successfully clicked", "pass");
		return this;
	}
	public Registrationpage submit() {
		click(locateElement(locators.ID,"btnSignUp"));
		reportStep("Submit button clicked", "pass");
		
		
		return this;
	}
	
	public Registrationpage sweetalert() {
		click(locateElement(locators.CLASS_NAME, "confirm"));
		reportStep("Sweet alert handled", "pass");
		return this;
	}
	 public Registrationpage Verifyregistration() {
		try {	Thread.sleep(30000);
		} catch (Exception e) {reportStep(e.getMessage(), "fail");}
		
		if (gettitle().equalsIgnoreCase("Free Trial calley")) {
			reportStep("registration verified", "pass");
		} else {
			reportStep("registration not verified", "failed");
		}
		return this;
	 }
	
	public void plan(){
		click(locateElement(locators.NAME, "btnskiptodashboard"));
		reportStep("plan choosed successfully", "pass");
		
	}
}
