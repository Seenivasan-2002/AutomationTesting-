package week1.day2;
import week1.day2.Browser;

public class EdgeBrowser {

	public void Team() {
		System.out.println("Testing");
		
	}
	public String name() {
		
		String Bharath = "History";
		return Bharath;	
	}
	public static void main(String[] args) {
		Browser object2 = new Browser();
		String launchBrowser=object2.launchBrowser("Chrome");
		System.out.println(launchBrowser);
		object2.loadUrl();
		object2.hii();
		
		
		EdgeBrowser obj = new EdgeBrowser();
		String name = obj.name();
		System.out.println(name);
		obj.Team();
	}


}
