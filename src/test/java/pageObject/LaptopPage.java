package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import steps.hooks;

public class LaptopPage {
	String osname;
    WebDriver driver=hooks.getDriver();
    
    public void selectOS(String osType) throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"accordionAttrib1\"]")).click();
    	
    	switch(osType) {
    		case ("Windows 10"):
    			driver.findElement(By.id("operating_system_1")).click();
    			break;
    		case ("Chrome OS"):
    			driver.findElement(By.id("operating_system_0")).click();
    			break;
    		case ("Windows 7 Professional 64"):
    			driver.findElement(By.id("operating_system_2")).click();
    			break;
    		case ("Windows 8.1"):
    			driver.findElement(By.id("operating_system_3")).click();
    			break;
    			}

    	Thread.sleep(2000);
    	osname=osType;
    }


    public boolean validateOSResults() {
       WebElement products = driver.findElement(By.xpath("/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li[1]"));
        if (products==null) {
            System.out.println("No products found after applying filter!");
            return false;
        }
        products.click();
        driver.findElement(By.xpath("//*[contains(text(),"+"\'"+osname+"\'"+")]"));
        return true;
    }
    


    public void selectProcessor() {
    	driver.findElement(By.id("laptopsImg")).click();
    	driver.findElement(By.xpath("//*[@id=\"accordionAttrib2\"]")).click();
    	
    	for (int i = 0; i < 9; i++) {
    	    String xpath = "//input[contains(@id, 'processor_" + i + "')]";
    	    WebElement checkbox = driver.findElement(By.xpath(xpath));
    	    checkbox.click();
    	}
    	
       
       

}

public boolean validateProcessorResults() {
    	    boolean allResultsMatch = true;
    	    
    
    	    for (int i = 0; i < 9; i++) {
    	 
    	        String xpath = "//input[contains(@id, 'processor_" + i + "')]";
    	        WebElement checkbox = driver.findElement(By.xpath(xpath));
  
    	        if (!checkbox.isSelected()) {
    	            checkbox.click();
    	        }
    	        

    	        try {
    	            Thread.sleep(1000); 
    	        } catch (InterruptedException e) {
    	            e.printStackTrace();
    	        }
    	        
    	
    	        WebElement product = driver.findElement(By.xpath("/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li[1]"));
    	        
    	        if (product == null) {
    	            System.out.println("No products found for processor " + i);
    	            allResultsMatch = false;
    	            break; 
    	        }
    	        
    	       
    	        WebElement processorLabel = driver.findElement(By.xpath("//*[contains(text(),'Processor_" + i + "')]"));
    	        
    	        if (processorLabel == null) {
    	            System.out.println("No products with processor " + i + " in the results!");
    	            allResultsMatch = false;
    	            break;
    	        }
    	    }
    	    
    	    return allResultsMatch;
    	}

    
   
}


    	
    	
    	
    

