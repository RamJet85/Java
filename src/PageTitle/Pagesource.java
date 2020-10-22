package PageTitle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Pagesource {
	
	@Test
	public void pagesource()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramakrishna.p\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://pimsqanew.raybiztech.com/");
		
		driver.findElement(By.xpath("//input[contains(@id,'txtStaffId')]")).sendKeys("9Y7/Y/GAT.");
		
		driver.findElement(By.xpath("//input[contains(@id,'txtStaffId')]")).sendKeys(Keys.ENTER);
		
		String page_source = driver.getPageSource();
		
		System.out.println("The title is "+page_source);
		
		System.out.println("Searching for the title");
		
		Assert.assertTrue(page_source.contains("DASHBOARD"));
		
		System.out.println("The title has been found");
		
	}

}
