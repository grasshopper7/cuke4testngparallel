package stepdef;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.And;

public class StepDefinition {
	
	private String scenDesc;
	
	@Before
	public void before(Scenario scenario) {
		this.scenDesc = scenario.getName();
	}
	
	@BeforeStep
	public void beforeStep() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	@And("this is {string} step")
	public void step(String stepNum) {
		System.out.format("Thread %2d -> %18s - %-6s STEP\n", Thread.currentThread().getId(), scenDesc, stepNum);
	}
}