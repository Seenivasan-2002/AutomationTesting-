package runner;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Login;


public class TC_002_CreateAccount extends ProjectSpecificMethod{
		//extend projectSpecificMethod in runner class
	
	//use @Test annotation for use testNG 
	@Test()
	public void createAccount() {
		//create a object for the starting class
		Login Create = new Login();
		Create.userName()
		.passWord()
		.clickOnLogin()
		.clickOnCrmsfa()
		.accountClick()
		.clickOnCreate()
		.accountName()
		.description()
		.siteName()
		.countOfEmployees()
		.createAccountButton();
}
}

