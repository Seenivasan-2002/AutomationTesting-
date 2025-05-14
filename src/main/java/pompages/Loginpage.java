package pompages;

import base.Baseclass;

public class Loginpage extends Baseclass {

	public Loginpage launchlogin() {
		startApp(property.getProperty("logurl"));
		
		return this;	
	}
	
	public Loginpage userid(){
		type(locateElement(locators.ID, "txtEmailId"), property.getProperty("userid"));
		
		return this;
	}
	
	public Loginpage password() {
		type(locateElement(locators.ID, "txtPassword"), property.getProperty("password"));
		
		return this;
	}
	public Dashboardpage submitbutton() {
		click(locateElement(locators.ID, "btnLogIn"));
		
		return new Dashboardpage();
	}
	
	
}
