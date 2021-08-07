package Challangaes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\FRAMEWORK\\Browser\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gofile.io/uploadFiles");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='dropZoneBtnSelect']")).sendKeys("C:\\Users\\HP\\Desktop\\fbdata.xlsx");
		
	}

}
