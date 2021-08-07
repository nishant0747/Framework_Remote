package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 
{
	
	@FindBy(id="pin") private WebElement PIN;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement clickOnContinue;

	public LoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterLoginPage2PIN(String pinno) 
	{
		PIN.sendKeys(pinno);
	}
	
	public void clickLoginPage2clickOnContinue() 
	{
		clickOnContinue.click();
	}
	


	
	
}
