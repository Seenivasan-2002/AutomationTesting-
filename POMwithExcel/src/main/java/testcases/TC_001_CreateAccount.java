package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_CreateAccount extends ProjectSpecificMethod {

	//import @BeforeTest for choose respective file 
	@BeforeTest
	public void setValue() {
		data="CreateAccountData";
	}
	
	
	// import @Test annotation for testNG run and Give the data provider name 
	@Test(dataProvider="getData")
	public void createAccount(String AccName,String descript,String site,String count) {
		//create a object for the starting class
		LoginPage Create = new LoginPage(driver);
		Create.userName()
		.passWord()
		.loginButton()
		.clickOnCrmsfa()
		.accountClick()
		.clickOnCreate()
		.accountName(AccName)
		.description(descript)
		.siteName(site)
		.countOfEmployees(count)
		.createAccountButton();
		
	}
	
}
