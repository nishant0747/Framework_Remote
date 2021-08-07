package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\SW Testing\\Data driven framework\\Test data.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/#loggedout");
		
		String userID = sh.getRow(0).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(userID);
		
		String passw = sh.getRow(0).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(passw);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	

}
