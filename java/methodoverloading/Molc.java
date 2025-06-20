package methodoverloading;

public class Molc {

	public void reportStep(String msg,String status) {
		System.out.println("The step is "+msg);
		System.out.println("The status of step: "+status);
	}
	public void reportStep(String msg, String status,boolean snap) {
		System.out.println("The step is "+msg);
		System.out.println("The status of step: "+status);
		System.out.println("The snap was clicked "+snap);
	}
	public static void main(String[] args) {
		Molc load = new Molc();
		load.reportStep("Login", "pass");
		load.reportStep("clicking the ", "fail", false);
	}

}
