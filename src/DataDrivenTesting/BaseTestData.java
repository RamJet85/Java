/*package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseTestData {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public BaseTestData(String excelpath){
		try {
			File source = new File(excelpath);
			
			FileInputStream fis = new FileInputStream(source);

			wb = new XSSFWorkbook(fis);
			
		}  catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	 }

    //read the data from excel
	public String getData(int sheetnumber,int row,int column){ 
		
		sheet1 = wb.getSheetAt(sheetnumber);
		
		String st = sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return st;
			
	}
	
	//read no of rows in the excel
	public int getRowCount(int sheetIndex){
		
		int rowcount = wb.getSheetAt(sheetIndex).getLastRowNum();
		
		rowcount= rowcount+1;
		
		return rowcount;
		
		
	}

}
    

*/