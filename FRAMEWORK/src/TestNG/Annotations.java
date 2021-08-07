package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	@BeforeClass
	public void clearcache() 
	{
	 Reporter.log("clear cache files in browser", true);
		
	}
	
	@BeforeTest
	public void openbrowser() 
	{
		Reporter.log("open the browser", true);
	}
	
	@BeforeMethod
	public void login() 
	{
		Reporter.log("login to website", true);
	}
	
	@Test
	public void test1() 
	{
		
		Reporter.log("test1 executed", true);
		
	}
	
	@Test
	public void test2() 
	{
		
		Reporter.log("test2 executed", true);
		
	}
	
	@Test
	public void test3() 
	{
		
		Reporter.log("test3 executed", true);
	}
	
	@AfterMethod
	public void verifyresult() 
	{
		Reporter.log("verify result", true);
	}
	
	@AfterClass
	public void logout() 
	{
		
		Reporter.log("logout from account", true);
	}
	
	
	@AfterTest
	public void cloasebrowser() 
	{
		
		Reporter.log("close the browser", true);
		
	}

}
