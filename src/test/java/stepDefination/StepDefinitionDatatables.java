package stepDefination;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionDatatables {
	
	WebDriver driver=null;

	@Given("^the user is on landing page$")
public void setUp() throws Throwable {
	System.setProperty("webdriver.gecko.driver","C://Latest Software//Cucumber//geckodriver-v0.20.1-win64//geckodriver.exe");
	driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("http://apps.qa2qe.cognizant.e-box.co.in/Handling_Reg_Expression");
    System.out.println("Application is launched");
}

@When("^she provides her Name and clicks on Search$")
public void testUserDetails(DataTable arg1) throws Throwable {
	List<List<String>> data = arg1.raw();
	String text = data.get(1).get(0);
	driver.findElement(By.id("userID")).sendKeys(text);
	driver.findElement(By.id("track")).click();		
}

@Then("^validate the results$")
public void validateResult(DataTable arg1) throws Throwable {
	List<List<String>> data = arg1.raw();
	String text = data.get(0).get(0);
	text=text+"\n"+data.get(0).get(1);
	text=text+"\n"+data.get(0).get(2);
	text=text+"\n"+data.get(0).get(3);
	Assert.assertEquals(text,driver.findElement(By.id("result")).getText());
	driver.close(); 
 }
   
}

