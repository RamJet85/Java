package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	@Test(priority =1)
	public void Softassert()
	{
		SoftAssert assertion = new SoftAssert();
		System.out.println("The soft assertion starts");
		assertion.assertEquals(12,	13);
		System.out.println("The soft assertion ends");
		assertion.assertAll();
		
	}
	@Test(priority=2)
	public void Hardassert()
	{
		
		System.out.println("The hard assertion starts");
		Assert.assertEquals(12,	 13);
		System.out.println("The soft assertion ends");
		

}
}
