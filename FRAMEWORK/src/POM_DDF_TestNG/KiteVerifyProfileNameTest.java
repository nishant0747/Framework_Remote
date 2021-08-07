package POM_DDF_TestNG;

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
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteVerifyProfileNameTest 
{
	LoginPage1 login1;
	LoginPage2 login2;
	KiteHomePage home;
	Sheet sh;
	KiteProfilePage profile;
	WebDriver driver;
	AfterLogoutFirstPage changeuser;
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\SW Testing\\Data driven framework\\Test data.xlsx");
		
		sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );

		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		 login1 = new LoginPage1(driver);
		 login2 = new LoginPage2(driver);
	     home = new KiteHomePage(driver);
	     profile = new KiteProfilePage(driver);
	     changeuser = new AfterLogoutFirstPage(driver);
		
	}
	
	@BeforeMethod
	public void logintokite() 
	{
		login1.enterLoginPage1userID(sh.getRow(0).getCell(0).getStringCellValue());
		login1.enterLoginPage1password(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickLoginPage1login();
		login2.enterLoginPage2PIN(sh.getRow(0).getCell(2).getStringCellValue());
		login2.clickLoginPage2clickOnContinue();
	}
	
	@Test(priority=1)
	public void VerifyProfilePageName() throws InterruptedException 
	{
		String expPN = sh.getRow(0).getCell(0).getStringCellValue();
		
		String actPN = home.verifyKiteHomePageID();
		
		Assert.assertEquals(actPN, expPN, "Actual page name is different than expexted");
		
	}
	
	@Test(priority=2)
	public void goToOrderTab()
	{
		home.clickKiteHomePageorder();
		
	}
	
	@AfterMethod
	public void logout() throws InterruptedException 
	{
		home.clickKiteHomePageID();
		profile.clickKiteProfilePagelogout();
		Thread.sleep(1000);
		//login2.clickLoginPage2changeuser();
		changeuser.clickAfterLogoutFirstPagechangeuser();
		Thread.sleep(1000);
		
	}
	
	@AfterClass
	public void closebrowser() 
	{
		
		driver.close();
		
	}
	
	
	
	
	
	
	

}
