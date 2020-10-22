package TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup(){
		
		System.setProperty("webdriver.chrome.driver","D:\\BrowserServers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.co.in/");
		
	}
	@Test(priority = 1,groups="Title")
	
	public void PageTitle(){
		String str = driver.getTitle();
		System.out.println("The title is: "+str);
		
		Assert.assertEquals(str, "Google","Title is not matched");
		
		int length = str.length();
		System.out.println("The length is: "+length);
			
	}
	@Test(priority = 2,groups="Image")
	
	public void Googleimage(){
		boolean img = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println("The image is present: "+img);
		
		Assert.assertTrue(img);
	}
	@Test(priority = 3,groups="Text")
	
	public void EnterText(){
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Chiranjeevi");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		
		String st = driver.getTitle();
		
		System.out.println("title is: "+st);
	}
	
	@AfterMethod
	public void close(){
		driver.quit();
		
	}

}
