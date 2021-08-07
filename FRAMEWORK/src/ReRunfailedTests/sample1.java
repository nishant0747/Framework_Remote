package ReRunfailedTests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 

{
	
	@Test
	public void TC1()
	{
		Reporter.log("TC1 executed");
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("TC2 executed");
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("TC3 executed");
		//Assert.fail();
	}

}
