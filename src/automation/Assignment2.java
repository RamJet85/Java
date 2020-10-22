package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.jar.asm.Handle;

public class Assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.talentzing.com/FreshersCorner/FreshersRegister.aspx");
		driver.findElement(By.xpath("//a[text()='FeedBack']")).click();
		driver.findElement(By.xpath("//a[text()='Terms & Conditions']")).click();
		for(String handle:driver.getWindowHandles())
		{
			System.out.println(handle);
		}

		
	}

}
