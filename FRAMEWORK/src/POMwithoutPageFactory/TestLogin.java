package POMwithoutPageFactory;

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

public class TestLogin 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\SW Testing\\Data driven framework\\Test data.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		kiteLogin1 login1 = new kiteLogin1(driver);
		
		String un = sh.getRow(0).getCell(0).getStringCellValue();
		
		login1.enterusername(un);
		
		String pass = sh.getRow(0).getCell(1).getStringCellValue();
		login1.enterpassword(pass);
		login1.clickonlogin();
		
		kiteLogin2 login2 = new kiteLogin2(driver);
		
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		login2.enterpin(pin);
		login2.clickoncont();
		
		
	}

}
