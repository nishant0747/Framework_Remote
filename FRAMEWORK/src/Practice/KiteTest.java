package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTest 
{
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://kite.zerodha.com/");
		
		KiteLoginPage1 loginpage1 = new KiteLoginPage1(driver);
		
		loginpage1.enterKiteLoginPage1userID();
		
		loginpage1.enterKiteLoginPage1password();
		
		loginpage1.clickKiteLoginPage1login();
		
		KiteLoginPage2 loginpage2 = new KiteLoginPage2(driver);
		
		loginpage2.enterKiteLoginPage2PIN();
		
		loginpage2.clickKiteLoginPage2button();
		
		
		
	}

}
