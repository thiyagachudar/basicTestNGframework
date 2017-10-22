package pageObjectFramework1;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;
import thiYaguFramework.ClickListOrder;
import thiYaguFramework.KrogerClickList;
import thiYaguFramework.TestBase;

public class KrogerPickStore  extends TestBase
{

	
	@BeforeTest
	public void IntialSetUp() throws IOException{
		
		setup();
	}
	
	
	public void SearchStore()
	{
		//Oops Concept 
		//To access the method present in any class we need to create a object for that class and then call the 
		//methods of that class with the objects.
		
		//Creating Object means Invoking constructor method of that class ;so give driver HomePage(driver).
		
		ExcelDataConfig data = new ExcelDataConfig("/Users/thiyagachudar/git/basicTestNGframework/TestData.xlsx");
		String zipcode = data.getData("TestData",1, 1);
		KrogerClickList Krog = new KrogerClickList(driver);
		
		
		Krog.EnterZipCodeWithJS(zipcode);
		
		Krog.ClickSubmit();
		
		Reporter.log("User is Logged in to the application");
		
		
		
	}
	@Test
	public void KrogerLogin(){
		
		
		ClickListOrder cl = new ClickListOrder(driver);
		cl.LoginEmailId("thiyagu.ny@gmail.com");
		Reporter.log("User is Logged in to the application");
		
	}
}
