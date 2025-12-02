package steps;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginpage;
import utilities.reportGenerator;

public class testcase2_invalid extends reportGenerator {
	loginpage Loginpage2;
	WebDriver driver=hooks.getDriver();
	
	@Given("The user in the login page to login with invalid details")
	public void the_user_in_the_login_page_to_login_with_valid_details() {
	   System.out.println("The user in the login page to login with valid details");
	   test=extent.startTest("login with invalid details");
	   Loginpage2 =new loginpage();
	  
	}
	@When("he enters the invalid credentials {string} and {string}")
	public void he_enters_the_invalid_credentials_and(String string, String string2) throws InterruptedException {
		 
		 Loginpage2.login(string,string2);
	}

	@Then("he should be not able to login to the Home page")
	public void he_should_be_not_able_to_login_to_the_home_page() {
		System.out.println("The user should be not able to login to the Home page");
		 boolean logpass=Loginpage2.isLoginFailed();
		 assertFalse(logpass);
	    test.log(LogStatus.FAIL, "user entered the invalid details");   
	}

}
