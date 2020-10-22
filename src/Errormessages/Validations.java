package Errormessages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Validations {
	

	WebDriver driver;
	@BeforeMethod
	public void Setup(){
		
		System.setProperty("webdriver.chrome.driver","D:\\BrowserServers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://howqanew.raybiztech.com/warrior");
		
	}
	@Test(priority = 1,groups="Title")
	
	public void PageTitle(){
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("elana@amsolutions.com.au");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ray1@3");
		driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();
		
		String actual = driver.getTitle();
		System.out.println("The title is: "+actual);
		int length = actual.length();
		System.out.println("The length is: "+length);
		
		String expected = "View Appointment";
		
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(actual, expected,"Text is matched");
		assertion.assertAll();
			
	}
	@Test(priority = 2,groups="validations")
	
	public void InvalidValidations(){
		

		driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();
		
		String actual = driver.findElement(By.xpath("//label[contains(text(),'Please enter Email ID')]")).getText();
		
		int length = actual.length();
		
		System.out.println("The length is "+length);
		
		System.out.println("The result is "+actual);
		
		String expected = "Please enter Email ID";
		
		SoftAssert assertion = new SoftAssert();
		
		assertion.assertEquals(actual, expected,"Text is not matching");
		
		assertion.assertAll();
				
		
	}
	
	@AfterMethod
	public void close(){
		driver.quit();
		
	}

}
	
	
	
	
	
	
	

