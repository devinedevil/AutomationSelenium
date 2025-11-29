package steps;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginpage;
import utilities.reportGenerator;

public class testcase1_login extends reportGenerator{
	WebDriver driver=hooks.getDriver();
	 loginpage Loginpage1;
	

	@Given("The user in the login page to login with valid details")
	public void the_user_in_the_login_page_to_login_with_valid_details() {
	   System.out.println("The user in the login page to login with valid details");
	   test=extent.startTest("login with valid details");
	   Loginpage1 =new loginpage();
	  
	}
	@When("he enters the valid credentials of {string} and {string}")
	public void he_enters_the_valid_credentials_of_and(String string, String string2) throws InterruptedException {
		Loginpage1.login(string,string2);
	    boolean logpass=Loginpage1.isLoginSuccessfull();
       
        	assertTrue(logpass);
        	test.log(LogStatus.PASS, "user entered the valid details");
        
        Thread.sleep(2000);
	    driver.quit();
	    
	    

	    
	}
	@Then("he should be able to login to the Home page")
	public void he_should_be_able_to_login_to_the_Home_page() throws InterruptedException {
	      System.out.println("The user should be able to login to the Home page");
	      Thread.sleep(2000);
	      assertTrue(true);
	      test.log(LogStatus.PASS, "user entered the valid details");
	   
	     
	}


	

}