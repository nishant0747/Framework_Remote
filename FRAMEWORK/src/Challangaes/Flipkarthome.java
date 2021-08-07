package Challangaes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkarthome 
{
	
	@FindBy(xpath="//input[@type='text']") private WebElement text;
	
	@FindBy(xpath="//button[@class='L0Z3Pu']") private WebElement searchbutton;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")  private WebElement cross;
	
	public Flipkarthome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterFlipkarthometext() 
	{
		text.sendKeys("iphone");
	}
	
	public void clickFlipkarthomesearchbutton() 
	{
		
		searchbutton.click();
		
	}
	
	public void clickFlipkarthomeloginboxcross() 
	{
		
		cross.click();
		
	}
	
	
	
	
	

}
