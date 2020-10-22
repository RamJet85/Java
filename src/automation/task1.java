package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserServers\\BrowserServers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		List<WebElement> Prices = driver.findElements(By.xpath("//td[text()='Analyst']/preceding-sibling::td[3]"));
		for(WebElement ele:Prices)
		{
			System.out.println(ele.getText());
		}
		

	}

}
