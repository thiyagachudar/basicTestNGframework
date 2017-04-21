package thiYaguFramework;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.BINARY,new File("c:\\Program Files (x86) \\Mozilla Firefox\\firefox.exe").getAbsolutePath());
		
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.106:5566/wd/hub"),capabilities);

		driver.get("www.google.com");
		System.out.println(driver.getTitle());
	}

}
