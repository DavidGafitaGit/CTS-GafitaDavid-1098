package gafita.david.g1098.Singleton;
import java.util.concurrent.TimeUnit;

public enum DBConnection {
	
	LOCAL("127.0.0.1", 3306, "stocklist"),
	TEST("10.0.0.1", 3303, "test");
	
	String serverIP;
	int serverPort;
	String database;
	
	boolean isOpen = false;
	
	private DBConnection(String serverIP, int serverPort, String database) {
		this.serverIP = serverIP;
		this.serverPort = serverPort;
		this.database = database;
	}
	
	public void connect() {
		if(!isOpen) {
			System.out.println("Connecting to: " + this.database + " at " + this.serverIP + ":" + this.serverPort);
			this.isOpen = true;
			System.out.println("Successfully connected to: " + this.database + " at " + this.serverIP + ":" + this.serverPort);
		} else 
		{
			System.out.println("You are already connected to " + this.database + " at " + this.serverIP + ":" + this.serverPort);
		}
	}

}
