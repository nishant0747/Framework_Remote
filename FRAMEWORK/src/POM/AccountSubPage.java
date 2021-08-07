package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSubPage 
{
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement ID;
	
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;
	
	AccountSubPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAccountSubPageID() 
	{
		ID.click();
	}
	
	public void clickAccountSubPagelogout() 
	{
		
		logout.click();
		
	}

}
