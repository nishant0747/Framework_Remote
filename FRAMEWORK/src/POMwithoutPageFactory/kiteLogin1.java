package POMwithoutPageFactory;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class kiteLogin1 
{
	
	WebDriver driver;
	
	By username = By.xpath("//input[@type='text']");
	
	By password = By.xpath("//input[@type='password']");
	
	By login = By.xpath("//button[@type='submit']");
	
	public kiteLogin1(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterusername(String un) 
	{
		driver.findElement(username).sendKeys(un);
	}
	
	public void enterpassword(String pass) 
	{
		driver.findElement(password).sendKeys(pass);
		
	}
	
	public void clickonlogin() 
	{
		driver.findElement(login).click();
		
	}
	

}
