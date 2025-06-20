package inheritance2;

//Create a base class named WebElement
public class WebElement {
     
	// create common methods such as click() and setText(String text)
	
	public void click() {
		System.out.println("Click on Webelement");
	}
	
	public void setText(String text) {
	System.out.println("Settext in Webelement is : "+text);
	}
	
}
