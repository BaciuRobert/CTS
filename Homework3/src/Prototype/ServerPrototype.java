package Prototype;

public class ServerPrototype implements ServerInterface,Cloneable {
	
	String ipAddress="1000.233.2.11";
	int port=4000;
	int maxConnection=50;

	
	private ServerPrototype()
	{
		
	}
	
	public ServerPrototype(String ipAddress, int port, int maxConnection) {
		super();
		this.ipAddress = ipAddress;
		this.port = port;
		this.maxConnection = maxConnection;
	}
	
	public void setPort(int port)
	{
		this.port=port;
	}

	@Override
	public String getIpAddress() {
		return this.ipAddress;
	}

	@Override
	public int getPort() {
		return this.port;
	}

	@Override
	public int getMaxConnections() {
		return this.getMaxConnections();
	}

	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean disconnect() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		ServerPrototype copy=new ServerPrototype();
		copy.ipAddress=this.ipAddress;
	  //  copy.port=this.port;
	    copy.maxConnection=this.maxConnection;
	    copy.setPort(this.getPort());
		
	    return copy;
	}

}
