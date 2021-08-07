package ObjRepo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass 
{
	
	public static void main(String[] ad) throws IOException 
	{
		Properties pro = new Properties();
		
		InputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\FRAMEWORK\\Configuration\\config.properties");

			pro.load(file);

		    System.out.println(pro.getProperty("chromepath"));
		   
		 
		   WebDriver driver = new ChromeDriver();	   
		   
		   driver.get("https://kite.zerodha.com/");
	}
	


}
