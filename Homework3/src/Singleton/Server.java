package Singleton;

public class Server implements ServerInterface{
	
	String ipAddress;
	int port;
	int maxConnections;
	
	private static Server serverInstance =null;

	private Server()
	{
		
	}
	
	private Server(String ipAddress, int port, int maxConnections) {
		super();
		this.ipAddress = ipAddress;
		this.port = port;
		this.maxConnections = maxConnections;
	}

	public static synchronized Server getServerInstance()
	{
		if(serverInstance == null) {
			String ipAddress="1000.29.200";
			int port=9000;
			int maxConnections=100;
			serverInstance = new Server(ipAddress,port,maxConnections);
		}
		
		return serverInstance;
	}
	
	@Override
	public String getIpAddress() {
		return ipAddress;
	}

	@Override
	public int getPort() {
		return port;
	}

	@Override
	public int getMaxConnections() {
	return maxConnections;
	}

	@Override
	public boolean connect() {
		return true;
	}

	@Override
	public boolean disconnect() {
		return false;
	}

	
}
