package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts {
	
	
	@Test
	public void assertion()
	{
		
		Assert.assertEquals("Ram", "Krishna","The actual & expected result does not match");
		
		
		
	}

}
