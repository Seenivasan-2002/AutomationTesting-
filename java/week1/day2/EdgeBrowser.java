package week1.day2;
import week1.day2.Browser;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser hlo = new Browser();
		String launchBrowser=hlo.launchBrowser("Chrome");
		System.out.println(launchBrowser);
		hlo.loadUrl();
	}

}
