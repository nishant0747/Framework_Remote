package testng_examples;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class sample3 
{
	@Test
	public void TC8() 
	{
		
		Reporter.log("running TC8", true);
	
	}

	@Test(enabled = false)
	public void TC9() 
	{
		
		Reporter.log("running TC9", true);
		
	}
	
	@Test
	public void TC10() 
	{
		
		Reporter.log("running TC10", true);
		
	}
	
	@AfterTest
	public void logout() 
	{
		
		Reporter.log("logged out", true);
	}
	
	@AfterSuite
	public void closebrowser()
	{
		Reporter.log("close browser", true);
	}
	
	



}
