package TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider {
	
	WebDriver driver;
	

	@BeforeMethod
	public void SetUp(){
        System.setProperty("webdriver.chrome.driver","D:\\BrowserServers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com/");
	}
	
	@Test
	public void loginTest(){
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
