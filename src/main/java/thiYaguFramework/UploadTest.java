package thiYaguFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UploadTest {

	FirefoxDriver driver = new FirefoxDriver();
	public UploadTest(){
		
		
		driver.get("http://tinypic.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	
	public void LoadFile(){
		
		WebElement ele = driver.findElement(By.xpath(""));
		
		
		
		//jsut to see Select statment 
		Select selectElement = new Select(ele);
		selectElement.selectByVisibleText("xyz");
		selectElement.selectByValue("1");
	}
	
	
}
