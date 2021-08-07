package BASE_UTILITY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 
{
	
	@FindBy(xpath="//input[@type='text']") private WebElement userID;
	
	@FindBy(xpath="//input[@type='password']") private WebElement password;

	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	
	
	public LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement enterLoginPage1userID(String UID) 
	{
		userID.sendKeys(UID);
		return userID;
	}
	
	public void enterLoginPage1password(String pwd) 
	{
		
		password.sendKeys(pwd);
		
	}
	
	public void clickLoginPage1login()
	{
		login.click();
		
	}



		
	}
	
	

