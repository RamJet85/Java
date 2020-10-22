package Conditionalstatements;

public class IfElseIFdemo {

	public static void main(String[] args) {


		System.out.println("Test Started");
		
		String browser = "Safari";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test case executed in chrome");
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test case executed in firefox");
		}
		
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.out.println("Test case executed in IE");
		}
		
		else
		{
			System.out.println("Please provide browser names");
		}
		
		System.out.println("Test end");
	}
	

}
