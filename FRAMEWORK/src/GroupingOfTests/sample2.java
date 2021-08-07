package GroupingOfTests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample2
{
	
	@Test(groups = {"Position"})
	public void tm4() 
	{
		
		Reporter.log("position 2", true);
		
	}
	
	@Test(groups = {"Holdings"})
	public void tm5() 
	{
		
		Reporter.log("holdings 2", true);
		
	}
	
	@Test(groups = {"Order"})
	public void tm6() 
	{
		
		Reporter.log("order 2", true);
		
	}
	
	@Test(groups = {"Order"})
	public void tm7() 
	{
		
		Reporter.log("order 3", true);
		
	}
	

}
