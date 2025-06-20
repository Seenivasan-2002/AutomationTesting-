package week1.day2;

public class Browser {
  public String  launchBrowser(String browserName) {
	  System.out.println("Browser launched successfully"+browserName);
	  return browserName;
  }
  public void loadUrl() {
	  System.out.println("application url loaded successfully");
  }
  
  
  
  
  public static void main(String[] args) {
	Browser hi = new Browser();
	String launchBrowser=hi.launchBrowser("Chrome");
	System.out.println(launchBrowser);
	hi.loadUrl();
}
  private void name() {
	System.out.println("hariharan");
}
	void hii() {
		System.out.println("hllo in browser");
	}
}
