package Challangaes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Population 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\FRAMEWORK\\Browser\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.worldometers.info/world-population/");
		
		Thread.sleep(1000);
		
		try
		{
			String curpop = driver.findElement(By.xpath("//span[contains(@rel,'current_population')]/span[contains(@class,'rts-nr-int')]")).getText();
			
			System.out.println(curpop);
		}
		
		catch(Exception w)
		{
			
			String curpop = driver.findElement(By.xpath("//span[contains(@rel,'current_population')]/span[contains(@class,'rts-nr-int')]")).getText();
			
			System.out.println(curpop);
		}
		
		

		
	}

}
