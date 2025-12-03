package steps;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import pageObject.LaptopPage;
import utilities.Screenshot;
import utilities.reportGenerator;

public class testcase_processor extends reportGenerator {
    LaptopPage lap = new LaptopPage();
    WebDriver driver = hooks.getDriver();
    Screenshot screen=new Screenshot();
    
    @When("the user filter the laptops by the processor")
    public void the_user_filter_the_laptops_by_the_processor() {
    	test=extent.startTest("Processor filter test");
        lap.selectProcessor();
    }

    @Then("the displayed laptops should have in selected processor")
    public void the_displayed_laptops_should_have_in_selected_processor() {

        boolean isCorrect = lap.validateProcessorResults();
        assertTrue(isCorrect, "Laptop processor results match the selected filter!");
        
        if (isCorrect) {
            System.out.println("The processor filter worked correctly");
            test.log(LogStatus.PASS, "Results match the selected processor");
            Allure.step("The processor filter worked correctly");
        } else {
            System.out.println("The processor filter did not work correctly");
            test.log(LogStatus.FAIL, "Results do not match the selected processor");
            try {
        	    Thread.sleep(2000);
        	    screen.takeScreenshot();
        	    test.log(LogStatus.FAIL, "Test1 is Fail");
        	} catch (Exception e) {
        	    Allure.addAttachment("Valid Login Failed", e.getMessage());
        }
    }
    }
    
}