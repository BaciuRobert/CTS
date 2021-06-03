package assignment4_cts_testing_tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import assignment4_cts_testing_classes.Product;
import assignment4_cts_testing_exceptions.WrongNameException;
import assignment4_cts_testing_exceptions.WrongPriceException;

public class Tests {

    static ArrayList<Integer> products;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		products=new ArrayList<>();
		products.add(100);
		products.add(5);
		products.add(3);
		
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
	//	fail("Not yet implemented");
	}
	
	@Test
	public void TestConstructorConformanceForRightInput() throws WrongPriceException, WrongNameException 
	{
		final float price=100f;
		final String name="paine";
		
		
		Product product = new Product(name,price);
		
	      
		assertEquals(name,product.getName());
		assertEquals(price,product.getPrice(),0);
		
		
	}
	
	@Test
	public void TestConstructorWith3ParametersConformanceForRightInput()
	{
		final float price=200f;
		final String name="lapte";
		
		Product product = new Product(name,price,products);
		
		assertEquals(name,product.getName());
		assertEquals(price,product.getPrice(),0);
		assertEquals(products,product.getSales());
		
	}
	
	@Test
	public void TestConstructorWith2ParamErrorConditionNegativeValueAndMinimumCharactersForName()
	{
		float price=-5f;
		String name="oua";
		
		try {
			Product product = new Product(name,price);
			fail("We didn't get any exception");
		} catch (WrongPriceException e) {
			assertTrue(true);
		} catch (WrongNameException e) {
			assertTrue(true);
			
		}
	}
	
	@Test
	public void TestConstructorWith2ParamErrorConditionUpperLimitIgnored()
	{
		float price=100000000;
        String name="aaaaaa";
		try {
			Product product = new Product(name,price);
			fail("We didn't get any exception");
		} catch (WrongPriceException e) {
			assertTrue(true);
		} catch (WrongNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
