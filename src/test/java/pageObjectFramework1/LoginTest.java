package pageObjectFramework1;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import thiYaguFramework.HomePage;
import thiYaguFramework.TestBase;

public class LoginTest extends TestBase{
//Inheriting using extends for 
	
	
		
	@BeforeTest
	public void IntialSetUp() throws IOException{
		
		setup();
	}
	
	@Test
	public void LoginApp() throws IOException
	{
		//Oops Concept 
		//To access the method present in any class we need to create a object for that class and then call the 
		//methods of that class with the objects.
		
		//Creating Object means Invoking constructor method of that class ;so give driver HomePage(driver).
		
		
		HomePage LP = new HomePage(driver);
		LP.setUserID("test");
		LP.setPassword("test");
		
		
		LP.ClickSigninButton();
		
		LP.GetTitle();
		
		LP.ScrollToClickSignUp();
		
		LP.LaunchNewURL("www.google.com");
//		LP.AlertPopUpWindow();
		
		
	}
	
}

