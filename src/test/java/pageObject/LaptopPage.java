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
    	driver.findElement(By.id("processor_7")).click();
    	
    	
       
       

}

public boolean validateProcessorResults() {
	
	String process="Intel® Core™ i7-5500U with Intel HD Graphics 5500 (2.4 GHz, 4 MB cache, 2 cores)";
	 WebElement products = driver.findElement(By.xpath("/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li[1]"));
	 if (products==null) {
         System.out.println("No products found after applying filter!");
         return false;
     }
     products.click();
     
     driver.findElement(By.xpath("//*[contains(text(),"+"\'"+process+"\'"+")]"));
     return true;
    	}

    
   
}


    	
    	
    	
    

