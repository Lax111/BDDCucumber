
package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue= {"StepDifinitions"},
monochrome=true,
plugin = {"pretty",
          "json:target/JSONReports/report.json",
          "html:target/HtmlReports",
          "junit:target/JUnitReports/report.xml"},
tags = "@smoketest")


public class TestRunner {
	
}


	

//plugin ={"pretty","html:target/HtmlReports"})