package ObjRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToKite1 
{
	
	@FindBy(xpath="//input[@type='text']") private WebElement username;
	
	@FindBy(xpath="//input[@type='text']") private WebElement password;
	
	@FindBy(xpath="//input[@type='text']") private WebElement login;
	
	public LoginToKite1(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterLoginToKite1username() 
	{
		
		username.sendKeys("DV1510");
		
	}
	
	public void enterLoginToKite1password() 
	{
		username.sendKeys("Vijay@123");
		
	}
	
	public void clickLoginToKite1login() 
	{
		
		login.click();
		
	}

}
