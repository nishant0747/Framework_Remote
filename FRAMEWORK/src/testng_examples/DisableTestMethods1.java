package testng_examples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DisableTestMethods1
{
	@Test(groups = {"Position"})
	public void tm1() 
	{
		Reporter.log("tm1 executing");	
	}
	
	@Test
	public void tm2() 
	{
		Reporter.log("tm2 executing");
		
	}
	
	@Test
	public void tm3() 
	{
		Reporter.log("tm3 executing");
		
	}
	

}
