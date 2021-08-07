package BASE_UTILITY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{
	protected static WebDriver driver;
	public static void openBrowser () throws IOException 
	{

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\FRAMEWORK\\Browser\\chromedriver.exe" );

		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		
	}

}
