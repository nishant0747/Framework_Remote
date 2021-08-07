package testng_examples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipATest 
{
	@Test(timeOut = 2000)
	public void test1() throws InterruptedException 
	{
		Thread.sleep(3000);
		Reporter.log("test1 completed", true);		
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2() 
	{
		
		Reporter.log("test2 completed", true);		
	}
	
	@Test
	public void test3() 
	{
		
		Reporter.log("test3 completed", true);		
	}
	

}
