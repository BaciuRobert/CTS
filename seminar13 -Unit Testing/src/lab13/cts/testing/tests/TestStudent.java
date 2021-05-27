package lab13.cts.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import lab13.cts.testing.exceptions.WrongAgeException;
import lab13.cts.testing.exceptions.WrongNameException;
import lab13.cts.testing.models.Student;

public class TestStudent {
	
	static Student student;
    static ArrayList<Integer> grades;
    static String initialName = "John";
	static int initialAge = 21;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		grades=new ArrayList<>();
		grades.add(9);
		grades.add(10);
		grades.add(8);
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		//here the student is created before each unit Test (the function setUp triggers before each unit Test)
		student = new Student(initialName,initialAge,grades);
	}

	@After
	public void tearDown() throws Exception {
	}
     
	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetNameConformanceForRightInput() throws WrongNameException
	{
		
		String newName="John Doe";
		student.setName(newName);
		assertEquals("Testing with a proper name",newName,student.getName());
	}
	
	@Test
	public void testSetAgeConformanceForRightInput()
	{
		int newAge=initialAge +1;
		try {
			student.setAge(newAge);
			assertEquals("Testing with right values",newAge,student.getAge());
		}catch(WrongAgeException e) {
			fail("We got an exception for right data");
		}
	}
	
	
	@Test
	public void testSetAgeErrorConditionWithNegativeValue()
	{
	int newAge= initialAge * -1;
	try {
		student.setAge(newAge);
		fail("We didn't got the exception");
	} catch (WrongAgeException e) {
		assertTrue(true);
	}
	}
	
	
	@Test(expected = WrongNameException.class)
	public void testSetNameErrorConditionSmallName() throws WrongNameException
	{
		String newName = "Io";
		student.setName(newName);
	}

}
