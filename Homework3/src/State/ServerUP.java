package State;

public class ServerUP implements ServerInterface{

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
        System.out.println("Connection to server is succesful");
        return true;
	}

	@Override
	public boolean disconnect() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
