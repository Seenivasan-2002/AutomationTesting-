package inheritance2;

//**create excution class named as Elements
public class Elements extends Button {
//inheritance from Button
	
	public static void main(String[] args) {
		Elements execute = new Elements();
		
		//execution of inheritance  the values
		execute.setText("Execution");
		execute.click();
		execute.submit();
		
	}

}
