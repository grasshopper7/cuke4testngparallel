package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(glue = "stepdef", plugin = {"json:target/json-cucumber-reports/cukejson.json",
		"testng:target/testng-cucumber-reports/cuketestng.xml" }, features = "src/test/resources/feature/")
public class Default extends AbstractTestNGCucumberParallelTests {
}
