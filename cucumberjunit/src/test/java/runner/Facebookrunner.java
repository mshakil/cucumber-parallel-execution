package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/Facebook.feature", glue = { "seleniumgluecode" }, plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-reports/Feature2/report.html" }, monochrome = true)

public class Facebookrunner {

	@AfterClass
	public static void WriteExtentReport() {
		Reporter.loadXMLConfig(new File("Config/report-config.xml"));
	}
}