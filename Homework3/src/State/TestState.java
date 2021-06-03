package State;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestState {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After 
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Server serverUp=new Server();
		serverUp.setState(true);
		
		
		
		Server serverDown=new Server();
		serverDown.setState(false);
	
		
		boolean expectedResult = true;
	    boolean actualResult;
	    if(serverUp.getState() != serverDown.getState())
	        actualResult = true; 
	    else 
	    	actualResult=false;
	    
	    assertEquals(expectedResult,actualResult);
	    
	    
	}

}
