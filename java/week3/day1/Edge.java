package week3.day1;

public class Edge extends Browser  {

	public void takeSnap() {
		System.out.println("take snap gets the picture of cuurent screen");
	}
	
	public void clearCache() {
		System.out.println("clearing cookies gets your browsing safe ");
	}
	public void openurl() {
		String browserName ="edge browser";
		double browserVersion=1356.345;		
		System.out.println("Browser name is "+ browserName);
		
		System.out.println("Browser version is"+ browserVersion);
		System.out.println("");
		
		super.openurl();
	}
	
	public static void main(String[] args) {
			Edge child2 = new Edge();
			
			child2.openurl();
			
			
			
			
			
			//child2.takeSnap();
			//child2.clearCache();
			//child2.closeBrowser();
			
		
		
	}

}
