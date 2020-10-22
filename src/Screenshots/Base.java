package Screenshots;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	
	public static WebDriver driver;
	
	public static void Initialization(){
		
        System.setProperty("webdriver.chrome.driver","D:\\BrowserServers\\Browsers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.co.in/");
	} 

	public void failed(){
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		
		
	}
}
