package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class NodiscountStepDefinition {
	
	WebDriver driver=null;
@Given("^To start firefox and Launch the application\\.$")
	public void setUp() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C://Latest Software//Cucumber//geckodriver-v0.20.1-win64//geckodriver.exe");
		driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("http://apps.qa2qe.cognizant.e-box.co.in/CompanyOffersDiscount/");
	    System.out.println("Application is launched");
	    
	}

	@When("^Tests to check for the input, weight \"([^\"]*)\" and distance \"([^\"]*)\"\\.$")
	public void testNodiscount(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("weight")).sendKeys(arg1);
		driver.findElement(By.id("distance")).sendKeys(arg2);
		driver.findElement(By.id("submit")).click();
		}

@Then("^Test the scenario  whether the id result has the text \"([^\"]*)\"\\.$")
	public void validateResult(String arg1) throws Throwable {
		Assert.assertEquals(arg1,driver.findElement(By.id("result")).getText());
		driver.close();
	}

}

