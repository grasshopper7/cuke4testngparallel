package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(glue = "stepdef", plugin = {"json:target/json-cucumber-reports/first/cukejson.json",
		"testng:target/testng-cucumber-reports/first/cuketestng.xml" }, features = "src/test/resources/feature/first")
public class FirstRunner extends AbstractTestNGCucumberParallelTests {

}
