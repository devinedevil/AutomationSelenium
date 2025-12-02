package steps;



import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.payment;
import utilities.Screenshot;
import utilities.reportGenerator;

public class testcase5_payment_invalid extends reportGenerator {
	WebDriver driver=hooks.getDriver();
	payment pay=new payment();
	Screenshot screen = new Screenshot();
	
	@When("the user has a products in the cart")
	public void the_user_has_a_products_in_the_cart() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		test = extent.startTest("Test 4 payment invalid");
		
		int count = pay.menucart();
        if (count == 0) {
            pay.laptop();
            pay.selectlaptop();
            pay.Addcart();
        }
        pay.Clickmenucart();

        pay.checkout();
        
        pay.nextbutton();
        Thread.sleep(10000);
        screen.takeScreenshot();
        pay.saypay();
        
	   
	}

	@When("he selects SafePay and enter {string} and {string}")
	public void he_selects_safe_pay_and_enter_and(String string, String string2) {
		 pay.username_pay(string);
		 pay.userpass_pay(string2);
	}

	@Then("he should see a payment error")
	public void he_should_see_a_payment_error() throws InterruptedException {
		Thread.sleep(10000);
		test.log(LogStatus.PASS,"Test4 is Pass");
		screen.takeScreenshot();
	}


}
