package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserServers\\BrowserServers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		List<WebElement> Items = driver.findElements(By.xpath("//td[text()='Manager']/preceding-sibling::td[4]"));
		for(WebElement ele:Items)
		{
			ele.click();
			
			
		}
		
	}

}
