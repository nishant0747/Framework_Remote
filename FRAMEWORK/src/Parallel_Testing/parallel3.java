package Parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel3 
{
	
	@Test
	public void openbrowser() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		
		driver.close();
		
	}
	

}
