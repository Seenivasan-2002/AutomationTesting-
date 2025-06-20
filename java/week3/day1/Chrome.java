package week3.day1;

public class Chrome extends Browser{

	public void openIncongnito() {
		System.out.println("Openincognito tab has no cache");
	}
	public void clearCache() {
		System.out.println("Clearing cache free your device");
	}
	
	
	public static void main(String[] args) {
           Chrome child1 = new Chrome ();
           
           child1.openurl();
           child1.openIncongnito();
           child1.clearCache();
           
		
		
	}

}
