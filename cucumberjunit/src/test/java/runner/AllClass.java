package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/", glue = { "seleniumgluecode" }, plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-reports/Feature2/report.html" }, monochrome = true)

public class AllClass {

}
