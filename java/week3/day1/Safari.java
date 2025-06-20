package week3.day1;

public class Safari extends Browser {

	public void readMode() {
		System.out.println("Read mode is easy to read");
	}
	public void fullscreenMode() {
		System.out.println("Full screen mode , helps to full view of browser");
	}
	
	public static void main(String[] args) {
			Safari child3 = new Safari();
			
			child3.openurl();
			child3.readMode();
			child3.fullscreenMode();
			child3.navigateBack();
			child3.closeBrowser();
		
	}

}
