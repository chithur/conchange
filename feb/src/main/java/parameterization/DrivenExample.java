package parameterization;

import org.testng.annotations.Test;

public class DrivenExample {

	
	@Test(dataProvider="abc")
	public void parameter(String username,String password)
	{
		
		System.out.println(username);
		System.out.println(password);
		
	}
	
	
}
