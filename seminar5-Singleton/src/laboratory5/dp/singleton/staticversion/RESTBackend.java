package laboratory5.dp.singleton.staticversion;

public class RESTBackend {

	String url;
	String data;
	
	public static final RESTBackend theBackend ;
	
	
	//another block
		{
			System.out.println("executed everytime before any constructor call");
		}
	
	//executed only once
	static {
		System.out.println("is executed when the class is loaded by the JVM");
		
		theBackend=new RESTBackend();
		theBackend.url="www.acs.ase.ro/cts";
	}
	
	
	
	
    private RESTBackend() {
	//get the data from the config file or smh else	
	}
	
}
