package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class reportGenerator 
{
	public static ExtentReports extent;
	public static ExtentTest test;
  
 @BeforeSuite 
 public void startReport() {  
/*	static*/
	
		extent = new ExtentReports("D:\\project\\report.html", true);
  }

  @AfterSuite
  public void endReport() 
  {
	  extent.flush();
  }

}
