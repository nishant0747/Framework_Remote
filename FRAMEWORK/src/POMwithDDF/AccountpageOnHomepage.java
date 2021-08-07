package POMwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountpageOnHomepage
{
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement Myaccount;
	
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;
	
	AccountpageOnHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAccountpageOnHomepageID() 
	{
		Myaccount.click();
		
	}
	
	public void clickAccountpageOnHomepagelogout() 
	{
		
		logout.click();
		
	}

}
