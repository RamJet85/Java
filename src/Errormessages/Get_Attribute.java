package Errormessages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Get_Attribute 
{

	@Test
	public void Validation() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\BrowserServers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://pimsqanew.raybiztech.com/Login/Login");
		driver.findElement(By.xpath("//input[contains(@id,'txtStaffId')]")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		String actual_text = driver.findElement(By.xpath("//span[contains(@id,'StaffIdErrMsg')]")).getAttribute("innerHTML");
		
		System.out.println("The text is "+actual_text);
		
		int len = actual_text.length();
		
		System.out.println("The length is "+len);
		
		String expected_title = "Please Enter Staff ID"; 
		
		
		SoftAssert assertion = new SoftAssert();
		
		assertion.assertEquals(actual_text, expected_title,"Text_is matching");
		
		assertion.assertAll();
		
		
				
	}
		
}
		

		
	
		
		
		
		
		
		
	
	
	

