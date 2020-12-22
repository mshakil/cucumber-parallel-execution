package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features/Test3.feature"
,glue= {"seleniumgluecode"}
)

public class Test3runner {

}
