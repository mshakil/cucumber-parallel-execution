package runner.SuiteRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/Suite-04/", glue = { "StepDefinitions" })

public class Suite04 {

}
