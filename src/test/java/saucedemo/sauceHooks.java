package saucedemo;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class sauceHooks {

	@Before
    public void beforeScenario() {
        System.out.println("Before Scenario: Open browser and navigate to Saucedemo");
        // Additional setup code can be added here
    }

    @After
    public void afterScenario() {
        System.out.println("After Scenario: Close browser");
        // Additional teardown code can be added here
    }
}

