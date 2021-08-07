package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeywords1 
{
	@Test(dependsOnMethods="TC2")
	public void AC1() 
	{
		System.out.println("test1 executed");
		
	}
	
	@Test(dependsOnMethods= {"TC2","AC1"})
	public void TC3() 
	{
		System.out.println("test3 executed");	
	}

	
	@Test
	public void TC2() 
	{
		System.out.println("test2 executed");
		
	}
	
	@Test(timeOut=5000, priority = 1)
	public void TC4() throws InterruptedException
	{
		Thread.sleep(4000);
		
		Reporter.log("test4 executed", true);
		
	}
	

	
}
