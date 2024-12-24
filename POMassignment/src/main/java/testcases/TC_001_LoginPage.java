package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_LoginPage extends ProjectSpecificMethod {
	// extend projectSpecificMethod in runner class

	
	//use @Test annotation for use testNG 

	@Test
	public void login() {
		//create a object for the starting class

		LoginPage in = new LoginPage(driver);
		in.userName()
		.passWord()
		.loginButton();
	}
}
