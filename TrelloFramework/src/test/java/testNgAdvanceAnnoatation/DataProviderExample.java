package testNgAdvanceAnnoatation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider = "provideTheData")
	public void script(String name, String age, String num) {
		System.out.println(" name" +name  +" age" +age +" num" +num);
	}
	@DataProvider
	public Object provideTheData() {
		Object obj[][]=new Object[4][3];
		obj[0][0] = "abc";
		obj[0][1]="25";
		obj[0][2]= "56783";
		
		obj[1][0] = "mno";
		obj[1][1]="26";
		obj[1][2]= "567834";
		
		obj[2][0] = "lmo";
		obj[2][1]="27";
		obj[2][2]= "567835";
		
		obj[3][0] = "xyz";
		obj[3][1]="28";
		obj[3][2]= "567836";
		
		
		return obj;
	}
	
	

}
