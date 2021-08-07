package POMwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement ID;
	
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;
	
	KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyKiteHomePageID(String exp) 
	{
		String id = ID.getText();
		System.out.println(id);
		
		if(id.equals(exp))
		{
			System.out.println("ID verified successfully");
		}
		else
		{
			System.out.println("ID verification failed");
		}	
		
	}


}
