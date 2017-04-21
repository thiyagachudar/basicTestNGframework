package BasicsAnotations;

import org.testng.annotations.Test;

public class DependencyAnnotation {

	@Test
	public void OpeningBrowser(){
		System.out.println("Execting Opening Browser");
	}
	
	@Test(dependsOnMethods={"OpeningBrowser"},alwaysRun=true)
	public void Login(){
		System.out.println("Execting loggin in ");
	}
	
	
	@Test(enabled=false)
	public void Login2(){
		System.out.println("Execting loggin 2 in ");
	}
	
	
	@Test(timeOut=2000)
	public void TimeoutRelated(){
		System.out.println("executing timeout -if exceeds more then 5 seconds it will not be implemented");
	}
	
	
}
