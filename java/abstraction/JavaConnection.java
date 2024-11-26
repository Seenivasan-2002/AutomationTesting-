package abstraction;

public class JavaConnection implements DatabaseConnection {

	//Implement the interface in a Concrete class
	

	@Override
	public void connect() {
		System.out.println("connect to the Database");
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
