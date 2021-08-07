package testng_examples;

import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample1 
{
	@BeforeSuite
	public void openbrowser()
	{
		Reporter.log("open browser", true);
	}
	
	@BeforeTest
	public void login() 
	{
		
		Reporter.log("logged in", true);
	}
	
	@Test
	public void TC1() 
	{
		
		Reporter.log("running TC1", true);
		
	}
	
	@Test
	public void TC2() 
	{
		
		Reporter.log("running TC2", true);
		
	}

	@Test
	public void TC3() 
	{
		
		Reporter.log("running TC3", true);
		
	}


}
