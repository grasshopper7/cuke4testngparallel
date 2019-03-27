package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(glue = "stepdef", plugin = {"json:target/json-cucumber-reports/second/cukejson.json",
		"testng:target/testng-cucumber-reports/second/cuketestng.xml" }, features = "src/test/resources/feature/second")
public class SecondRunner extends AbstractTestNGCucumberParallelTests {

}
