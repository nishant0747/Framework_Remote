package Challangaes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BASE_UTILITY.BaseClass;

public class Flipkart extends BaseClass
{
	Flipkarthome home;
	
	@BeforeClass
	public void openbrowser() throws IOException
	{
		openBrowser();
		
		home = new Flipkarthome(driver);	
	}
	
	@Test
	public void iphone () 
	{
		home.clickFlipkarthomeloginboxcross();
		home.enterFlipkarthometext();
		home.clickFlipkarthomesearchbutton();
		
	}
	
	
}
	
	


