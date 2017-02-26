package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	FileInputStream fls;
	XSSFWorkbook wb;
	XSSFSheet Sheet1;
	public ExcelDataConfig(String excelPath){
		
		try 
		{
			
			File src = new File(excelPath);
			fls = new FileInputStream(src);
			wb = new XSSFWorkbook(fls);
			
		
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public String getData(String sheetName,int row,int column){
		
		Sheet1 = wb.getSheet(sheetName);
		String data = Sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}

}
