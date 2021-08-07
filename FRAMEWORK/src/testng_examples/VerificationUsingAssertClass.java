package testng_examples;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerificationUsingAssertClass
{

		@Test
		public void assertequal()
		{
			Reporter.log("running assertequals");
			
			String act = "Hello";
			String exp = "Hii";
			
			Assert.assertEquals(act, exp, "Both values are different");
		}
		
		@Test
		public void assertnotequal()
		{
			Reporter.log("running assertnotequal");
			
			String act = "Hello";
			String exp = "Hello1";
			
			Assert.assertNotEquals(act, exp, "Both values are same");
		}
		
		@Test
		public void asserttrue()
		{
			Reporter.log("running asserttrue");
			
			String act = "Hello";
			String exp = "Hello";
			
			Assert.assertTrue(act.equals(exp));
		}
		
		@Test
		public void assertfalse()
		{
			Reporter.log("running asserttrue");
			
			String act = "Hello";
			String exp = "Hell";
			
			Assert.assertFalse(act.equals(exp));
		}
		
		@Test
		public void assertNull()
		{
			Reporter.log("running assertnull");
			
			String c = "sjsj";
			
			Assert.assertNull(c, "Given string is not null");
		}
		
		@Test
		public void assernottNull()
		{
			Reporter.log("running assertnotnull");
			
			String c = "sjsj";
			
			Assert.assertNotNull(c,"given string is null");
		}
	

}
