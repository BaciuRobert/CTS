package Singleton;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SingletonTest {
	

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
		Server s1 =Server.getServerInstance();
		Server s2 = Server.getServerInstance();
		boolean expectedResult = true;
		boolean actualResult= false;
		if(s1 == s2)
			actualResult= true;
		assertEquals("Testing singleton: ",s1,s2);
		
	}

}
