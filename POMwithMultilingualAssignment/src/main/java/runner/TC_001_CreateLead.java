package runner;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Login;

public class TC_001_CreateLead extends ProjectSpecificMethod{

	@Test
	public void runCreateLead() {
		//create a object for the starting class
		Login cr = new Login();
		cr.userName()
		.passWord()
		.clickOnLogin()
		.clickOnCrmsfa()
		.leadClick()
		.clickCreate()
		.companyName()
		.firstName()
		.lastName()
		.submit();
	}
}
