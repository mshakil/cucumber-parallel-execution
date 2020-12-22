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


public class Test2 {
	
	public WebDriver driver;
	
	@Given("^should navigate to homepage$")
	public void should_navigate_to_homepage() throws Throwable {

		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.LINUX);
		
		String url = "http://localhost:4444/wd/hub";
		driver = new RemoteWebDriver(new URL(url), capability);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	}
	
	@When("^User selects t-shirt category$")
	public void user_selects_t_shirt_category() throws Throwable {

		System.out.println("Second step");		
	}
	
	@Then("^T-shirt Banner should be shown$")
	public void t_shirt_Banner_should_be_shown() throws Throwable {
	    
		System.out.println("Third step");
		
		Thread.sleep(2000);
		driver.quit();
	}
}
