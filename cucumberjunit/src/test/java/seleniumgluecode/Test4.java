package seleniumgluecode;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Test4 {
	
	public WebDriver driver;
	
	
	@Given("^shuold navigate to Quora login page$")
	public void shuold_navigate_to_Quora_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.LINUX);
		
		
		String url = "http://localhost:4444/wd/hub";
		driver = new RemoteWebDriver(new URL(url), capability);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.quora.com/");
		Thread.sleep(3000);
	}

	@When("^quora website open user should wait for two seconds$")
	public void quora_website_open_user_should_wait_for_two_seconds() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	}
	
	@When("^Write some output on console for quora test$")
	public void write_some_output_on_console_for_quora_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("From Quora Account");
		
		Thread.sleep(2000);
	    driver.quit();
	}

}
