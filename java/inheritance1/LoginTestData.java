package inheritance1;

//create subclass logintestdata
public class LoginTestData extends TestData {
	//inheritance from TestData
	
	//create 2 methods
	 public void enterUsername() {
		 System.out.println("Tester1");
	} 
	  public void enterPassword() {
		  System.out.println("login1234");
	}
	// main method
	public static void main(String[] args) {
		LoginTestData log=new  LoginTestData();
		
		log.navigateToHomePage();
		log.enterCredentials();
		log.enterUsername();
		log.enterPassword();
		
	}

}
