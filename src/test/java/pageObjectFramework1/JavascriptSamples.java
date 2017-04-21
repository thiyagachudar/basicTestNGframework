package pageObjectFramework1;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import thiYaguFramework.ClickListOrder;
import thiYaguFramework.TestBase;

public class JavascriptSamples extends TestBase {

	
	public void intialize() throws IOException{
		
		setup();
	}
	
	@Test
	public void openUrlwithdelay() throws Exception{
		
		ClickListOrder cl = new ClickListOrder(driver);
		cl.javascriptExample();
	}
	
}
