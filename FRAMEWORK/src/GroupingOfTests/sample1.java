package GroupingOfTests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 
{
	@Test(groups = {"Order"})
	public void tm1() 
	{
		Reporter.log("order 1", true);	
	}
	
	@Test(groups = {"Position"})
	public void tm2() 
	{
		Reporter.log("position 1", true);	
	}
	
	@Test(groups = {"Holdings"})
	public void tm3() 
	{
		Reporter.log("holdings 1", true);
	}
	
	

}
