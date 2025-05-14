package pompages;

import base.Baseclass;
import base.Baseclass.locators;

public class Dashboardpage extends Baseclass {

	public Dashboardpage verification() {
		click(locateElement(locators.CLASS_NAME, "close"));
		System.out.println(gettitle());
		if (gettitle().contains("Getcalley - Dashboard")) {
			System.out.println("Log in verified successfully");
		} else {
			System.out.println("login verification failed");
		}
		
		return this;
	}
	
	public Dashboardpage calllist() {
		movetoElement(locateElement(locators.XPATH, "//Span[text()='Call List ']"));
		return this;
	}
	
	public CSVuploadpage standardimport() {
		click(locateElement(locators.XPATH,"//Span[text()='Add - Standard Import']"));
	return new CSVuploadpage();
	}
	
}
