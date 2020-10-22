package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samplejava {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserServers\\BrowserServers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www-qat.startech-labs.com/");
		//driver.findElementByXPath("//span[text()='Log In / Create Account']").click();
		driver.findElement(By.xpath("//span[text()='Log In / Create Account']")).click();
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Testuser@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Ramkrishna@10");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='show-for-medium']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.quit();
		
		
		
		

	}

}
