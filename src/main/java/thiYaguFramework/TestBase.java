package thiYaguFramework;

import java.io.InputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	public static WebDriver driver = null;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	//dot properties files can be access like this 
			Properties p=new Properties();
//			FileInputStream file = new FileInputStream("/thiYaguProject/src/main/java/thiYaguFramework/global.properties");
			InputStream file = TestBase.class.getResourceAsStream("global.properties");
			
			
	public void setup() throws IOException
	{
		
		
		p.load(file);
//		p.load(TestBase.class.getResourceAsStream("/global.properties"));
		
		//System.out.println(p.getProperty("browser"));
		if(p.getProperty("browser").contains("firefox"))
		{
			
			//System.setProperty("webdriver.gecko.driver","C:\\JavaProjects\\App\\thiYaguProject\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(p.getProperty("browser").contains("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","chromedriver");
			driver = new ChromeDriver();
		}
		else{
			//IE
		}
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void enterURL() throws IOException{
		
		p.load(file);
		driver.get(p.getProperty("url"));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	
	public void WaitUntilElementIsDiplayed(By element){
		
		WebDriverWait wait = new WebDriverWait(driver,15,100);
		WebElement myElement = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		
		
	}
	
	public static ExpectedCondition<Boolean>jQueryAJAXCallsHaveCompleted()
	{
		return new ExpectedCondition<Boolean>()
		{

			public Boolean apply(WebDriver driver)
			{
				// TODO Auto-generated method stub
				return (Boolean) ((JavascriptExecutor)driver).executeScript("return (window.jQuery!=null) && (jQuery.active == 0);");
								
			}
			
			
		};
		
		
	}
	
	public static ExpectedCondition<Boolean>angularHasFinshedProcessing(){
		return new ExpectedCondition<Boolean>()
				{

					public Boolean apply(WebDriver driver) {
						
//						return Boolean.valueOf(((JavascriptExecutor)driver).executeScript("return(Window).injector() !== undefined) && (angular.element(document).injector() ! == undefined)&& (angular.element(document).injector().get('$http').pendingRequest.length === 0)").toString());
						return Boolean.valueOf(((JavascriptExecutor)driver).executeScript("return (window.angular !== undefined) && (angular.element(document).injector() !== undefined) && (angular.element(document).injector().get('$http').pendingRequests.length === 0)").toString());
					}
			
						
			
				};
				
	}
	public String getHiddenText(WebElement element){
		
		JavascriptExecutor js = (JavascriptExecutor)((RemoteWebElement)element).getWrappedDriver();
		
		return (String) js.executeScript("return arguments[0].text", element);
		
	}
	
	public void drag(WebElement source,WebElement target){
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target);
		
		String web = driver.getWindowHandle();
		
		
	}
	
	
	
	
	
	
}
