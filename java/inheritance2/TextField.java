package inheritance2;

//create TextField subclass for WebElement
public class TextField extends WebElement {
	//inheritance  WebElement
	
	//create getText() method
	public void getText() {
		System.out.println(" Gettext from TextField");
	}
	
	public static void main(String[] args) {
		TextField tex= new   TextField();
		
		//practice  o/p
		tex.click();
		tex.setText("webElement to TextField");
		tex.getText();
	}
	
}
