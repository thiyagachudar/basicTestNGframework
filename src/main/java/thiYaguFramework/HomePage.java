package thiYaguFramework;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HomePage {

	WebDriver driver;

	public static By usernameTextBox = By.id("email");
	By passwordTextBox = By.id("pass");
	By loginButton = By.xpath("//label[@id='loginbutton']");
	By signUp = By.className("_xkv");
	//javascript for finding objects;
	
//	WebElement usernametextbox = null;
//	usernametextbox = (WebElement) js.executeScript("return document.getElementById('email');",usernametextbox);
	
	//constructor of the HomePage Class.
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void setUserID(String username)
	{
		driver.findElement(usernameTextBox).sendKeys(username);
	}
	
	public void setPassword(String Password)
	{
		driver.findElement(passwordTextBox).sendKeys(Password);
	}
	public void ClickSigninButton()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement lButton = driver.findElement(loginButton);
		
		js.executeScript("arguments[0].click();", lButton);
		
	}
	public void AlertPopUpWindow(){
				
//		js.executeAsyncScript(", arg1)
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('hello world');");
	}
	
	public String GetTitle()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String titleName = js.executeScript("return document.title;").toString();
		System.out.println("Browser Title :" + titleName);
		
		return titleName;
		
	}
	
	public String GetDomain()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String domainName = js.executeScript("return document.domain;").toString();
		System.out.println("Browser Title :" + domainName);
		return domainName;
		
	}
	
	public String GetURL()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("Browser Title :" + url);
		return url;
		
	}
	public void LaunchNewURL(String url)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		js.executeScript("window.location ='"+url+"'");
	}
	
	public void ScrollToClickSignUp()
	{
		WebElement scrollID = driver.findElement(signUp);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("document.getElementsByClassName(scrollID).scrollIntoView(true);");
		js.executeScript("arguments[0].click();", scrollID);
		
	}
	public void WaitForElement(WebElement ElementName){
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(ElementName));
		wait.until(ExpectedConditions.jsReturnsValue(""));
	}
	
	public void GetScreenShot() throws Exception{
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("C:\\JavaProjects\\App\\thiYaguProject\\ScreenShot\\scrrnshot.png"));
	}
	
	
}
