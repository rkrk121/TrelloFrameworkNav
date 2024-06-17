package screenshot_testing;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

public class Screenshot extends BaseClass implements ITestListener 
{
	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Failed Method");
		try 
		{
			failed(result.getMethod().getMethodName());
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}

}
