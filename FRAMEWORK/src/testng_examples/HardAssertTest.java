package testng_examples;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertTest 

{
	
	@Test
	public void test1() 
	{
		boolean a = true;
		Reporter.log("executing test1", true);
		
		Assert.assertFalse(a);
		
		Reporter.log("executed test1", true);
		
	}

	
	@Test
	public void test2() 
	{
	
		Reporter.log("executing test2", true);
		
	}
}
