package Errormessages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Get_Text_Messages 
{

	@Test
	public void errormessage() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserServers\\BrowserServers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://pimsqanew.raybiztech.com/Login/Login");
		driver.findElement(By.xpath("//input[contains(@id,'txtStaffId')]")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		String actual_text = driver.findElement(By.xpath("//span[contains(@id,'StaffIdErrMsg')]")).getText();
		
		System.out.println("The text is "+actual_text);
		
		int len = actual_text.length();
		
		System.out.println("The length is "+len);
		
		String expected_title = "Please Enter Staff ID"; 
		
		System.out.println("Test started");
		
		Assert.assertEquals(actual_text, expected_title);
		
		System.out.println("Test Ended");
		
			
		
	}
	
	
}
