package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class alertPOM 
{
	
	@FindBy(xpath = "(//button[text()='Click me!'])[1]") private WebElement first;
	
	
	
	alertPOM (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void click1()
	{
		first.click();
	}

	
}
