/*package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest2 {
	
	WebDriver driver;
	BaseTestData testdata;
	
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
		
		testdata = new BaseTestData("D:\\Automation\\Myprogram\\src\\DataDrivenTesting\\TestData\\Book1TestData.xlsx");
		
		int rows = testdata.getRowCount(0);
		
		Object[] data = new Object[rows];
		
		for(int i=0;i<rows;i++){
			
			data[i] = testdata.getData(0, i, 0);
		}
		
		return data;
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.close();
	}
	

}
*/