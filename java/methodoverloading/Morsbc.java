package methodoverloading;

public class Morsbc extends Morsrc {

	@Override
	public void takesnap() {
		System.out.println("The snap was clicked from subclass");
		super.takesnap();
	}
	public static void main(String[] args) {
		
		Morsbc ride = new Morsbc();
		ride.takesnap();
	}

}
