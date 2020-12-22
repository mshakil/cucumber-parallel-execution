package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/Twitter.feature", glue = { "seleniumgluecode" }, plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-reports/Feature3/report.html" }, monochrome = true)

public class Twitterrunner {

	@AfterClass
	public static void WriteExtentReport() {
		Reporter.loadXMLConfig(new File("Config/report-config.xml"));
	}
}