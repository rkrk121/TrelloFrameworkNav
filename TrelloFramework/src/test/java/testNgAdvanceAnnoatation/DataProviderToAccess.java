package testNgAdvanceAnnoatation;

import org.testng.annotations.Test;

public class DataProviderToAccess  {
	
	
	@Test(dataProvider = "provideTheData", dataProviderClass = DataProviderclass.class)
	
	public void script(String name, String age, String num) {
		System.out.println(" name" +name  +" age" +age +" num" +num);
	}

}
