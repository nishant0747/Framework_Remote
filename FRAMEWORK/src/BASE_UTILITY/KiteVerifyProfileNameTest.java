package BASE_UTILITY;

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
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteVerifyProfileNameTest extends BaseClass
{
	LoginPage1 login1;
	LoginPage2 login2;
	KiteHomePage home;
	Sheet sh;
	KiteProfilePage profile;
	AfterLogoutFirstPage changeuser;
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException 
	{

		openBrowser();

		 login1 = new LoginPage1(driver);
		 login2 = new LoginPage2(driver);
	     home = new KiteHomePage(driver);
	     profile = new KiteProfilePage(driver);
	     changeuser = new AfterLogoutFirstPage(driver);
		
	}
	
	@BeforeMethod
	public void logintokite() throws EncryptedDocumentException, IOException 
	{
		login1.enterLoginPage1userID(UtilityClass.getvalue(0, 0));
		login1.enterLoginPage1password(UtilityClass.getvalue(0, 1));
		login1.clickLoginPage1login();
		login2.enterLoginPage2PIN(UtilityClass.getvalue(0, 2));
		login2.clickLoginPage2clickOnContinue();
	}
	
	@Test(priority=1)
	public void VerifyProfilePageName() throws InterruptedException, EncryptedDocumentException, IOException 
	{
	
		String expPN = UtilityClass.getvalue(0, 0);
		
		String actPN = home.verifyKiteHomePageID();
		
		Assert.assertEquals(actPN, expPN, "Actual page name is different than expexted");
		
	}
	
	@Test(priority=2)
	public void goToOrderTab() throws IOException
	{
		home.clickKiteHomePageorder();
		
	}
	
	@AfterMethod
	public void logout(ITestResult result) throws InterruptedException, IOException 
	{
		int TCID = 103;
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureScreenshot(driver, TCID);
		}
		
		
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
