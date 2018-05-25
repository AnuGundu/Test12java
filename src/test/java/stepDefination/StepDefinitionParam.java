package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionParam {

	WebDriver driver=null;
	
	@Given("^To start firefox by creating a driver instance\\.$")
	public void setUp() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C://Latest Software//Cucumber//geckodriver-v0.20.1-win64//geckodriver.exe");
		driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://apps.qa2qe.cognizant.e-box.co.in/shippingDetails/");
        System.out.println("Application is launched");
        
	}

	@When("^Test the \"([^\"]*)\" is present in \"([^\"]*)\" tag\\.$")
	public void testShippingDetails(String arg1, String arg2) throws Throwable {
		String text = driver.findElement(By.tagName(arg2)).getText();
		System.out.println(text);
		Assert.assertEquals(arg1,text);
		Thread.sleep(5000);
			
	}
	@And("^To click on the \"([^\"]*)\" text if present\\.$")
	public void testShippingDetails1(String arg1) throws Throwable {
		driver.findElement(By.linkText(arg1)).click();
		Thread.sleep(5000);
			
	}

	@Then("^To validate if the customer name is \"([^\"]*)\"\\.$")
	public void validateResult(String arg1) throws Throwable {
		String name = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]")).getText();
		Assert.assertEquals(arg1,name);
		Thread.sleep(5000);
		driver.close(); 
		
				}
}
	
