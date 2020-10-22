package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class task3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserServers\\BrowserServers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		System.out.println(driver.findElements(By.xpath("//table/tbody/tr/td[position()=5 and text()='Analyst']")).size());
	}

}
