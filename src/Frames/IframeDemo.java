package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeDemo {
	
	@Test
	public void Iframetest()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserServers\\Browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		
		List<WebElement>Total_frames = driver.findElements(By.tagName("iframe"));
		
		System.out.println("The total frames are "+Total_frames.size());
		
		
		WebElement my_frame = driver.findElement(By.xpath("//div[@id='content-wrapper']"));
		
		driver.switchTo().frame(my_frame);
		
			
		
	}

}
