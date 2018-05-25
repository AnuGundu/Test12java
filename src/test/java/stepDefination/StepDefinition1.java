package stepDefination;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition1 {
	
	WebDriver driver=null;
	 
	 
	/* @Before
    public void setUp1(){        
		System.setProperty("webdriver.gecko.driver","C://Latest Software//Cucumber//geckodriver-v0.20.1-win64//geckodriver.exe");
		//driver = new FirefoxDriver();
		
    } */
	
	@Given("^To load the application from the given URL\\.$")
	public void loadUrl() throws Throwable {
		driver = new FirefoxDriver();
        driver.manage().window().maximize();
       
        driver.get("http://apps.qa2qe.cognizant.e-box.co.in/CostCalculation/");
        System.out.println("Application is launched");
		
	}

	@When("^Tests the cost calculation by giving mode as \"([^\"]*)\" and weigth in \\(kg\\) as \"([^\"]*)\"\\.$")
	public void testCalculateCost(String arg1, String arg2) throws Throwable {
		System.out.println(arg2);
		driver.findElement(By.id("weight")).sendKeys(arg2);
		WebElement radioBtn = driver.findElement(By.id(arg1));
		radioBtn.click();
		driver.findElement(By.id("calculate")).click();
		Thread.sleep(5000);
	}
	
	@And("^Set as premium customer\\.$")
	public void setaspremiumcustomer() throws Throwable {
		
		WebElement chkBox = driver.findElement(By.id("premium"));
		chkBox.click();
		driver.findElement(By.id("calculate")).click();
		Thread.sleep(5000);
	}

	@Then("^validates results of the test to be \"([^\"]*)\"\\.$")
	public void validateResult(String arg1) throws Throwable {	    
		
		System.out.println(driver.findElement(By.id("result")).getText());
		Assert.assertEquals(arg1,driver.findElement(By.id("result")).getText());				
		
	}
		
	
	/* @After
    public void tearDown(){
        
		driver.close(); 
    } */
    
}