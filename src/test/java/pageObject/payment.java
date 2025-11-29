package pageObject;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import steps.hooks;

import java.time.Duration;

public class payment {

      public WebDriver driver=hooks.getDriver();
      loginpage login=new loginpage();
      
    
      
    public void laptop() throws InterruptedException 
  	{    
    	login.
    	driver.findElement(By.cssSelector("svg#menuUser > path#menuUserSVGPath")).click();
    	login.enterMail("priyadharsh");
    	login.enterPassword("Priya@123");
    	login.clickrememberme();
    	login.clickLogin();
    	Thread.sleep(2000);
    	driver.findElement(By.id("laptopsImg")).click();
  	}
  	
  	public void selectlaptop()
  	{
  		driver.findElement(By.xpath("//img[@class='imgProduct']")).click();
  	}
  	public void Addcart()
  	{
  		driver.findElement(By.name("save_to_cart")).click();
  	}
  	public void Clickmenucart()
  	{
  		driver.findElement(By.id("menuCart")).click();   
  	}
  	public int menucart()
  	{
        String count = driver.findElement(By.id("menuCart")).getText();        
        if (count.trim().isEmpty()) {
            return 0;
        }
        return Integer.parseInt(count);
    }
  	public void checkout()
  	{
  		driver.findElement(By.id("checkOutButton")).click();
  	}
  	public void nextbutton()
  	{
  		driver.findElement(By.id("next_btn")).click();
  	}
  	public void saypay()
  	{
  		driver.findElement(By.name("safepay")).click();
  	}
  	public void username_pay(String s)
  	{
  		driver.findElement(By.name("safepay_username")).sendKeys(s);
  	}
  	public void userpass_pay(String p)
  	{
  		driver.findElement(By.name("safepay_password")).sendKeys(p);
  	}
  	
  	public void payment()
  	{
  		driver.findElement(By.id("pay_now_btn_SAFEPAY")).click();
  	}
  	
}