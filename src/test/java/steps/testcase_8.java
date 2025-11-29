package steps;

import static org.testng.Assert.assertTrue;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LaptopPage;
import pageObject.payment;
import pageObject.product;

import utilities.Screenshot;
import utilities.reportGenerator;

public class testcase_8 extends reportGenerator {
	Screenshot screen = new Screenshot();
	product pd = new product();
	payment lap=new payment();
	public testcase_8() {
	   
	    test = extent.startTest("Test 7");
	}
	
	@When("he check product details are not available")
	public void he_check_product_details_are_not_available() throws InterruptedException {
		    lap.laptop();
		    lap.selectlaptop();
		    pd.emptyLap();
		    screen.takeScreenshot();
		assertTrue(pd.isNoProductDetailsDisplayed(), "Product details are NOT visible!");
	}

	@Then("display it is unavailable")
	public void display_it_is_unavailable() throws InterruptedException {
		try {
    	    screen.takeScreenshot();
    	    test.log(LogStatus.FAIL, "Test7 is Fail");
    	} catch (Exception e) {
    	   
    	} 
	}

}
