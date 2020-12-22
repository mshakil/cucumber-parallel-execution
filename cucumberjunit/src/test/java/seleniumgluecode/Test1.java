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

public class Test1{

	public WebDriver driver;
	
	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\driver\\gecko\\geckodriver.exe");
		//driver = new FirefoxDriver();
		
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.LINUX);
		
		
		String url = "http://localhost:4444/wd/hub";
		driver = new RemoteWebDriver(new URL(url), capability);
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);

	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
		System.out.println("Second step");
	}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {

		System.out.println("Third Step");
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		
		System.out.println("Fourth step");

		Thread.sleep(2000);
		driver.quit();
		
	}

}
