package POMwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedOutPage 
{
	
	
	@FindBy(xpath="//a[text()='Change user']") private WebElement changeuser;

	LoggedOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickLoggedOutPagechangeuser() 
	{
		
		changeuser.click();
		
	}
	
}
