package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 
{
	
	@FindBy(xpath="//input[@type='text']") private WebElement userID;
	
	@FindBy(xpath="//input[@type='password']") private WebElement password;

	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	
	
	LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterLoginPage1userID() 
	{
		userID.sendKeys("DV1510");
	}
	
	public void enterLoginPage1password() 
	{
		
		password.sendKeys("Vijay@123");
		
	}
	
	public void clickLoginPage1login()
	{
		login.click();
		
	}
	
	
}
