package pageObjectFramework1;

import java.io.IOException;

import lib.ExcelDataConfig;

import org.testng.annotations.Test;

public class ExcelDataTest {

	
	
	@Test
	public void LoginApp() throws IOException
	{
		//Oops Concept 
		//To access the method present in any class we need to create a object for that class and then call the 
		//methods of that class with the objects.
		
		//Creating Object means Invoking constructor method of that class ;so give driver HomePage(driver).
		
		ExcelDataConfig excel = new ExcelDataConfig("/Users/thiyagachudar/git/basicTestNGframework/TestData.xlsx");
		
		System.out.println("Excel data: "+excel.getData("Sheet1", 0, 0));
		
		
		/*HomePage LP = new HomePage(driver);
		LP.setUserID("test");
		LP.setPassword("test");
		
		
		LP.ClickSigninButton();
		
		LP.GetTitle();
		
		LP.ScrollToClickSignUp();
		
		LP.LaunchNewURL("www.google.com");
//		LP.AlertPopUpWindow();
		
		*/
	}
	
	
}
