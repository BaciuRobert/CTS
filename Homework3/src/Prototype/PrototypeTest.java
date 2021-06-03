package Prototype;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrototypeTest {
	

	

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
	public void test() throws CloneNotSupportedException {
		ServerPrototype s1 = new ServerPrototype("3311.300.22.5",4000,100);
		s1.setPort(9999);
		ServerPrototype sClone= (ServerPrototype) s1.clone();
		//sClone.setPort(s1.getPort());
		
		
		assertEquals("Testint prototype",s1.getPort(),sClone.getPort());
		
	}

}
