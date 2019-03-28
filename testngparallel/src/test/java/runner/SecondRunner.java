package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(glue = "stepdef", plugin = {"json:target/json-cucumber-reports/second/cukejson.json",
		"testng:target/testng-cucumber-reports/second/cuketestng.xml" }, features = "src/test/resources/feature/second")
public class SecondRunner extends AbstractTestNGCucumberParallelTests {
	
	@BeforeClass
	public static void before() {
		System.out.println("Before - "+System.currentTimeMillis());
	}
	
	@AfterClass
	public static void after() {
		System.out.println("After - "+System.currentTimeMillis());
	}

}
