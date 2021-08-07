package BASE_UTILITY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement ID;
	
	@FindBy(xpath="//a[@href='/orders']") private WebElement order;
	
	KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyKiteHomePageID() 
	{
		String id = ID.getText();
		System.out.println(id);
		
		return id;
	}
	
	public void clickKiteHomePageID() 
	{
		ID.click();
		
	}
	
	public void clickKiteHomePageorder() 
	{
		
		order.click();
		
	}


}
