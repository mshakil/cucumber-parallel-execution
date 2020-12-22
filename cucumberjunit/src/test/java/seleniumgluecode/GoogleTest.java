package seleniumgluecode;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleTest {

	public WebDriver driver;
	@Given("^shuold navigate to google login page$")
	public void shuold_navigate_to_google_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.LINUX);
		
		
		String url = "http://localhost:4444/wd/hub";
		driver = new RemoteWebDriver(new URL(url), capability);
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
	}

	@When("^google website open user should wait for two seconds$")
	public void google_website_open_user_should_wait_for_two_seconds() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	}

	@When("^Write some output on console for google test$")
	public void write_some_output_on_console_for_google_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("From Google Feature");
		Thread.sleep(2000);
	}

	@Then("^close webdriver for google test$")
	public void close_webdriver_for_google_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Thread.sleep(2000);
		driver.quit();
	}
	
}
