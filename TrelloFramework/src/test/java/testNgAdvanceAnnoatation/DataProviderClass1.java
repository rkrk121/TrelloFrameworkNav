package testNgAdvanceAnnoatation;

import org.testng.annotations.DataProvider;

public class DataProviderClass1 
{
	@DataProvider
	public Object provideData()
	{
		Object[][] obj = new Object[3][5];
		
		obj[0][0] = "A";
		obj[0][1] = "Manual";
		obj[0][2] = "Automation";
		obj[0][3] = "Java";
		obj[0][4] = "Sql";
		
		obj[1][0] = "B";
		obj[1][1] = "Manual";
		obj[1][2] = "Automation";
		obj[1][3] = "Java";
		obj[1][4] = "Sql";
		
		obj[2][0] = "C";
		obj[2][1] = "Manual";
		obj[2][2] = "Automation";
		obj[2][3] = "Java";
		obj[2][4] = "Sql";
		
		return obj;
				
		
	}

}
