package week3.day1;

public class Browser {

	public void openurl() {
		String browserName ="Test browser";
		double browserVersion=121.345;		
		System.out.println("Browser name is "+ browserName);
		System.out.println("Browser version is"+ browserVersion);
	}
	
	public void closeBrowser(){
		System.out.println("Close the browser");
		}	
	public void navigateBack() {
		System.out.println("the browser navigated to back");
	}
}
