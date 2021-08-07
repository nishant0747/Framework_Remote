package POMwithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestKiteLogin 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\SW Testing\\Data driven framework\\Test data.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		LoginPage1 login1 = new LoginPage1(driver);
		
		String userID = sh.getRow(0).getCell(0).getStringCellValue();
		login1.enterLoginPage1userID(userID);
		
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		login1.enterLoginPage1password(password);
		
		login1.clickLoginPage1login();
		
		Thread.sleep(1000);
		LoginPage2 login2 = new LoginPage2(driver);
		
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		login2.enterLoginPage2PIN(pin);
		login2.clickLoginPage2clickOnContinue();
		
		Thread.sleep(1000);
		KiteHomePage verify = new KiteHomePage(driver);
		
		String exp = sh.getRow(0).getCell(0).getStringCellValue();
		verify.verifyKiteHomePageID(exp);
		
		Thread.sleep(1000);
		AccountpageOnHomepage logout = new AccountpageOnHomepage(driver);
		
		logout.clickAccountpageOnHomepageID();
		logout.clickAccountpageOnHomepagelogout();
		
		Thread.sleep(1000);
		LoggedOutPage mainloginpage = new LoggedOutPage(driver);
		
		mainloginpage.clickLoggedOutPagechangeuser();
		
		
		
		
	}

}
