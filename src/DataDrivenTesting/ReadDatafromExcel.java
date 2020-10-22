/*package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDatafromExcel {
	
	
    WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		
	System.setProperty("webdriver.chrome.driver", "D:\\BrowserServers\\Browsers\\chromedriver_win32\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	}
	
	@Test
	public void ReadDatafromExcelsheet() throws Exception{
		//location of the excel (or) file specify the location of the excel file
		File src = new File("D:\\Automation\\ExcelData\\TestData.xlsx");

		//In case if you are using .xls file u need to use HSSfworkbook
		//I'll specify the file source in this FileInputstream class
		FileInputStream fis = new FileInputStream(src);
		//It will load the full worknook or excel sheet
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		//Cell means box 
		
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data from excel is "+data0);
		
        String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("Data from excel is "+data1);
		
		wb.close();
		
		
	}

}
*/