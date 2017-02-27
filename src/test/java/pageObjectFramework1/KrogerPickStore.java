package pageObjectFramework1;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import thiYaguFramework.HomePage;
import thiYaguFramework.KrogerClickList;
import thiYaguFramework.TestBase;

public class KrogerPickStore  extends TestBase
{

	
	@BeforeTest
	public void IntialSetUp() throws IOException{
		
		setup();
	}
	
	@Test
	public void SearchStore()
	{
		//Oops Concept 
		//To access the method present in any class we need to create a object for that class and then call the 
		//methods of that class with the objects.
		
		//Creating Object means Invoking constructor method of that class ;so give driver HomePage(driver).
		
		
		KrogerClickList Krog = new KrogerClickList(driver);
		Krog.EnterZipCodeWithJS("45459");
		Krog.ClickSubmit();
		
		
		
		
		
	}
}
