/*package DataDrivenTesting;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDatafromExcel2 {

	@Test
	public void ReadDatafromExcel() throws Exception{
		
		File source = new File("D:\\Automation\\ExcelData\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(source);
	
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowcount = sheet1.getLastRowNum();
		
		System.out.println("The total rowcount is "+rowcount);
		
		for(int i=0;i<rowcount;i++){
			
			String str = sheet1.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println("the total row's are "+str);
			
		}
		wb.close();
		}

}
*/