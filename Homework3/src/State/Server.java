package State;

public class Server implements ServerInterface{
	
	public static boolean serverStatus;
	
	ServerInterface serverState = new ServerUP();
	

	@Override
	public String getIpAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPort() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxConnections() {
		// TODO Auto-generated method stub
		return 0;
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
	
	public void checkStatus()
	{
		if(this.serverState != null)
		{
			this.serverState.connect();
		}
		else
			throw new UnsupportedOperationException();
	}
	
	
	public void setState(boolean status)
	{
		if(status = false)
			this.serverState=new  ServerDown();
		else if(status = true)
			this.serverState=new ServerUP();
	}

	public ServerInterface getState()
	{
		return this.serverState;
	}
}
