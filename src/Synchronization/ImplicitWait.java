package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\BrowserServers\\Browsers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		
		//wait for the required element
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		
		
		
		
	    
		
		
	
	}
	
	public static void sendKeys(WebDriver driver, WebElement element, int timeout,String value){
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		
		element.sendKeys(value);
		
	}

}
