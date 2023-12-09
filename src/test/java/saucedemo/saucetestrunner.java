package saucedemo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class saucetestrunner {

	@RunWith(Cucumber.class)
	@CucumberOptions(
	    features = "src/test/resources/features1",
	    glue = {"saucelogin", "sauceHooks"},
	    plugin = {"pretty", "html:target/cucumber-reports"}
	)
	public class TestRunner {
	}
}
