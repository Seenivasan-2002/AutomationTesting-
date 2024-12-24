package testcases1;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
//Implement Create Account test case using the Page Object Model (POM) design pattern

// Sequencial Run


public class TC_003_CreateAccount extends ProjectSpecificMethod {
	// extend projectSpecificMethod in runner class
	
	
	//use @Test annotation for use testNG 
	@Test()
	public void createAccount() {
		//create a object for the starting class
		LoginPage Create = new LoginPage(driver);
		Create.userName()
		.passWord()
		.loginButton()
		.clickOnCrmsfa()
		.accountClick()
		.clickOnCreate()
		.accountName()
		.description()
		.siteName()
		.countOfEmployees()
		.createAccountButton()
		.verifyTittle();
		
	}
	
}
