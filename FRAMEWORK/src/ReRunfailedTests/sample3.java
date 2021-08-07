package ReRunfailedTests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample3 
{
	
	@Test
	public void TC7()
	{
		Reporter.log("TC7 executed");
	}
	
	@Test
	public void TC8()
	{
		Reporter.log("TC8 executed");
		Assert.fail();
	}
	
	@Test
	public void TC9()
	{
		Reporter.log("TC9 executed");
	}
	
	@Test
	public void TC10()
	{
		Reporter.log("TC10 executed");
		//Assert.fail();
	}

}
