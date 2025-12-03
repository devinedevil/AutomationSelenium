package steps;



import static org.testng.Assert.assertTrue;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import pageObject.payment;
import pageObject.product;
import utilities.Screenshot;
import utilities.reportGenerator;

public class testcase7_product extends reportGenerator {
	Screenshot screen = new Screenshot();
	
	payment pid= new payment();
	product pd=new product();
	public testcase7_product() {
		 test = extent.startTest("Available details test 1");
    }
	
	@When("he check product details available")
	public void he_check_product_details_available() throws InterruptedException {
		pid.laptop();       
	    pid.selectlaptop();
	    screen.takeScreenshot();
	    assertTrue(pd.isProductDetailsDisplayed(), "Product details are  visible!");
	}

	@Then("display it is available")
	public void display_it_is_available() throws InterruptedException {
		Thread.sleep(10000);
		test.log(LogStatus.PASS,"Product details check is Pass");
		screen.takeScreenshot();
		Allure.step("Available details Passed");

	}

}
