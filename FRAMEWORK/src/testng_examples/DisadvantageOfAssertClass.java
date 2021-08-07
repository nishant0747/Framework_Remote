package testng_examples;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DisadvantageOfAssertClass 
{
	@Test
	public void TestforAssertClass() 
	{
		
		String s1 = "Hello";
		String s2 = "hii";
		boolean b = true;
		
		//verification1
		Assert.assertNotEquals(s1, s2, "Both values are equal");
		Reporter.log("first assertion executed", true);
		
		Assert.assertNull(s2, "Given value is not null");
		
		//verification3
		Assert.assertTrue(b, "given result is false");
		Reporter.log("last assertion executed", true);
		
	}

}
