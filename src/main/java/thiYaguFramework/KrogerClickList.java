package thiYaguFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

public class KrogerClickList {

	WebDriver driver;
	
	
	
	public KrogerClickList(WebDriver driver){
		this.driver = driver;
	}
	
	//Page Objects
	//By zipcodeTextArea = By.cssSelector("form[class^='pickup-store-search-field']");
	By zipcodeTextArea = By.xpath("//input[@name='store']");
	By zipcodeSubmitButton = By.cssSelector("form[class^='pickup-store-search-field']");
	
	
	public void EnterZipCode(String zipcode)
	{
		WebElement textarea = driver.findElement(zipcodeTextArea);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement textarea1 = (WebElement) js.executeScript("return document.evaluate('//input[@class='ng-pristine ng-valid ng-touched']', document, null, XPathResult.ANY_TYPE, null).singleNodeValue;");
		//js.executeScript("arguments[0].click();", textarea);
		//textarea.sendKeys("45458");
		List<WebElement> e = driver.findElements(By.name("store"));
		System.out.println(e.get(0));
		System.out.println(e.get(1));
		e.size();
		for (WebElement exp: e)
		{
			if (exp.isDisplayed())
			{
				exp.click();
				exp.sendKeys("45342");
				break;
			}
		}
		//js.executeScript("javascript: document.getElementsByClassName('pickup-store-search-field ng-pristine ng-valid')[0].children[1].removeAttribute('disabled')");
		//WebElement textbox = (WebElement) js.executeScript("document.getElementsByName('store')[0]");
		
		//js.executeScript("argument[0].removeAttribute('disabled');",textbox);
		
		//textbox.click();
		//textbox.sendKeys(zipcode);
		
		
		//e.get(0).click();
		
		
		//scroll to the bottom of the page
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//scroll to view the object 
		//js.executeScript("document.getElementsByClassName('youtube')[0].scrollIntoView()");
		
		//scroll to the top of the page 
		//js.executeScript("window.scrollTo(0,document.body.scrollTop)");
		//driver.findElement(By.name("store")).sendKeys(zipcode);
		
		//textarea.sendKeys(zipcode);
		
		
	}
	
	
	public void ClickSubmit()
	{
		//driver.findElement(zipcodeSubmitButton).submit();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("document.getElementsByName('store')[1].value='45459'");
		
		WebElement value = (WebElement)js.executeScript("return document.evaluate(\"//input[@type='submit']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue");
		if(value.isEnabled())
		{
			System.out.println("it is enabled");
		}
		if(value.isDisplayed())
				{
			System.out.println("it is Disabled");
		}
		value.submit();

		//js.executeScript("document.getElementsByClassName('pickup-store-search-field ng-valid ng-dirty ng-valid-parse')[0].children[1].click()");
	}
	
		
}
