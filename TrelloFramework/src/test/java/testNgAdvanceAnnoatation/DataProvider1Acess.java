package testNgAdvanceAnnoatation;

import org.testng.annotations.Test;

public class DataProvider1Acess 
{
	@Test(dataProvider="provideData",dataProviderClass=DataProviderClass1.class)
	
	public void acceptTheData(String Name,String skill01,String skill02,String skill03,String skill04)
	{
		System.out.println("Name:"+Name+" skill01:"+ skill01 +" skill02:"+skill02+" skill03: "+skill03+" skill04: "+skill04 );
	}
	
	
	

}
