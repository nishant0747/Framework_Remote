package Parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class p1 
{
	WebDriver driver;
	@Test
	public void tm1() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );

		driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
	}
	

	
	

}
