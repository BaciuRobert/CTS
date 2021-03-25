package laboratory5.dp.singleton.registry;

public class TestSingletonRegistry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RESTBackend backend1=RESTBackend.getRESTBackend("10.0.0.1","profile");
		RESTBackend backend2=RESTBackend.getRESTBackend("10.0.0.1","profile");
		
		RESTBackend backend3=RESTBackend.getRESTBackend("10.0.0.1","profile");
		
		if(backend1 == backend2) {
			System.out.println("they point to the same object");
		}
		else {
			System.out.println("the are diff");
		}
	}

}
