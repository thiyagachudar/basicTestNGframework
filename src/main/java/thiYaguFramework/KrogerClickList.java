package thiYaguFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

public class KrogerClickList {

	WebDriver driver;
	
	HomePage hp = new HomePage(driver);
	
	public KrogerClickList(WebDriver driver){
		this.driver = driver;
	}
	
	//Page Objects
	//By zipcodeTextArea = By.cssSelector("form[class^='pickup-store-search-field']");
	By zipcodeTextArea = By.xpath("//input[@name='store']");
	By zipcodeSubmitButton = By.cssSelector("form[class^='pickup-store-search-field']");
	
	
	public void EnterZipCode(String zipcode)
	{
		
				
		List<WebElement> e = driver.findElements(By.name("store"));
		System.out.println(e.get(0));
		System.out.println(e.get(1));
		e.size();
		for (WebElement exp: e)
		{
			if (exp.isDisplayed())
			{
				exp.click();
				exp.sendKeys(zipcode);
				break;
			}
		}
			
		
		//scroll to the bottom of the page
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//scroll to view the object 
		//js.executeScript("document.getElementsByClassName('youtube')[0].scrollIntoView()");
		
		//scroll to the top of the page 
		//js.executeScript("window.scrollTo(0,document.body.scrollTop)");
		//driver.findElement(By.name("store")).sendKeys(zipcode);
		
		//textarea.sendKeys(zipcode);
		
		
	}
	
	
	public void EnterZipCodeWithJS(String zipcode)
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement textarea1 = (WebElement) js.executeScript("return document.evaluate(\"//input[@name='store' and @data-qa='pickup store search input']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue");
				
		if(textarea1.isEnabled()){
			System.out.println("textbox is enabled");
			textarea1.sendKeys(zipcode);
		}
		else{
			
			System.out.println("textbox not found");
		}
			
		
		
		
	}
	
	
	public void ClickSubmit()
	{
		//driver.findElement(zipcodeSubmitButton).submit();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("document.getElementsByName('store')[1].value='45459'");
		
		WebElement value = (WebElement)js.executeScript("return document.evaluate(\"//input[@type='submit' and @ng-disabled='!storeSearchTerm']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue");
		if(value.isEnabled())
		{
			System.out.println("it is enabled");
			value.click();
		}
		if(value.isDisplayed())
				{
			System.out.println("it is Disabled");
		}
		
		
		//js.executeScript("document.getElementsByClassName('pickup-store-search-field ng-valid ng-dirty ng-valid-parse')[0].children[1].click()");
	}
	
		
}
