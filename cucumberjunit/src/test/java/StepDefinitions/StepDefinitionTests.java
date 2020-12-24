package StepDefinitions;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionTests {

	public WebDriver Driver;
	String webUrl = "https://www.google.com";
	
	public void InitializeDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chrome\\chromedriver.exe");
		Driver = new ChromeDriver();
	}
	
	@Given("^User Should Initialize WebDriver$")
	public void user_Should_Initialize_WebDriver() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		InitializeDriver();
	    System.out.println("Web Driver Initialized");
	}
	
	
	//	SUITE ONE
	@When("^Navigate to url from S one F one file$")
	public void navigate_to_url_from_S_one_F_one_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.get(webUrl);
		System.out.println("Scenario one Feature one");
	}

	@When("^Navigate to url from S One F Two file$")
	public void navigate_to_url_from_S_One_F_Two_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.get(webUrl);
		
		System.out.println("Scenario one Feature two");
	}
	
	//	SUITE TWO
	
	@When("^Navigate to url from S two F one file$")
	public void navigate_to_url_from_S_two_F_one_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.get(webUrl);
		
		System.out.println("Scenario two Feature one");
	}
	
	@When("^Navigate to url from S Two F Two file$")
	public void navigate_to_url_from_S_Two_F_Two_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.get(webUrl);
		
		System.out.println("Scenario two Feature two");
	}
	
	
	// SUITE THREE
	@When("^Navigate to url from S Three F one file$")
	public void navigate_to_url_from_S_Three_F_one_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.get(webUrl);
		
		System.out.println("Scenario Three Feature one");
	}

	
	@When("^Navigate to url from S Three F Two file$")
	public void navigate_to_url_from_S_Three_F_Two_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.get(webUrl);
		
		System.out.println("Scenario Three Feature two");
	}
	
	//SUITE FOUR
	@When("^Navigate to url from S Four F one file$")
	public void navigate_to_url_from_S_Four_F_one_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.get(webUrl);
		
		System.out.println("Scenario Four Feature one");
	}
	
	@When("^Navigate to url from S Four F Two file$")
	public void navigate_to_url_from_S_Four_F_Two_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.get(webUrl);
		
		System.out.println("Scenario Four Feature two");
	}
	
	@Then("^Close WebDriver$")
	public void close_WebDriver() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Driver.quit();
	}
}
