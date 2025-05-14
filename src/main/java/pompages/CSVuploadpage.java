package pompages;

import org.openqa.selenium.WebElement;

import base.Baseclass;

public class CSVuploadpage extends Baseclass {
	
	public CSVuploadpage listName() {
		type(locateElement(locators.ID, "ContentPlaceHolder1_txtlistname"),property.getProperty("listname") );
	return this;
	}
	
	public CSVuploadpage file() {
		upload(locateElement(locators.ID, "ContentPlaceHolder1_fileUpload"), "C:\\Users\\seeni\\Downloads\\Sample File.csv");
	return this;
	}
	public CSVuploadpage upload() {
		click(locateElement(locators.ID, "btnUp"));
		try {Thread.sleep(3000);} catch (Exception e) {}
		click(locateElement(locators.XPATH, "//button[@class='confirm']"));	
		return this;
	}
	
	public CSVuploadpage mapData() {
		select(locateElement(locators.ID, "ddlbelongto_1"), "FirstName");
		select(locateElement(locators.ID, "ddlbelongto_2"), "Phone");
		select(locateElement(locators.ID, "ddlbelongto_3"), "Notes");
		return this;
	}
	
	public void importData() {
		click(locateElement(locators.ID, "ContentPlaceHolder1_btnUpload"));
	try {Thread.sleep(5000);} catch (Exception e) {e.getMessage();}
	}
	
}
