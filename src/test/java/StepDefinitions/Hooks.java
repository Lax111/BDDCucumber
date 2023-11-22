package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
    public void setupForSmokeTests() {
       System.out.println("Setting up for smoke Tests");
    }

    @After
    public void tearDown(Scenario scenario) {
       System.out.println("Tearing down after scenario:"+ scenario.getName());
    }}