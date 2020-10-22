package Screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewScreenshots 

{

	@Test
	public void Capturescreenshot()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserServers\\BrowserServers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://pimsqanew.raybiztech.com/");
		
		driver.findElement(By.xpath("//input[contains(@id,'txtStaffId')]")).sendKeys("9Y7/Y/GAT.");
		
		driver.findElement(By.xpath("//input[contains(@id,'txtStaffId')]")).sendKeys(Keys.ENTER);
		
		
		TakesScreenshot ts = (TakesScreenshot)driver; 
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		
		
		
		
		
		
	}
	
	
}
