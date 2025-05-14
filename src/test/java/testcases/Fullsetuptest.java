package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass;
import pompages.Loginpage;

public class Fullsetuptest extends Baseclass {

	@BeforeTest
	public void testDetails() {
		testName="Full set up test";
		testDescription="verify the flow of website";
		author="Seenivasan";
		category="Functional";
		
	}
	@Test
	public void Fullsetup() {
		Loginpage log = new Loginpage();
		log.launchlogin()
		.userid()
		.password()
		.submitbutton()
		.verification()
		.calllist()
		.standardimport()
		.listName()
		.file()
		.upload()
		.mapData()
		.importData();
		
	}
	
}
