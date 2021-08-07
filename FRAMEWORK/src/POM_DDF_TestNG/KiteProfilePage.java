package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteProfilePage
{
	
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;
	
	public KiteProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickKiteProfilePagelogout() 
	{
		
		logout.click();
		
	}

	
}
