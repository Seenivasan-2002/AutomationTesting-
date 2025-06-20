package abstraction;

//Create an interface
public interface DatabaseConnection {

	// create  abstract methods-connect() - disconnect() - executeUpdate()
	
	public void connect();
	public void disconnect();
	public void executeUpdate();
}
