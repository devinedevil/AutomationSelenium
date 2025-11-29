package steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks 
{
	
	// reusable file for @Before and @After
	public static WebDriver driver ;
	
	@Before
	public void launchingBrowser()
	{
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.advantageonlineshopping.com/#/");

	}
	
	public static WebDriver getDriver() 
	{
		return driver;
	}

	@After
	public void closeBrowser() throws InterruptedException
	{	Thread.sleep(2000);
		driver.quit();
		
	}
}
