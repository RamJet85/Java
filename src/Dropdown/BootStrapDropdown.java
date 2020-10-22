package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BootStrapDropdown {
	
	@Test
	
	public void productbasics() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserServers\\Browsers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://pimsqa.raybiztech.com");
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='txtStaffId']"));
		
		ele1.sendKeys("9Y7/Y/GAT.");
		
		ele1.sendKeys(Keys.ENTER);
		
		String title = driver.getTitle();
		
		System.out.println("The title is "+title);
		
		SoftAssert assertion = new SoftAssert();
		
		assertion.assertEquals(title, "DASHBOARD");
		
		assertion.assertAll();
		
		WebElement ele2 = driver.findElement(By.xpath("//span[contains(text(),'ADD NEW')]"));
		
		ele2.click();
		
		WebElement ele3 = driver.findElement(By.xpath("//input[@id='txtFullDesc']"));
		
		ele3.sendKeys("testNG environment");
		
		WebElement ele4 = driver.findElement(By.xpath("//input[@id='txtPOSDesc']"));
		
		ele4.sendKeys("Pos TestEnvironment text");
		
		WebElement ele5 = driver.findElement(By.xpath("//a[@class='ui-button ui-widget ui-button-icon-only custom-combobox-toggle ui-corner-right']"));
		
		ele5.click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='PGAutocomplete']//ul[@id='ui-id-1']//li//div"));
		
		int size = list.size();
		
		System.out.println("The size is "+size);
		
		for(int i=0;i<size;i++){
			
			String content = list.get(i).getText();
			
			System.out.println("The product group value is "+content);
			
			if(list.get(i).getText().contains("8-Baby Wipes"))
			{
				list.get(i).click();
				
				break;
			}
			
		
			}
			
			
			
	}
		
	}
	
	

