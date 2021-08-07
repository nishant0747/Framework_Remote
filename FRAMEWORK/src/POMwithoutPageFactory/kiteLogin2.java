package POMwithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class kiteLogin2 
{
	
	WebDriver driver;
	
	By pin = By.xpath("//input[@id='pin']");
	
	By cont = By.xpath("//button[@type='submit']");
	
	public kiteLogin2(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterpin(String PIN) 
	
	{
		driver.findElement(pin).sendKeys(PIN);
		
	}
	
	public void clickoncont() 
	{
		
		driver.findElement(cont).click();
		
	}
	
	

}
