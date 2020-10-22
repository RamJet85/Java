package TestNGDemo;

import org.testng.annotations.Test;

public class TestNG {
	
	@Test(priority=1,description="Login functionality")
	public void login(){
		
		String name;
		
		name ="Ram";
		
		//System.out.println(name.length());
		
		int size =name.length();
		
		System.out.println("The length is "+size);
		 
		boolean val = name.startsWith("Krishna");
		
		System.out.println("The value is "+val);
			
	}
	
	@Test(priority=2,description="Homepage functionality")
	public void Homepage(){
		
		String actual,expected;
		
		actual = "Test Passed";
		
		expected ="Test Failed Smoke";
		
		boolean actvsexp = actual.equalsIgnoreCase(expected);
		
		int size = actual.length();
		
		int size1 = expected.length();
		
		System.out.println("The length of size is "+size);
		
		System.out.println("The length of size is "+size1);
		
		System.out.println("The correct value is "+actvsexp);
		
		
	}

}
