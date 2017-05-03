package BasicsAnotations;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DataProviderExample {

	
	@Test
	public void createUserID(){
		System.out.println("Every Time this is run when all method");
	}
	
	
	@DataProvider
	public Object[][] getData(){
		
		//i stands for number of times to run, in this case 3
		//J stands for number of parameters to access,in this case 2 
		Object[][] data = new Object[3][2];
		data[0][0] = "abcd";
		data[0][1] = "xtz";
		
		data[1][0] = "abcd123";
		data[1][1] = "xtz123";
	
		data[2][0] = "3abcd123";
		data[2][1] = "3xtz123";
		return data;
	}
	
	@Test(dataProvider="getData")
	public void createID(String username,String id){
		System.out.println("UserID from data provider: "+ username);
		System.out.println("UserID from data provider: "+ id);
	}
	
	@Test
	@Parameters({"userID"})
	public void login(String user)
	{
		System.out.println("username"+ user);
	}
	
}
