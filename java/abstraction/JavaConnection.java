package abstraction;

public class JavaConnection implements DatabaseConnection {

	//Implement the interface in a Concrete class
	

	public void connect() {
		System.out.println("System connected");
	}
	

	@Override
	public void disconnect() {
		System.out.println("Disconnect from the Database");

	}

	@Override
	public void executeUpdate() {
		System.out.println("execute update to the Database");
		
	}
	
	// for practice  o/p
	public static void main(String[] args) {
		JavaConnection data = new JavaConnection();
		data.connect();
		data.disconnect();
		data.executeUpdate();
	}

}
