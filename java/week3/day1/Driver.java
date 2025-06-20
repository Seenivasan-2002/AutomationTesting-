package week3.day1;

public class Driver {
	
	public void loadurl(String url) {
		System.out.println("Url of driver :"+ url);
	}
	public void loadurl(String url, boolean status) {
		System.out.println("Url of driver 2: "+url +"    "+"Status of url 2: "+status);
	}

	public static void main(String[] args) {
			Driver ovrload = new Driver();
			
			ovrload.loadurl("www.url1.com");
			ovrload.loadurl("www.url2.com", true);
	}

}
