package thiYaguFramework;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ClickListOrder extends TestBase {

	// WebDriver driver ;

	// By emailID = By.id("emailAddress");

	@FindBy(how = How.ID, using = "emailAddress")
	private WebElement emailID;

	Function<WebDriver, WebElement> FindElementEmailID = new Function<WebDriver, WebElement>() {

		public WebElement apply(WebDriver driver) {

			return driver.findElement((By) emailID);
		}

	};

	Predicate<WebDriver> FindPredicateElementEmailID = new Predicate<WebDriver>() {

		public boolean test(WebDriver driver) {

			return driver.findElements((By) emailID).size() > 0;
		}

	};

	public void EnterEmailID(String email) {
		// WebDriverWait waitdriver = new WebDriverWait(driver,20);

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).pollingEvery(500, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class).withTimeout(30, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.elementToBeClickable(By.id("emailAddress")));

		driver.findElement((By) emailID).sendKeys(email);
	}

	public void javascriptExample() throws Exception {

		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeAsyncScript("var callback = arguments[arguments.length - 1]; window.setTimeout(callback, 25000);");

		driver.get("http://www.google.com");
	}
}
