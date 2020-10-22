package Frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FrameHandling {
	
	@Test
	
	public void HandleIframes() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "D:\\BrowserServers\\Browsers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://ui.freecrm.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	
	WebElement ele1 = driver.findElement(By.xpath("//input[@placeholder='E-mail address']"));
	ele1.clear();
	ele1.sendKeys("nani290993@gmail.com");
	
	
	WebElement ele2 = driver.findElement(By.xpath("//input[@type='password']"));
	ele2.clear();
	ele2.sendKeys("Naidu@10");
	
	WebElement ele3 = driver.findElement(By.xpath("//div[text()='Login']"));
	ele3.click();
	
	System.out.println("Asserion started");
	String title = driver.getTitle();
	System.out.println("The title is "+title);
	
	int len = title.length();
	
	System.out.println("The length is "+len);
	
	SoftAssert assertion = new SoftAssert();
	
	assertion.assertEquals(title, "CRM", "Both Texts are matching");
	
	assertion.assertAll();
	System.out.println("Asserion ends");
	
	Thread.sleep(2000);
	
	List<WebElement> elements = driver.findElements(By.tagName("iframe"));
	
	int numberOfTags = elements.size();
	
	System.out.println("The total frames are "+numberOfTags);

	
	/*WebElement ele4 = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
	ele4.click();
	
	driver.switchTo().frame("mainpanel");
	driver.findElement(By.xpath("https://ui.freecrm.com/contacts")).click();
	*/
	
	
	
	
	
	
	
	
	
}
}