package lib;

import java.io.File;
import java.io.FileInputStream;


//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class ReadFromExcel {
@Test	
		public void Readdata() throws Exception
		{
			
			File src = new File("C:\\JavaProjects\\App\\thiYaguProject\\TestData.xlsx");
			FileInputStream fls = new FileInputStream(src);
			
			XSSFWorkbook wb = new XSSFWorkbook(fls);
			
			//when .xls HSSFWorkbook should be used is used the below is to be instantiated .
			//HSSFWorkbook wb = new HSSFWorkbook(fls)
			
			XSSFSheet Sheet1 = wb.getSheet("Sheet1");
			
			int rowcount = Sheet1.getLastRowNum();
			
					for (int i=0;i<rowcount;i++){
						
						String testData = Sheet1.getRow(i).getCell(0).getStringCellValue();
						System.out.println(testData);
					}
					
			wb.close();
			
		}
		
		
		
		
	

}
