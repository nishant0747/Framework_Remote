package testng_examples;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerificationUsingSoftAssert 
{
	@Test
	public void test()
	{
		
		String s1 = "hello";
		String s2 = "hii";
		boolean b = false;
		
		SoftAssert st = new SoftAssert();
		
		st.assertTrue(b);
		
		st.assertEquals(s1, s2, "Given values are not equal");
		Reporter.log("step1 completed", true);
		
		st.assertNotNull(s2, "Given object is null");
		Reporter.log("step2 completed", true);
		
		st.assertFalse(s1.equals(s2), "Given values are same");
		Reporter.log("step3 completed", true);
		
		st.assertAll();
		
	}

}
