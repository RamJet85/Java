package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selectDropdowndemo {
	
	@Test
	public void Dropdown()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramakrishna.p\\Downloads\\chrome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		//Day
        WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select Days = new Select(Day);
		
		Days.selectByVisibleText("29");
		
		WebElement Selected_option = Days.getFirstSelectedOption();
		
		System.out.println("The selected text is "+Selected_option.getText());
		
		//Month
		WebElement month_dd = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select month = new Select(month_dd);
		
		month.selectByVisibleText("Sept");
		
		List<WebElement> month_time = month.getOptions();
		
		int size = month_time.size();
		
		System.out.println("The total months are "+size);
		
		for(WebElement ele:month_time)
		{
			String name = ele.getText();
			
			System.out.println("The each name of the month is "+name);
		}
		
		//year
        WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select Years = new Select(Year);
		
		Years.selectByVisibleText("1993");
	
		
		
		
	}

}
