package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass;
import pompages.Registrationpage;




public class Registrationtest extends Baseclass {

	
	@BeforeTest
	public void testdetails() {
		testName="RegisterTest";
		testDescription="Check registration";
		author="Seenivasan";
		category="smoke";
	}
	
	@Test
	public void Register() {
		Registrationpage reg = new Registrationpage();
		reg.launchRegister()
		.Name()
		.emailId()
		.password()
		.phoneNumber()
		.checkBox()
		.Terms()
		.submit()
		.sweetalert()
		.Verifyregistration()
		.plan();
	}
}
