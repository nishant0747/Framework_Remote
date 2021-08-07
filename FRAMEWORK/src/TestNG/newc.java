package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class newc 
{

	@Test 
	public void test2() 
	{		
		Reporter.log("test2 completed", true);
		
	}
	
	@Test(timeOut= 6000) 
	public void test1() throws InterruptedException 
	{
		Thread.sleep(7000);
		
		Reporter.log("test1 completed", true);
	
	}
	
	@Test (dependsOnMethods = {"test1","test2"})
	public void test3() 
	{
		
		Reporter.log("test3 completed", true);
		
	}
	
	

}
