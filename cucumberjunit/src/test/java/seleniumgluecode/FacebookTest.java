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

public class FacebookTest {
	
	public WebDriver driver;
	@Given("^shuold navigate to facebook login page$")
	public void shuold_navigate_to_facebook_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.LINUX);
		
		String url = "http://localhost:4444/wd/hub";
		driver = new RemoteWebDriver(new URL(url), capability);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	}
	
	@When("^facebook website open user should wait for two seconds$")
	public void facebook_website_open_user_should_wait_for_two_seconds() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	}
	
	@When("^Write some output on console for facebook test$")
	public void write_some_output_on_console_for_facebook_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("From Facebook Account");
		Thread.sleep(2000);
	}
	
	@Then("^close webdriver for facebook test$")
	public void close_webdriver_for_facebook_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.quit();
	}

}
