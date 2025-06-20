package methodoverloading;

public class Morsrc {

	public void takesnap() {
		System.out.println("The snap was clicked from super class");
	}
	public void reportStep(String msg) {
		System.out.println("This is the message from step : "+msg);
	}
	public static void main(String[] args) {
		Morsrc ride = new Morsrc();
		ride.takesnap();
		ride.reportStep("Hi team");

	}

}
