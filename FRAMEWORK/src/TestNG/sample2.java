package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample2 
{
	@Test(priority=3)
	public void TC4() 
	{
		
		Reporter.log("running TC4", true);
		
	}
	
	@Test(priority=4)
	public void TC5() 
	{
		
		Reporter.log("running TC5", true);
		
	}
	
	@Test(priority=5)
	public void TC6() 
	{
		
		Reporter.log("running TC6", true);
		
	}
	
	@Test(priority= 6)
	public void TC7() 
	{
		
		Reporter.log("running TC7", true);
		
	}





}
