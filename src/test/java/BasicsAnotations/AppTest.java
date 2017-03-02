package BasicsAnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class AppTest {
	
	
	@BeforeMethod
	public void createUserID(){
		System.out.println("Every Time this is run when all method");
	}
	
	@BeforeTest
	public void RunEveryTest(){
		System.out.println("Run EveryTime when the any test run");
	}
	
	/*@Test
	public void OpenBrowser()
	{
		System.out.println("Opening the Browser");
		WebDriver driver = new FirefoxDriver();
		driver.get("www.google.com");
				
	}*/
	
	@Test
	@Parameters({"username"})
	public void GetUserName(String name)
	{
		System.out.println("Got this form the xml file: "+ name);
		//System.out.println("Got this form the xml file: "+ password);
				
	}
	
	
	
	@Test
	public void BookTicket(){
		System.out.println("Book Ticket");
	}

}
