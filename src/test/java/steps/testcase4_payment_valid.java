package steps;


import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import pageObject.payment;
import utilities.Screenshot;
import utilities.reportGenerator;
import steps.hooks;

public class testcase4_payment_valid extends reportGenerator {
	WebDriver driver=hooks.getDriver();
	payment pay=new payment();
	Screenshot screen = new Screenshot();
	
	@When("the user has a product in the cart")
	public void the_user_has_a_product_in_the_cart() throws InterruptedException {
		test = extent.startTest("payment valid");
		int count = pay.menucart();
        if (count == 0) {
            pay.laptop();
            pay.selectlaptop();
            pay.Addcart();
        }
        pay.Clickmenucart();
        Thread.sleep(1000);

        pay.checkout();
        Thread.sleep(1000);
        
        pay.nextbutton();
        Thread.sleep(1000);
        pay.saypay();
    }
	@When("he selects SafePay and enters {string} and {string}")
	public void he_selects_SafePay_and_enters_and(String username,String password) {
	    pay.username_pay(username);
	    pay.userpass_pay(password);
	}

	@Then("he completes the payment")
	public void he_completes_the_payment() throws InterruptedException {
	   Thread.sleep(2000);
	   test.log(LogStatus.PASS," payment is Pass");
	   screen.takeScreenshot();
	   Allure.step("Valid Payment Passed");
	   pay.payment();
	}
}