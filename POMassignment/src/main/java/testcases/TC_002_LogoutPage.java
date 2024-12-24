package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_002_LogoutPage extends ProjectSpecificMethod {
	// extend projectSpecificMethod in runner class

	//use @Test annotation for use testNG 

	@Test
	public void logOut() {
		//create a object for the starting class

		LoginPage out = new LoginPage(driver);
		out.userName()
		.passWord()
		.loginButton()
		.logoutButton();
	}
}
