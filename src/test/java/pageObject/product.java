package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import steps.hooks;

public class product {
	 WebDriver driver=hooks.getDriver();
     loginpage login;
     
   
 	public void selectlaptop()
 	{
 		driver.findElement(By.xpath("//img[@class='imgProduct']")).click();
 	}
 	public void hpLap()
 	{
 		driver.findElement(By.xpath("//img[@src='/catalog/fetchImage?image_id=1245']")).click();
 	}
 	public void emptyLap()
 	{
 		driver.findElement(By.id("223")).click();
 	}

 	public boolean isProductDetailsDisplayed() {
 	    try {
 	        boolean name = driver.findElement(By.xpath("//h1[@class='roboto-regular screen768 ng-binding']")).isDisplayed();
 	        boolean image = driver.findElement(By.id("mainImg")).isDisplayed();
 	        boolean price = driver.findElement(By.xpath("//h2[@class='roboto-thin screen768 ng-binding']")).isDisplayed(); 
 	        boolean description = driver.findElement(By.xpath("//p[@class='roboto-light ng-binding']")).isDisplayed();

 	        return name && image && price && description; 
 	    } catch (Exception e) {
 	        return false; 
 	    }
 	}
 	public boolean isNoProductDetailsDisplayed() {
	 	    try {
	 	         WebElement name = driver.findElement(By.xpath("//h1[@class='roboto-regular screen768 ng-binding']"));
	 	         WebElement price = driver.findElement(By.xpath("//h2[@class='roboto-thin screen768 ng-binding']")); 
	 	         WebElement description = driver.findElement(By.xpath("//p[@class='roboto-light ng-binding']"));

	 	        return name.isDisplayed()  && price.isDisplayed() && description.isDisplayed(); 
	 	    } catch (Exception e) {
	 	        return false; 
	 	    }

}
}