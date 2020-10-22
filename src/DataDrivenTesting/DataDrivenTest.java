package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		
	System.setProperty("webdriver.chrome.driver", "D:\\BrowserServers\\Browsers\\chromedriver_win32\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	}
	
	@Test(dataProvider="PIMSLogin")
	 
	 public void loginPIMS(String StaffID){
		driver.navigate().to("http://pimsqanew.raybiztech.com/");
		
		driver.findElement(By.xpath("//input[contains(@id,'txtStaffId')]")).sendKeys(StaffID);
		
		driver.findElement(By.xpath("//input[contains(@id,'txtStaffId')]")).sendKeys(Keys.ENTER);
		String str =driver.getTitle();
		System.out.println("The title is "+str);
		
	}
	@DataProvider(name="PIMSLogin")
	
	 public Object[] PassData(){
		
		Object[] data = new Object[3];
		
		data[0]= "9Y7/Y/GAT.";
		
		data[1]="naidu@10";

		data[2]="kc@10";
		
		return data;
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.close();
	}
	

}
