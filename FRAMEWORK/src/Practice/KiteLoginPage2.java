package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage2 
{
	
	@FindBy(id="pin") private WebElement PIN;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement button;
	
	
	KiteLoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterKiteLoginPage2PIN() 
	{
		PIN.sendKeys("959594");
		
	}
	
	public void clickKiteLoginPage2button() 
	{
		
		button.click();
		
	}

}
