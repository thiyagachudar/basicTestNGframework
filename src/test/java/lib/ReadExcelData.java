package lib;

import java.io.File;
import java.io.FileInputStream;


//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class ReadExcelData {
@Test	
		public void Readdata() throws Exception
		{
			
			File src = new File("C:\\JavaProjects\\App\\thiYaguProject\\TestData.xlsx");
			FileInputStream fls = new FileInputStream(src);
			
			XSSFWorkbook wb = new XSSFWorkbook(fls);
			
			//when .xls HSSFWorkbook should be used is used the below is to be instantiated .
			//HSSFWorkbook wb = new HSSFWorkbook(fls)
			
			XSSFSheet sheet1 = wb.getSheet("Sheet1");
			
			sheet1.getRow(0).createCell(2).setCellValue("pass");
			
			wb.close();
			
		}
		
		
		
		
	

}
