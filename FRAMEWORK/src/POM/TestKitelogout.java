package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestKitelogout 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		LoginPage1 login1 = new LoginPage1(driver);
		
		login1.enterLoginPage1userID();
		login1.enterLoginPage1password();
		login1.clickLoginPage1login();
		
		LoginPage2 login2 = new LoginPage2(driver);
		
		login2.enterLoginPage2PIN();
		login2.clickLoginPage2clickOnContinue();
		
		KiteHomePage verify = new KiteHomePage(driver);
		
		verify.verifyKiteHomePageID();
		
		AccountSubPage acc = new AccountSubPage(driver);
		
		acc.clickAccountSubPageID();
		acc.clickAccountSubPagelogout();
		
		Thread.sleep(1000);
		
		LoggedOutPage logout = new LoggedOutPage(driver);
		
		logout.clickLoggedOutPageChangeUser();
		
		
		
		
		
	}

}
