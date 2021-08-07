package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class concept 
{
	@Test
	public void m1() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.via.com/bus-tickets/shree-ganesh-travels-buses-from-thane-to-tasgaon");
	}

}
