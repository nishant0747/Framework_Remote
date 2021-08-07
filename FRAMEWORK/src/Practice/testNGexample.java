package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNGexample 
{
	
	@Test 
	public void m1() 
	{
	//	System.out.println("m1 is running");
		
		Reporter.log("m1 is running");
		
	}
	
	@Test
	public void m2() 
	{
		//System.out.println("m2 is running");
		Reporter.log("m2 is running");
		
	}

}
