package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://pimsqa.raybiztech.net");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.ENTER);
	   
	   String str = driver.findElement(By.xpath("//h1[contains(text(),'WELCOME TO DASHBOARD')]")).getText();
	   if (str.equals("WELCOME TO DASHBOARD"))
	   {
		   System.out.println("Text is avaiable :"+str);
	   }
	   else
		   System.out.println("Text is not available :"+str);
	   
		String str1 = driver.findElement(By.xpath("//a[@href='/Home/Logout']")).getAttribute("href");
		driver.findElement(By.xpath("//a[@href='/Home/Logout']")).click();
		System.out.println(str1);
		driver.close();
	}

}

