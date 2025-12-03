package steps;

import static org.testng.Assert.assertTrue;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Screenshot;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import pageObject.LaptopPage;
import utilities.reportGenerator;

public class testcase3_OS extends reportGenerator 
{
	LaptopPage laptopPage;
	WebDriver driver=hooks.getDriver();
	Screenshot screen = new Screenshot();
	
	
	@Given("user is on the laptop page")
	public void user_is_on_the_laptop_page() throws InterruptedException {
		System.out.println("The user in the Home page");
		test=extent.startTest("Test filter By OS");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   Thread.sleep(2000);
		   driver.findElement(By.id("laptopsImg")).click();
		  laptopPage=new LaptopPage();
		  Thread.sleep(2000);
		  System.out.println("The user selects the laptop page");
	   
	}

	@When("user select the {string} OS filter")
	public void user_select_the_os_filter(String string) throws InterruptedException {
		System.out.println("The user selects the OS filter");
		Thread.sleep(2000);
		laptopPage.selectOS(string);
		
		
		 
	}

	@Then("user should see laptops that match the selected OS")
	public void user_should_see_laptops_that_match_the_selected_os() {
		boolean isCorrect = laptopPage.validateOSResults();
       assertTrue(isCorrect, "Laptop OS results match the selected filter!");
       if(isCorrect) {
    	   System.out.println("The laptop filter worked correctly");
    	   test.log(LogStatus.PASS, "is match with the filter");
    	   Allure.step("Filter by OS is Passed");
       }else {
    	   System.out.println("The laptop filter not worked correctly");
           test.log(LogStatus.FAIL, "is not match with the filter");
           try {
       	    Thread.sleep(2000);
       	    screen.takeScreenshot();
       	    test.log(LogStatus.FAIL, "Filter by OS is Fail");
       	} catch (Exception e) {
       	    Allure.addAttachment("Valid Login Failed", e.getMessage());
    	   
       }
       
	}
}
}
