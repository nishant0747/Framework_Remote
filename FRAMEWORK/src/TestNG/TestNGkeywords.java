package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGkeywords 

{
	@BeforeSuite
	public void openbrowser() 
	{
		
		Reporter.log("browser opened", true);	
	}
	
	@BeforeTest
	public void openwebsite() 
	{
		Reporter.log("website opened", true);
		
	}
	
	@BeforeClass
	public void login() 
	{
		
		Reporter.log("Login done", true);
		
	}
	
	@Test(priority=-3, invocationCount= 4, enabled=true)
	public void additemtocart() 
	{
		Reporter.log("item added to cart", true);
		
	}
	
	@Test(enabled=false)
	public void buyselecteditems() 
	{
		Reporter.log("checked-out selected items", true);
	}
	
	@Test (priority=0)
	public void selectpaymentmethod() 
	{
		Reporter.log("payment method selected", true);
	}
	
	@Test (priority=1)
	public void placeorder() 
	{
		Reporter.log("order placed", true);
	}
	
	@Test (priority=5)
	public void logout() 
	{
		Reporter.log("logged out", true);
	}
	
	@AfterTest 
	public void closebrowser() 
	{
		Reporter.log("browser closed", true);
	}
	

	
}
