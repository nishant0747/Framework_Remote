package testng_examples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DisableTestMethods2 
{
	
	@Test
	public void tm4() 
	{
		Reporter.log("tm4 executing");
		
	}
	
	@Test(groups = {"Position"})
	public void tm5() 
	{
		Reporter.log("tm5 executing");
		
	}
	
	@Test
	public void tm6() 
	{
		Reporter.log("tm6 executing");
		
	}

}
