package thiYaguFramework;

import java.io.FileInputStream;
import java.io.InputStream;
import org.openqa.selenium.JavascriptExecutor;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBase {
	public static WebDriver driver = null;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public void setup() throws IOException
	{
		//dot properties files can be access like this 
		Properties p=new Properties();
//		FileInputStream file = new FileInputStream("/thiYaguProject/src/main/java/thiYaguFramework/global.properties");
		InputStream file = TestBase.class.getResourceAsStream("global.properties");
		
		p.load(file);
//		p.load(TestBase.class.getResourceAsStream("/global.properties"));
		
		//System.out.println(p.getProperty("browser"));
		if(p.getProperty("browser").contains("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\JavaProjects\\App\\thiYaguProject\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(p.getProperty("browser").contains("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\JavaProjects\\App\\thiYaguProject\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else{
			//IE
		}
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	
	
}
