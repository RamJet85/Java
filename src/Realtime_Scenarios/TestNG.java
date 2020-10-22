package Realtime_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void browsersetup() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramakrishna.p\\Downloads\\chrome driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		}
	
	@Test
	
	public void searchfunctionality() {
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("chiranjeevi");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
	}
	

}
