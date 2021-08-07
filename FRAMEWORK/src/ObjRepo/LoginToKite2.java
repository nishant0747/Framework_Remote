package ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToKite2 
{
	
	@FindBy(xpath="//input[@type='password']") private WebElement PIN;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement clickoncont;
	
	public LoginToKite2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterLoginToKite2PIN() 
	{
		
		PIN.sendKeys("959594");
		
	}
	
	public void clickLoginToKite2clickoncont() 
	{
		
		clickoncont.click();
		
	}
	
	
	
	
	

}
