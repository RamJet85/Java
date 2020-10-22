package Realtime_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample {
	
WebDriver driver;
	
	@BeforeTest
	
	public void browsersetup() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramakrishna.p\\Downloads\\chrome driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.javatpoint.com/selenium-assertions");
	}
    
	@Test
	public void VerifyTitle()
	{
		
		//actual title coming from the site
		
		String title = driver.getTitle();
		
		System.out.println("The title is "+title);
		
		int len = title.length();
		
		System.out.println("The length is "+len);
		
		//String expected_title = "Selenium Assertions - javatpoint";
		
		//Assert.assertEquals(title, expected_title);
		SoftAssert assertion = new SoftAssert();
		
		assertion.assertEquals(title, "Selenium Assertions - javatpoint");
		
		assertion.assertAll();
		
		System.out.println("Test completed");
			
	}
	
	

}


