package lab13.cts.testing.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import lab13.cts.testing.tests.categories.ImportantTest;
import lab13.cts.testing.tests.categories.PerformanceTest;

@RunWith(Categories.class)
@IncludeCategory({ImportantTest.class,PerformanceTest.class})
@SuiteClasses({ TestStudent.class, TestStudentNewTests.class })
public class AllImportantTests {

}
