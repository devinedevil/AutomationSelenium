package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import steps.hooks;

public class Screenshot {
    private static int i=111;
    WebDriver driver=hooks.getDriver();
	
	public void takeScreenshot() {
	    try {
	    	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(screenshot, new File("D:\\project\\Erroro"+i+".jpeg"));
            i++;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
