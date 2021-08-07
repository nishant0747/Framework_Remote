package BASE_UTILITY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterLogoutFirstPage 
{
	@FindBy(xpath="//a[text()='Change user']") private WebElement clickOnChangeUser;

	public AfterLogoutFirstPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickAfterLogoutFirstPagechangeuser() 
	{
		
		clickOnChangeUser.click();
	}
	
}
