package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 
{
	
	@FindBy(xpath="//input[@type='text']") private WebElement userID;
	
	@FindBy(xpath="//input[@type='password']") private WebElement password;
	
	// @FindBy(xpath="//button[@type='submit']") private WebElement login;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']") private WebElement login;
	
	
	KiteLoginPage1(WebDriver driver)
	{
		//WebDriver driver = null;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterKiteLoginPage1userID() 
	{
		userID.sendKeys("DV1510");
	}
	
	public void enterKiteLoginPage1password() 
	{
		password.sendKeys("Vijay@123");
		
	}
	
	public void clickKiteLoginPage1login() 
	{
		login.click();
	}
	

}
