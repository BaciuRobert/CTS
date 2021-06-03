package lab13.cts.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import lab13.cts.testing.exceptions.WrongAgeException;
import lab13.cts.testing.exceptions.WrongGradeException;
import lab13.cts.testing.exceptions.WrongNameException;
import lab13.cts.testing.models.Student;
import lab13.cts.testing.tests.categories.ImportantTest;
import lab13.cts.testing.tests.categories.PerformanceTest;

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
	
	@Category(ImportantTest.class)
	@Test
	public void testGetGradesAverageOrderingASC() throws WrongGradeException
	{
		ArrayList<Integer> grades = new ArrayList<>();
		for(int i =6;i<10;i++) {
			grades.add(i);
		}
		
//		grades.add(6);
//		grades.add(6);
//		grades.add(7);
		
		student.setGrades(grades);
		
		float expectedAverage = 7.5f;
		float computedAverage =student.getGradesAverage();
		
		float result = (float)1/3 +(float)+(float)1/3;
		
		assertEquals("Testing with sorted array of grades",expectedAverage,computedAverage,0);
		
		
	}
	
	@Test
	public void testGetGradesAverageCardinalityZero() throws WrongGradeException {
		ArrayList<Integer> grades = new ArrayList<>();
		student.setGrades(grades);
		
		float expectedAverage = 0;
		float computedAverage = student.getGradesAverage();
		
		assertEquals("Testing an empty array of grades",expectedAverage,computedAverage,0);
	}
	
	@Category({ImportantTest.class,PerformanceTest.class})
	@Test
	public void testGetGradesAverageCardinalityOne() throws WrongGradeException {
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(Student.MAX_GRADE);
		student.setGrades(grades);
		
		float expectedAverage = Student.MAX_GRADE;
		float computedAverage = student.getGradesAverage();
		
		assertEquals("Testing an empty array of grades",expectedAverage,computedAverage,0);
	}
	
	@Test
	public void testGetGradesAverageExistanceNullReferenceForGrades() throws WrongGradeException
	{
		student.setGrades(null);
		
		float expectedAverage = 0;
		float computedAverage = student.getGradesAverage();
		
		assertEquals("Testing with null for grades",expectedAverage,computedAverage,0);
	}

}
